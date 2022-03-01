package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PublishResponseTypes;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * a response with a message, a redirect, or an irodsPath. This will be in the variable content response string
 */
@Schema(description = "a response with a message, a redirect, or an irodsPath. This will be in the variable content response string")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-01T20:25:58.961Z[GMT]")


public class PublishResponse   {
  @JsonProperty("response_path_or_link")
  private String responsePathOrLink = null;

  @JsonProperty("response_message")
  private String responseMessage = null;

  @JsonProperty("response_type")
  private PublishResponseTypes responseType = null;

  public PublishResponse responsePathOrLink(String responsePathOrLink) {
    this.responsePathOrLink = responsePathOrLink;
    return this;
  }

  /**
   * depending on the response type, this may be an irods path, a link for a redirect, or some other value 
   * @return responsePathOrLink
   **/
  @Schema(description = "depending on the response type, this may be an irods path, a link for a redirect, or some other value ")
  
    public String getResponsePathOrLink() {
    return responsePathOrLink;
  }

  public void setResponsePathOrLink(String responsePathOrLink) {
    this.responsePathOrLink = responsePathOrLink;
  }

  public PublishResponse responseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

  /**
   * an optional message back the client. In the case of a simple message  response for a verification message or dialog that message will be  available here 
   * @return responseMessage
   **/
  @Schema(description = "an optional message back the client. In the case of a simple message  response for a verification message or dialog that message will be  available here ")
  
    public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  public PublishResponse responseType(PublishResponseTypes responseType) {
    this.responseType = responseType;
    return this;
  }

  /**
   * Get responseType
   * @return responseType
   **/
  @Schema(description = "")
  
    @Valid
    public PublishResponseTypes getResponseType() {
    return responseType;
  }

  public void setResponseType(PublishResponseTypes responseType) {
    this.responseType = responseType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishResponse publishResponse = (PublishResponse) o;
    return Objects.equals(this.responsePathOrLink, publishResponse.responsePathOrLink) &&
        Objects.equals(this.responseMessage, publishResponse.responseMessage) &&
        Objects.equals(this.responseType, publishResponse.responseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsePathOrLink, responseMessage, responseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishResponse {\n");
    
    sb.append("    responsePathOrLink: ").append(toIndentedString(responsePathOrLink)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
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
