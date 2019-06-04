package com.illud.redalert.client.red_alert_microservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserDetailsDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-31T11:55:41.697+05:30[Asia/Calcutta]")

public class UserDetailsDTO   {
  /**
   * Gets or Sets alert
   */
  public enum AlertEnum {
    RED("RED"),
    
    ORANGE("ORANGE"),
    
    GREEN("GREEN");

    private String value;

    AlertEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AlertEnum fromValue(String text) {
      for (AlertEnum b : AlertEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("alert")
  private AlertEnum alert = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("mobileNum")
  private Double mobileNum = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("userId")
  private String userId = null;

  public UserDetailsDTO alert(AlertEnum alert) {
    this.alert = alert;
    return this;
  }

  /**
   * Get alert
   * @return alert
  **/
  @ApiModelProperty(value = "")


  public AlertEnum getAlert() {
    return alert;
  }

  public void setAlert(AlertEnum alert) {
    this.alert = alert;
  }

  public UserDetailsDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserDetailsDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserDetailsDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserDetailsDTO mobileNum(Double mobileNum) {
    this.mobileNum = mobileNum;
    return this;
  }

  /**
   * Get mobileNum
   * @return mobileNum
  **/
  @ApiModelProperty(value = "")


  public Double getMobileNum() {
    return mobileNum;
  }

  public void setMobileNum(Double mobileNum) {
    this.mobileNum = mobileNum;
  }

  public UserDetailsDTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserDetailsDTO userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDetailsDTO userDetailsDTO = (UserDetailsDTO) o;
    return Objects.equals(this.alert, userDetailsDTO.alert) &&
        Objects.equals(this.firstName, userDetailsDTO.firstName) &&
        Objects.equals(this.id, userDetailsDTO.id) &&
        Objects.equals(this.lastName, userDetailsDTO.lastName) &&
        Objects.equals(this.mobileNum, userDetailsDTO.mobileNum) &&
        Objects.equals(this.password, userDetailsDTO.password) &&
        Objects.equals(this.userId, userDetailsDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert, firstName, id, lastName, mobileNum, password, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetailsDTO {\n");
    
    sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    mobileNum: ").append(toIndentedString(mobileNum)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

