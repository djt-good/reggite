package com.djt.service.impl;

import com.djt.common.PageHelper;
import com.djt.common.R;
import com.djt.domain.Dish;
import com.djt.domain.DishDto;
import com.djt.domain.DishFlavor;
import com.djt.mapper.DishFlavorMapper;
import com.djt.mapper.DishMapper;
import com.djt.service.DishService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DishServiceImpl implements DishService {

    @Resource
    DishMapper dishMapper;
    @Resource
    DishFlavorMapper dishFlavorMapper;

    @Override
    @Transactional
    public R<String> save(DishDto dishDto) {
        int insert = dishMapper.insertUseGeneratedKeys(dishDto);
        Long id = dishDto.getId();
        List<DishFlavor> flavors = dishDto.getFlavors();
        for (int i = 0; i < flavors.size(); i++) {
            flavors.get(i).setDishId(id);
        }

        if (insert > 0) {
            int i = dishFlavorMapper.insertList(flavors);
            if (i > 0) {
                return new R<>(1, "添加成功！！", null, null);
            }
        }
        return new R<>(0, "添加失败！！", null, null);
    }

    @Override
    public R<PageHelper> selctByPage(int page, int pageSize, String name) {
        int start = (page - 1) * pageSize;
        Example example = new Example(Dish.class);
        Example.Criteria criteria = example.createCriteria();
        int count = dishMapper.selectCountByExample(example);
        List<DishDto> dishes = dishMapper.selectByPage(start, pageSize, name);
        int total = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
        PageHelper<DishDto> pageHelper = new PageHelper<>(count, total, dishes);

        return new R<>(1, "success", pageHelper, null);
    }

    @Override
    public R<List<DishDto>> selctById(Long id) {
     List<DishDto>  dishDtos =  dishMapper.selectByid(id);
        return new R<>(1,"success",dishDtos,null);
    }

    @Override
    public R<List<DishDto>> selctByCategoryId(DishDto dishDto) {
        List<DishDto> dishDtos = dishMapper.selectCategoryId2(dishDto.getCategoryId());
        return new R<>(1,"success",dishDtos,null);
    }

}
