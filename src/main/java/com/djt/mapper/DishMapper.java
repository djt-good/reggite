package com.djt.mapper;

import com.djt.domain.Dish;
import com.djt.domain.DishDto;
import com.djt.general.GeneralDAO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DishMapper extends GeneralDAO<Dish> {
    public List<DishDto> selectByPage(@Param("start")int  start, @Param("pageSize") int PageSize, @Param("name") String name);

    List<DishDto> selectByid(Long id);
    List<DishDto> selectCategoryId2(Long caregoryId);
}