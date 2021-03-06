package com.optum.provider.Service;

import com.optum.provider.Model.EmployeeModel;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeServiceImpl implements EmployeeService {

    Map<String, EmployeeModel> employeeList = new HashMap<>();

    public String addEmployee(String id, EmployeeModel employeeModel) {
        employeeList.put(id, employeeModel);
        return "Employee Added Successfully";
    }

    public String deleteEmployee(EmployeeModel employeeModel) {
        employeeList.remove(employeeModel);
        return "Employee Added Successfully";
    }

    public Map<String, EmployeeModel> getAllEmployee() {
        return employeeList;
    }

    public EmployeeModel getEmployee(String id)
    {
        return employeeList.get(id);
    }

}
