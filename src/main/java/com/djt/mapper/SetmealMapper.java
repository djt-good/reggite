package com.djt.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.djt.common.PageHelper;
import com.djt.common.R;
import com.djt.domain.DishDto;
import com.djt.domain.Setmeal;
import com.djt.domain.SetmealDto;
import com.djt.general.GeneralDAO;

import java.util.List;

public interface SetmealMapper extends GeneralDAO<Setmeal> {
    public List<SetmealDto> selectByPage(int start, int pageSize, String  name);
}