package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * behavior of a publish plugin after invocation (does it send a redirect? does it return an iRODS path? Does it return data for download?)
 */
@Schema(description = "behavior of a publish plugin after invocation (does it send a redirect? does it return an iRODS path? Does it return data for download?)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-01T20:25:58.961Z[GMT]")


public class PublishResponseTypes   {
  /**
   * Gets or Sets responseType
   */
  public enum ResponseTypeEnum {
    DOWNLOAD("download"),
    
    REDIRECT_URL("redirect_url"),
    
    ABSOLUTE_PATH("absolute_path"),
    
    SIMPLE("simple"),
    
    ERROR("error");

    private String value;

    ResponseTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResponseTypeEnum fromValue(String text) {
      for (ResponseTypeEnum b : ResponseTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("response_type")
  private ResponseTypeEnum responseType = null;

  public PublishResponseTypes responseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
    return this;
  }

  /**
   * Get responseType
   * @return responseType
   **/
  @Schema(description = "")
  
    public ResponseTypeEnum getResponseType() {
    return responseType;
  }

  public void setResponseType(ResponseTypeEnum responseType) {
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
    PublishResponseTypes publishResponseTypes = (PublishResponseTypes) o;
    return Objects.equals(this.responseType, publishResponseTypes.responseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishResponseTypes {\n");
    
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
