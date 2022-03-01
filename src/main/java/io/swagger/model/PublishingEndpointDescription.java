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
 * PublishingEndpointDescription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-01T20:25:58.961Z[GMT]")


public class PublishingEndpointDescription   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("info")
  private String info = null;

  @JsonProperty("maintainer")
  private String maintainer = null;

  @JsonProperty("contact_email")
  private String contactEmail = null;

  @JsonProperty("response_type")
  private PublishResponseTypes responseType = null;

  public PublishingEndpointDescription id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique id that identifies this particular endpoint.
   * @return id
   **/
  @Schema(description = "Unique id that identifies this particular endpoint.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PublishingEndpointDescription name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human readable, meaningful name for the publish endpoint
   * @return name
   **/
  @Schema(description = "Human readable, meaningful name for the publish endpoint")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PublishingEndpointDescription info(String info) {
    this.info = info;
    return this;
  }

  /**
   * Documentation about the function of the endpoint
   * @return info
   **/
  @Schema(description = "Documentation about the function of the endpoint")
  
    public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public PublishingEndpointDescription maintainer(String maintainer) {
    this.maintainer = maintainer;
    return this;
  }

  /**
   * Maintainer of the api
   * @return maintainer
   **/
  @Schema(description = "Maintainer of the api")
  
    public String getMaintainer() {
    return maintainer;
  }

  public void setMaintainer(String maintainer) {
    this.maintainer = maintainer;
  }

  public PublishingEndpointDescription contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

  /**
   * email address of a support contact
   * @return contactEmail
   **/
  @Schema(description = "email address of a support contact")
  
    public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public PublishingEndpointDescription responseType(PublishResponseTypes responseType) {
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
    PublishingEndpointDescription publishingEndpointDescription = (PublishingEndpointDescription) o;
    return Objects.equals(this.id, publishingEndpointDescription.id) &&
        Objects.equals(this.name, publishingEndpointDescription.name) &&
        Objects.equals(this.info, publishingEndpointDescription.info) &&
        Objects.equals(this.maintainer, publishingEndpointDescription.maintainer) &&
        Objects.equals(this.contactEmail, publishingEndpointDescription.contactEmail) &&
        Objects.equals(this.responseType, publishingEndpointDescription.responseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, info, maintainer, contactEmail, responseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishingEndpointDescription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    maintainer: ").append(toIndentedString(maintainer)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
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
