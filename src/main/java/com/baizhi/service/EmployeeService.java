package com.baizhi.service;

import com.baizhi.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> selectAll();
    public void modifyinsert(Employee employee);
    public Employee selectById(Integer id);
    public void modifyupdate(Employee employee);
    public void modifydeleteById(Integer id);
}
