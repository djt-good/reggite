package com.djt.mapper;

import com.djt.common.R;
import com.djt.domain.Category;
import com.djt.general.GeneralDAO;

import java.util.List;

public interface CategoryMapper extends GeneralDAO<Category> {
    public List<Category> selectByPage(int start, int pageSize);
}