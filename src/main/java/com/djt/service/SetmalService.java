package com.djt.service;

import com.djt.common.PageHelper;
import com.djt.common.R;
import com.djt.domain.SetmealDto;

import java.util.List;

public interface SetmalService {
    public R<String>  save(SetmealDto setmealDto);
    public R<PageHelper> selectByPage(int page,int pageSize,String name);

    R<String> delteByIds(List<Long> ids);
}
