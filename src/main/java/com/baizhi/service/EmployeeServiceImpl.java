package com.baizhi.service;

import com.baizhi.dao.EmployeeDao;
import com.baizhi.entity.Employee;

import java.util.List;

public class EmployeeServiceImpl implements  EmployeeService {
    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> selectAll() {
        List<Employee> employees = employeeDao.selectAll();
        return employees;
    }

    @Override
    public void modifyinsert(Employee employee) {
        employeeDao.insert(employee);
    }

    @Override
    public Employee selectById(Integer id) {
        Employee employee = employeeDao.selectById(id);
        return employee;
    }

    @Override
    public void modifyupdate(Employee employee) {
        employeeDao.update(employee);
    }

    @Override
    public void modifydeleteById(Integer id) {
        employeeDao.deleteById(id);
    }


}
