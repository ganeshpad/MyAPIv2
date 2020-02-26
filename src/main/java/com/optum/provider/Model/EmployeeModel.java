package com.optum.provider.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {

    @JsonProperty(value = "Employee Name")
    private String empName;

    @JsonProperty(value = "Employee ID")
    private int empId;

    @JsonProperty(value = "Employee Dept")
    private String empDept;

    @JsonProperty(value = "Employee Salary")
    private float empSalary;

    @JsonProperty(value = "Employee DOB")
    private Date empDob;

}