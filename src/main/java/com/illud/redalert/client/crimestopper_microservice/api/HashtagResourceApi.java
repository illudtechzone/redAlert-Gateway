/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.redalert.client.crimestopper_microservice.api;

import com.illud.redalert.client.crimestopper_microservice.model.HashtagDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-04T14:21:21.153+05:30[Asia/Kolkata]")

@Api(value = "HashtagResource", description = "the HashtagResource API")
public interface HashtagResourceApi {

    @ApiOperation(value = "createHashtag", nickname = "createHashtagUsingPOST", notes = "", response = HashtagDTO.class, tags={ "hashtag-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = HashtagDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/hashtags",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<HashtagDTO> createHashtagUsingPOST(@ApiParam(value = "hashtagDTO" ,required=true )  @Valid @RequestBody HashtagDTO hashtagDTO);


    @ApiOperation(value = "deleteHashtag", nickname = "deleteHashtagUsingDELETE", notes = "", tags={ "hashtag-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/hashtags/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteHashtagUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllHashtags", nickname = "getAllHashtagsUsingGET", notes = "", response = HashtagDTO.class, responseContainer = "List", tags={ "hashtag-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = HashtagDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/hashtags",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<HashtagDTO>> getAllHashtagsUsingGET(@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getHashtag", nickname = "getHashtagUsingGET", notes = "", response = HashtagDTO.class, tags={ "hashtag-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = HashtagDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/hashtags/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<HashtagDTO> getHashtagUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "updateHashtag", nickname = "updateHashtagUsingPUT", notes = "", response = HashtagDTO.class, tags={ "hashtag-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = HashtagDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/hashtags",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<HashtagDTO> updateHashtagUsingPUT(@ApiParam(value = "hashtagDTO" ,required=true )  @Valid @RequestBody HashtagDTO hashtagDTO);

}
