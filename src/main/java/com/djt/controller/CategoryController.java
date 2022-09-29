package com.djt.controller;

import com.djt.common.PageHelper;
import com.djt.common.R;
import com.djt.domain.Category;
import com.djt.mapper.CategoryMapper;
import com.djt.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Resource
    CategoryService categoryService;

    @Resource
    CategoryMapper categoryMapper;
    @PostMapping
    public R<String> insertCategory(HttpServletRequest request, @RequestBody Category category){
        Long empId = (Long) request.getSession().getAttribute("employee");
        category.setCreateTime(new Date());
        category.setUpdateTime(new Date());
        category.setCreateUser(empId);
        category.setUpdateUser(empId);
        R<String> stringR = categoryService.addCategory(category);
        return stringR;
    }
    @GetMapping("/page")
    public R<PageHelper> selectByPage(Integer page,Integer pageSize){
        R<PageHelper> byPage = categoryService.findByPage(page, pageSize);
        return byPage;
    }

   @PutMapping
    public R<String> update(@RequestBody Category category,HttpServletRequest request){
       Long empId = (Long) request.getSession().getAttribute("employee");
//       category.setCreateTime(new Date());
       category.setUpdateTime(new Date());
//       category.setCreateUser(empId);
       category.setUpdateUser(empId);
       R<String> stringR = categoryService.updateCategory(category);
       return stringR;
    }
    @DeleteMapping
    public R<String> delete(Long ids){
        R<String> stringR = categoryService.daleteById(ids);

        return stringR;
    }

    @GetMapping("/list")
    public R<List<Category>> selectByTypeId(Category category){
        R<List<Category>> listR = categoryService.selectByType(category.getType());
        return listR;
    }

    @GetMapping("/lis")
    public R<List<Category>> selectByTypeId2(){
        List<Category> categories = categoryMapper.selectAll();

        return new R<List<Category>>(1,"success",categories,null);
    }

}
