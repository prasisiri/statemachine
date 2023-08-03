package com.postgres.statemachine;


import org.openapitools.model.EmployeeRequest;
import org.openapitools.model.EmployeeResponse;
import org.openapitools.model.UpdateRequest;

public interface EmployeeService {

    EmployeeResponse addEmployee(EmployeeRequest data);

    EmployeeResponse getEmployee(Long id);

    EmployeeResponse updateEmployeeStatus(Long id, UpdateRequest updateRequest);

}
