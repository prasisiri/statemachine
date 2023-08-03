package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ContractInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EmployeeRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-03T06:05:18.357318-05:00[America/Chicago]")
public class EmployeeRequest {

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("age")
  private Integer age;

  @JsonProperty("contractInfo")
  private ContractInfo contractInfo;

  public EmployeeRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @NotNull 
  @Schema(name = "firstName", required = true)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public EmployeeRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @NotNull 
  @Schema(name = "lastName", required = true)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public EmployeeRequest age(Integer age) {
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

  public EmployeeRequest contractInfo(ContractInfo contractInfo) {
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
    EmployeeRequest employeeRequest = (EmployeeRequest) o;
    return Objects.equals(this.firstName, employeeRequest.firstName) &&
        Objects.equals(this.lastName, employeeRequest.lastName) &&
        Objects.equals(this.age, employeeRequest.age) &&
        Objects.equals(this.contractInfo, employeeRequest.contractInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age, contractInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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

