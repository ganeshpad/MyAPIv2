package com.optum.provider.Controller;

import com.optum.provider.Model.EmployeeModel;
import com.optum.provider.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @GetMapping("/get/{id}")
    public EmployeeModel getEmployee(@PathVariable String id)
    {
        return employeeServiceImpl.getEmployee(id);
    }

    @GetMapping("/getall")
    public Map<String, EmployeeModel> getAllEmployee()
    {
        return employeeServiceImpl.getAllEmployee();
    }

    @PostMapping("/add/{id}")
    public void addEmployee(@PathVariable String id, @RequestBody EmployeeModel employeeModel)
    {
        employeeServiceImpl.addEmployee(id, employeeModel);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee()
    {
        return "Success";
    }

}
