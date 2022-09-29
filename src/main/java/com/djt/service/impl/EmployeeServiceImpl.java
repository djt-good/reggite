package com.djt.service.impl;

import com.djt.common.MD5Utils;
import com.djt.common.PageHelper;
import com.djt.common.R;
import com.djt.domain.Employee;
import com.djt.mapper.EmployeeMapper;
import com.djt.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Base64;
import java.util.List;



@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    EmployeeMapper employeeMapper;
    @Override
    public R<Employee> login(Employee employee) {
        Example example =new Example(Employee.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username",employee.getUsername());
        List<Employee> employees = employeeMapper.selectByExample(example);

        if(employees.size() < 1){
            return new R<Employee>(0,"没有这个用户",null,null);
        }else {
            String pasasword = MD5Utils.md5(employee.getPassword());
            if(pasasword.equals(employees.get(0).getPassword())){
                if(employees.get(0).getStatus() ==1){
                    return new R<Employee>(1, "登录成功！！",employees.get(0),null);
                }
                else {
                    return new R<Employee>(0, "账户已锁定！！",null, null);
                }
            }else {
                return new R<Employee>(0, "密码不对！！！",null, null);
            }
        }

    }

    @Override
    public R<String> addEmployee(Employee employee) {
        int i = employeeMapper.insertSelective(employee);

        if(i > 0){
            return new R<String>(1,"添加成功！！",null,null);
        }
            return new R<String>(0,"添加失败！！",null,null);
    }

    @Override
    public R<PageHelper> selectBypage(Integer page, Integer pageSize, String name) {
        int start = (page-1) * pageSize;
        Example example = new Example(Employee.class);
        Example.Criteria criteria = example.createCriteria();
        int count = employeeMapper.selectCountByExample(example);

        List<Employee> employees = employeeMapper.selectAllByPage(start, pageSize, name);
        int total = count % pageSize ==0 ? count/pageSize:count/pageSize+1;
        PageHelper<Employee> employeePageHelper = new PageHelper<>(count, total, employees);
        R<PageHelper> success = new R<>(1, "success", employeePageHelper, null);
        System.out.println(success);
        return success;

    }

    @Override
    public R<String> updateById( Employee employee) {
        int i = employeeMapper.updateByPrimaryKeySelective(employee);
        if (i >0){
            return new R<>(1,"success",null,null);
        }
         return new R<>(0,"fail",null,null);
    }

    @Override
    public R<Employee> findById(Long id) {
        Employee employee = employeeMapper.selectByPrimaryKey(id);

        return new R<Employee>(1,"success",employee,null);
    }
}
