package com.djt.controller;

import com.djt.common.PageHelper;
import com.djt.common.R;
import com.djt.domain.Dish;
import com.djt.domain.DishDto;
import com.djt.domain.DishFlavor;
import com.djt.service.DishService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/dish")
public class DishController {


    @Resource
    DishService dishService;

    @PostMapping
    public R<String> save(HttpServletRequest request, @RequestBody DishDto dishDto) {
        Long emId = (Long) request.getSession().getAttribute("employee");
        dishDto.setCreateTime(new Date());
        dishDto.setUpdateTime(new Date());
        dishDto.setCreateUser(emId);
        dishDto.setUpdateUser(emId);
        dishDto.setSort(0);
        dishDto.setIsDeleted(0);
        for (DishFlavor flavor : dishDto.getFlavors()) {
            flavor.setCreateTime(new Date());
            flavor.setUpdateTime(new Date());
            flavor.setCreateUser(emId);
            flavor.setUpdateUser(emId);
           flavor.setIsDeleted(0);
        }

        R<String> save = dishService.save(dishDto);
        return save;
    }


    @GetMapping("/page")
    public R<PageHelper> selectByPage(Integer page, Integer pageSize,String name){
        R<PageHelper> pageHelperR = dishService.selctByPage(page, pageSize, name);
        return pageHelperR;
    }


    @GetMapping("{id}")
    public R<List<DishDto>> seelctById(@PathVariable("id") Long id){
        R<List<DishDto>> listR = dishService.selctById(id);
        return listR;
    }

    @GetMapping("/list")
    public R<List<DishDto>> selctBycategory(DishDto dishDto){
        R<List<DishDto>> listR = dishService.selctByCategoryId(dishDto);
        return listR;
    }
}
