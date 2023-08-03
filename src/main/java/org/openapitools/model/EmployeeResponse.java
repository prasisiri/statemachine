package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ContractInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EmployeeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-03T06:05:18.357318-05:00[America/Chicago]")
public class EmployeeResponse {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("age")
  private Integer age;

  @JsonProperty("status")
  @Valid
  private List<String> status = null;

  @JsonProperty("contractInfo")
  private ContractInfo contractInfo;

  public EmployeeResponse id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EmployeeResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "firstName", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public EmployeeResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "lastName", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public EmployeeResponse age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  
  @Schema(name = "age", required = false)
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public EmployeeResponse status(List<String> status) {
    this.status = status;
    return this;
  }

  public EmployeeResponse addStatusItem(String statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", required = false)
  public List<String> getStatus() {
    return status;
  }

  public void setStatus(List<String> status) {
    this.status = status;
  }

  public EmployeeResponse contractInfo(ContractInfo contractInfo) {
    this.contractInfo = contractInfo;
    return this;
  }

  /**
   * Get contractInfo
   * @return contractInfo
  */
  @Valid 
  @Schema(name = "contractInfo", required = false)
  public ContractInfo getContractInfo() {
    return contractInfo;
  }

  public void setContractInfo(ContractInfo contractInfo) {
    this.contractInfo = contractInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeResponse employeeResponse = (EmployeeResponse) o;
    return Objects.equals(this.id, employeeResponse.id) &&
        Objects.equals(this.firstName, employeeResponse.firstName) &&
        Objects.equals(this.lastName, employeeResponse.lastName) &&
        Objects.equals(this.age, employeeResponse.age) &&
        Objects.equals(this.status, employeeResponse.status) &&
        Objects.equals(this.contractInfo, employeeResponse.contractInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, age, status, contractInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contractInfo: ").append(toIndentedString(contractInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

