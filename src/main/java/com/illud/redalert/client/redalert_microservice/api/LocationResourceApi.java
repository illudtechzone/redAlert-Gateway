/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.redalert.client.redalert_microservice.api;

import com.illud.redalert.client.redalert_microservice.model.LocationDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-04T12:47:18.880+05:30[Asia/Kolkata]")

@Api(value = "LocationResource", description = "the LocationResource API")
public interface LocationResourceApi {

    @ApiOperation(value = "createLocation", nickname = "createLocationUsingPOST", notes = "", response = LocationDTO.class, tags={ "location-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LocationDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/locations",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<LocationDTO> createLocationUsingPOST(@ApiParam(value = "locationDTO" ,required=true )  @Valid @RequestBody LocationDTO locationDTO);


    @ApiOperation(value = "deleteLocation", nickname = "deleteLocationUsingDELETE", notes = "", tags={ "location-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/locations/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteLocationUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllLocations", nickname = "getAllLocationsUsingGET", notes = "", response = LocationDTO.class, responseContainer = "List", tags={ "location-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LocationDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/locations",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<LocationDTO>> getAllLocationsUsingGET(@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getLocationOfComplaintId", nickname = "getLocationOfComplaintIdUsingGET", notes = "", response = LocationDTO.class, tags={ "location-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LocationDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/complaints/{complaintId}/location",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<LocationDTO> getLocationOfComplaintIdUsingGET(@ApiParam(value = "complaintId",required=true) @PathVariable("complaintId") Long complaintId);


    @ApiOperation(value = "getLocation", nickname = "getLocationUsingGET", notes = "", response = LocationDTO.class, tags={ "location-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LocationDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/locations/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<LocationDTO> getLocationUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "updateLocation", nickname = "updateLocationUsingPUT", notes = "", response = LocationDTO.class, tags={ "location-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LocationDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/locations",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<LocationDTO> updateLocationUsingPUT(@ApiParam(value = "locationDTO" ,required=true )  @Valid @RequestBody LocationDTO locationDTO);

}
