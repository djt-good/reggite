package com.djt.mapper;

import com.djt.domain.Dish;
import com.djt.domain.DishFlavor;
import com.djt.general.GeneralDAO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DishFlavorMapper extends GeneralDAO<DishFlavor> {
}