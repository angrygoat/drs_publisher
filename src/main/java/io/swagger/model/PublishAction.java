package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.FreeformProps;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PublishAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-01T20:25:58.961Z[GMT]")


public class PublishAction   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("additionalProperties")
  private FreeformProps additionalProperties = null;

  public PublishAction id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PublishAction additionalProperties(FreeformProps additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  /**
   * Get additionalProperties
   * @return additionalProperties
   **/
  @Schema(description = "")
  
    @Valid
    public FreeformProps getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(FreeformProps additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishAction publishAction = (PublishAction) o;
    return Objects.equals(this.id, publishAction.id) &&
        Objects.equals(this.additionalProperties, publishAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
