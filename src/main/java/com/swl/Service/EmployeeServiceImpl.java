package com.swl.Service;

import com.swl.Pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wlient
 * @date 2020/9/20 1:37
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> finadAll() {
        System.out.println("查询所有");
        return null;
    }
}
