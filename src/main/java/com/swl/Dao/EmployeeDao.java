package com.swl.Dao;

import com.swl.Pojo.Employee;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @author Wlient
 * @date 2020/9/20 1:31
 */
@Mapper
public interface EmployeeDao {

    public List<Employee> finadAll();
}
