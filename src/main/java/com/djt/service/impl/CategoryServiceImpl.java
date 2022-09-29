package com.djt.service.impl;

import com.djt.common.CustomException;
import com.djt.common.PageHelper;
import com.djt.common.R;
import com.djt.domain.Category;
import com.djt.domain.Dish;
import com.djt.domain.Employee;
import com.djt.domain.Setmeal;
import com.djt.mapper.CategoryMapper;
import com.djt.mapper.DishMapper;
import com.djt.mapper.SetmealMapper;
import com.djt.service.CategoryService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    CategoryMapper categoryMapper;
    @Resource
    DishMapper dishMapper;
    @Resource
    SetmealMapper setmealMapper;
    @Override
    public R<String> addCategory(Category category) {
        int insert = categoryMapper.insert(category);
        if (insert >0){
            return  new R<String>(1,"添加成功！！",null,null);
        }
        return  new R<String>(0,"添加失败！！",null,null);
    }

    @Override
    public R<PageHelper> findByPage(int page, int pageSize) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        int start = (page - 1) * pageSize;
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        int count = categoryMapper.selectCountByExample(example);
        List<Category> categories = categoryMapper.selectByPage(start, pageSize);
        System.out.println(categories);
        int total = count % pageSize ==0 ? count/pageSize:count/pageSize+1;
        PageHelper<Category> employeePageHelper = new PageHelper<Category>(count, total, categories);

        R<PageHelper> success = new R<>(1, "success", employeePageHelper, null);
        System.out.println(success);
        return success;
    }

    @Override
    public R<String> updateCategory(Category category) {
        int i = categoryMapper.updateByPrimaryKeySelective(category);
        if (i >0){
            return  new R<String>(1,"修改成功！！",null,null);
        }
        return  new R<String>(0,"修改失败！！",null,null);
    }

    @Override
    public R<String> daleteById(Long id) {
        Example example = new Example(Dish.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("categoryId", id);
        List<Dish> dishes = dishMapper.selectByExample(example);
        if (dishes.size() >0){

            throw new CustomException("关联了菜品，不能删除！");
        }


        Example example1 = new Example(Setmeal.class);
        Example.Criteria criteria1 = example1.createCriteria();
        criteria.andEqualTo("categoryId", id);
        List<Setmeal> setmeals = setmealMapper.selectByExample(example1);
        if (setmeals.size() >0){
            throw new CustomException("关联了套餐，不能删除！");
        }

        int i = categoryMapper.deleteByPrimaryKey(id);
        if (i >0){
            return  new R<String>(1,"删除成功！！",null,null);
        }
        return  new R<String>(0,"删除失败！！",null,null);
    }

    @Override
    public R<List<Category>> selectByType(int type) {
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.orEqualTo("type",type);
        List<Category> select = categoryMapper.selectByExample(example);

        return new R<List<Category>>(1,"success",select,null);
    }

}
