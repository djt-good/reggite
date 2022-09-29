package com.djt.controller;

import com.djt.common.PageHelper;
import com.djt.common.R;
import com.djt.domain.Employee;
import com.djt.service.EmployeeService;
import org.springframework.http.HttpRequest;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/employee")
public class EmployController {

    @Resource
    EmployeeService employeeService;
    @PostMapping("/login")
    public R<Employee> login(HttpServletRequest  request, @RequestBody Employee employee){
        R<Employee> login = employeeService.login(employee);
        request.getSession().setAttribute("employee",login.getData().getId());
        System.out.println(login.getData());
        return login;
    }

    @PostMapping("/logout")
    public R<Employee> logout(HttpServletRequest request){
        //清理Session中保存的当前登录员工的id
        request.getSession().removeAttribute("employee");
        return new R<>(1,"退出成功！！", null,null);
    }


    @PostMapping
    public R<String> add(HttpServletRequest request,@RequestBody Employee employee){
      employee.setCreateTime(new Date());
      employee.setUpdateTime(new Date());
      employee.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));

     Long empId = (Long) request.getSession().getAttribute("employee");
     employee.setCreateUser(empId);
      employee.setUpdateUser(empId);
        R<String> stringR = employeeService.addEmployee(employee);
        return stringR;
    }


    @GetMapping("/page")
    public R<PageHelper> page(Integer page,Integer pageSize,String name){
        R<PageHelper> pageHelperR = employeeService.selectBypage(page, pageSize, name);
        return pageHelperR;
    }

    @PutMapping
    public R<String> update(HttpServletRequest request,@RequestBody Employee employee){
        Long empId = (Long) request.getSession().getAttribute("employee");
        employee.setUpdateUser(empId);
        employee.setCreateTime(new Date());
        R<String> stringR = employeeService.updateById(employee);
        return stringR;
    }
    @GetMapping("{id}")
    public R<Employee> selectById(@PathVariable("id") Long id){
        R<Employee> byId = employeeService.findById(id);
        return byId;

    }
}
