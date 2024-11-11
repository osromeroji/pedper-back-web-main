/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mercadona.pedper.main.driving.controllers.adapters;

import com.mercadona.pedper.main.api.dto.ErrorResourceResponseDTO;
import com.mercadona.pedper.main.api.dto.ExampleResourceResponseDTO;
import com.mercadona.pedper.main.api.dto.VacancyResourceDTO;
import com.mercadona.pedper.main.api.dto.VacancyResourceResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-10T16:36:37.876241+01:00[Europe/Madrid]")
@Validated
@Tag(name = "vacancies", description = "Vacancy Controller")
@RequestMapping("${openapi.quickstartServiceDemo.base-path:}")
public interface VacanciesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /vacancies : Method to create a vacancy
     * This method creates a new vacancy with the given body information
     *
     * @param vacancyResourceDTO vacancyRequest (required)
     * @return Created (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "createVacancy",
        summary = "Method to create a vacancy",
        tags = { "vacancies" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Created", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ExampleResourceResponseDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResourceResponseDTO.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResourceResponseDTO.class))
            }),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResourceResponseDTO.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not Found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResourceResponseDTO.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResourceResponseDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/vacancies",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ExampleResourceResponseDTO> createVacancy(
        @Parameter(name = "VacancyResourceDTO", description = "vacancyRequest", required = true) @Valid @RequestBody VacancyResourceDTO vacancyResourceDTO
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"identification\" : \"identification\", \"creationTime\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"description\" : \"description\", \"numberOfDaysInWeek\" : 6, \"id\" : 0 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /vacancies/{id} : Method to retrieve one vacancy
     * This method retrieves a vacancy defined by a specific id
     *
     * @param id id (required)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "getVacancy",
        summary = "Method to retrieve one vacancy",
        tags = { "vacancies" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = VacancyResourceResponseDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResourceResponseDTO.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResourceResponseDTO.class))
            }),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResourceResponseDTO.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not Found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResourceResponseDTO.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResourceResponseDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/vacancies/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<VacancyResourceResponseDTO> getVacancy(
        @Parameter(name = "id", description = "id", required = true) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"candidates\" : [ { \"candidate\" : { \"managedGroupId\" : \"managedGroupId\", \"name\" : \"name\", \"employeeId\" : \"employeeId\" }, \"createdDate\" : \"createdDate\" }, { \"candidate\" : { \"managedGroupId\" : \"managedGroupId\", \"name\" : \"name\", \"employeeId\" : \"employeeId\" }, \"createdDate\" : \"createdDate\" } ], \"endDate\" : \"endDate\", \"id\" : 0, \"onboardingDate\" : \"onboardingDate\", \"startDate\" : \"startDate\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}