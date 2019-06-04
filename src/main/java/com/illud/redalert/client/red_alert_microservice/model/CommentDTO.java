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
 * CommentDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-31T11:55:41.697+05:30[Asia/Calcutta]")

public class CommentDTO   {
  @JsonProperty("commentId")
  private Long commentId = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("postId")
  private Long postId = null;

  @JsonProperty("userId")
  private String userId = null;

  public CommentDTO commentId(Long commentId) {
    this.commentId = commentId;
    return this;
  }

  /**
   * Get commentId
   * @return commentId
  **/
  @ApiModelProperty(value = "")


  public Long getCommentId() {
    return commentId;
  }

  public void setCommentId(Long commentId) {
    this.commentId = commentId;
  }

  public CommentDTO content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public CommentDTO id(Long id) {
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

  public CommentDTO postId(Long postId) {
    this.postId = postId;
    return this;
  }

  /**
   * Get postId
   * @return postId
  **/
  @ApiModelProperty(value = "")


  public Long getPostId() {
    return postId;
  }

  public void setPostId(Long postId) {
    this.postId = postId;
  }

  public CommentDTO userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


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
    CommentDTO commentDTO = (CommentDTO) o;
    return Objects.equals(this.commentId, commentDTO.commentId) &&
        Objects.equals(this.content, commentDTO.content) &&
        Objects.equals(this.id, commentDTO.id) &&
        Objects.equals(this.postId, commentDTO.postId) &&
        Objects.equals(this.userId, commentDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentId, content, id, postId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentDTO {\n");
    
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
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

