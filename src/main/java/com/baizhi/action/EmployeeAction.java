package com.baizhi.action;

import com.baizhi.entity.Employee;
import com.baizhi.service.EmployeeService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.List;

public class EmployeeAction extends ActionSupport {
    private List<Employee> list;
    private  Employee employee;
    private EmployeeService employeeService;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    //员工查询所有功能
    public String selectAll(){
        list = employeeService.selectAll();
        return Action.SUCCESS;
    }
    public String insert(){
        employeeService.modifyinsert(employee);
        return Action.SUCCESS;
    }
    public String selectById(){
        employee = employeeService.selectById(id);
        System.out.println(employee);
           return Action.SUCCESS;
    }
    public String update(){
        employeeService.modifyupdate(employee);
        return Action.SUCCESS;
    }
    public String deleteById(){
        employeeService.modifydeleteById(id);
        return Action.SUCCESS;
    }
}
