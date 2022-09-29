package com.djt.service.impl;

import com.djt.common.CustomException;
import com.djt.common.PageHelper;
import com.djt.common.R;

import com.djt.domain.Setmeal;
import com.djt.domain.SetmealDish;
import com.djt.domain.SetmealDto;
import com.djt.mapper.SetmealDishMapper;
import com.djt.mapper.SetmealMapper;
import com.djt.service.SetmalService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SetmalServiceImpl implements SetmalService {
    @Resource
    SetmealMapper setmealMapper;
    @Resource
    SetmealDishMapper setmealDishMapper;
    @Override
    @Transactional
    public R<String> save(SetmealDto setmealDto) {
        Long id = Long.valueOf(setmealMapper.insertUseGeneratedKeys(setmealDto));
        Long id1 = setmealDto.getId();

        List<SetmealDish> setmealDishes = setmealDto.getSetmealDishes();
        for (int i =0;i <setmealDishes.size();i++){
            setmealDishes.get(i).setSetmealId(id1);
        }
        int i = setmealDishMapper.insertList(setmealDishes);

        return new R<String>(1,"success",null,null);
    }

    @Override
    public R<PageHelper> selectByPage(int page, int pageSize, String name) {
        int start = (page - 1) * pageSize;
        Example example = new Example(Setmeal.class);
        Example.Criteria criteria = example.createCriteria();
        int count = setmealMapper.selectCountByExample(example);
        List<SetmealDto> dishes = setmealMapper.selectByPage(start, pageSize, name);
        int total = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
        PageHelper<SetmealDto> pageHelper = new PageHelper<>(count, total, dishes);

        return new R<>(1, "success", pageHelper, null);
    }

    @Override
    @Transactional
    public R<String> delteByIds(List<Long> ids) {
        Example example = new Example(Setmeal.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id",ids);
        criteria.andEqualTo("status",1);
        List<Setmeal> setmeals = setmealMapper.selectByExample(example);
        if (setmeals.size() >0){
            throw new CustomException("在售不能删除");
        }else {
            Example example1 = new Example(Setmeal.class);
            Example.Criteria criteria1 = example1.createCriteria();
            criteria1.andIn("id",ids);

            int i = setmealMapper.deleteByExample(example1);

            Example example2 = new Example(SetmealDish.class);
            Example.Criteria criteria2 = example2.createCriteria();
            criteria2.andIn("setmealId",ids);

            int i1 = setmealDishMapper.deleteByExample(example2);
            return new R<>(1,"success",null,null);
        }

    }
}
