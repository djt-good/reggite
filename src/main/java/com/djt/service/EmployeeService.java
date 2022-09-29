package com.djt.service;

import com.djt.common.PageHelper;
import com.djt.common.R;
import com.djt.domain.Employee;

public interface EmployeeService {

    public R<Employee> login(Employee employee);
    public R<String> addEmployee(Employee employee);

    public R<PageHelper> selectBypage(Integer page, Integer pageSize, String name);

    public R<String> updateById(Employee employee);

    R<Employee> findById(Long id);
}
