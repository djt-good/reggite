package com.djt.service;

import com.djt.common.PageHelper;
import com.djt.common.R;
import com.djt.domain.Category;
import com.djt.domain.Employee;

import java.util.List;

public interface CategoryService {

    public R<String> addCategory(Category category);
    public R<PageHelper> findByPage(int page,int pageSize);
    public R<String> updateCategory(Category category);

    R<String> daleteById(Long id);

    R<List<Category>> selectByType(int type);
}
