package com.illud.redalert.client.red_alert_microservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FriendListDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-31T11:55:41.697+05:30[Asia/Calcutta]")

public class FriendListDTO   {
  @JsonProperty("friendId")
  private String friendId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("userDetailsId")
  private Long userDetailsId = null;

  public FriendListDTO friendId(String friendId) {
    this.friendId = friendId;
    return this;
  }

  /**
   * Get friendId
   * @return friendId
  **/
  @ApiModelProperty(value = "")


  public String getFriendId() {
    return friendId;
  }

  public void setFriendId(String friendId) {
    this.friendId = friendId;
  }

  public FriendListDTO id(Long id) {
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

  public FriendListDTO userDetailsId(Long userDetailsId) {
    this.userDetailsId = userDetailsId;
    return this;
  }

  /**
   * Get userDetailsId
   * @return userDetailsId
  **/
  @ApiModelProperty(value = "")


  public Long getUserDetailsId() {
    return userDetailsId;
  }

  public void setUserDetailsId(Long userDetailsId) {
    this.userDetailsId = userDetailsId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendListDTO friendListDTO = (FriendListDTO) o;
    return Objects.equals(this.friendId, friendListDTO.friendId) &&
        Objects.equals(this.id, friendListDTO.id) &&
        Objects.equals(this.userDetailsId, friendListDTO.userDetailsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(friendId, id, userDetailsId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendListDTO {\n");
    
    sb.append("    friendId: ").append(toIndentedString(friendId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userDetailsId: ").append(toIndentedString(userDetailsId)).append("\n");
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

