/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.PublishAction;
import io.swagger.model.PublishResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-01T20:25:58.961Z[GMT]")
@Validated
public interface PublisherApi {

    @Operation(summary = "executes a publishing action", description = "executes the publishing action", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "publish" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "publish successful", content = @Content(schema = @Schema(implementation = PublishResponse.class))) })
    @RequestMapping(value = "/publisher/{username}/{cartid}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<PublishResponse> doPublishAction(@Parameter(in = ParameterIn.PATH, description = "ID of the user owning the cart", required=true, schema=@Schema()) @PathVariable("username") String username, @Parameter(in = ParameterIn.PATH, description = "ID of the cart to publish", required=true, schema=@Schema()) @PathVariable("cartid") String cartid, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody PublishAction body);

}
