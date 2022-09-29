package com.djt.service;

import com.djt.common.PageHelper;
import com.djt.common.R;
import com.djt.domain.Dish;
import com.djt.domain.DishDto;

import java.util.List;

public interface DishService {

    public R<String> save(DishDto dishDto);

    public R<PageHelper> selctByPage(int page,int pageSize,String name);

    R<List<DishDto>> selctById(Long id);
    R<List<DishDto>> selctByCategoryId(DishDto dishDto);



}
