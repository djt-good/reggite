package com.djt.mapper;

import com.djt.domain.Employee;
import com.djt.general.GeneralDAO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper extends GeneralDAO<Employee> {
    public List<Employee> selectAllByPage(@Param("start") int start,
                                          @Param("pageSize") int pageSize,
                                          @Param("name") String name);
}