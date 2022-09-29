package com.djt.controller;

import com.djt.common.PageHelper;
import com.djt.common.R;
import com.djt.domain.SetmealDish;
import com.djt.domain.SetmealDto;
import com.djt.service.SetmalService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/setmeal")
public class SetmealController {

    @Resource
    SetmalService setmalService;
    @PostMapping
    public R<String> save(HttpServletRequest request,@RequestBody SetmealDto setmealDto){
        Long emId = (Long) request.getSession().getAttribute("employee");
        setmealDto.setCreateTime(new Date());
        setmealDto.setUpdateTime(new Date());
        setmealDto.setUpdateUser(emId);
        setmealDto.setCreateUser(emId);
        setmealDto.setIsDeleted(0);
        List<SetmealDish> setmealDishes = setmealDto.getSetmealDishes();
      for (SetmealDish setmealDish:setmealDishes){
          setmealDish.setCreateTime(new Date());
          setmealDish.setUpdateTime(new Date());
          setmealDish.setUpdateUser(emId);
          setmealDish.setCreateUser(emId);
          setmealDish.setIsDeleted(0);
          setmealDish.setSort(0);
      }
        R<String> save = setmalService.save(setmealDto);
      return save;
    }

    @GetMapping("/page")
    public R<PageHelper> selectByPage(int page,int pageSize,String name){
     return    setmalService.selectByPage(page,pageSize,name);
    }
    @DeleteMapping
    public R<String> delete(@RequestParam List<Long> ids){
        R<String> stringR = setmalService.delteByIds(ids);
        return stringR;

    }
}
