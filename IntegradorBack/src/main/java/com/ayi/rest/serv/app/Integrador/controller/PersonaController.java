package com.ayi.rest.serv.app.Integrador.controller;

import com.ayi.rest.serv.app.Integrador.dto.request.PersonaRequest;
import com.ayi.rest.serv.app.Integrador.dto.response.PersonaResponse;
import com.ayi.rest.serv.app.Integrador.service.IPersonaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@AllArgsConstructor
@RestController
@Api(value = "Front data", tags = "{persona data}")
@RequestMapping(value = "/takeData")
@CrossOrigin(origins = "*")
public class PersonaController {

    private IPersonaService personaService;

    @PostMapping(path = "/takeData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(
            value = "Retrieves all the data from persona",
            httpMethod = "POST",
            response = PersonaResponse.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 201,
                    message = "Body content with all persona data",
                    response = PersonaResponse.class),
            @ApiResponse(code = 400,
                    message = "Describes errors on invalid payload received, e.g: missing fields, invalid data form")
    })
    public ResponseEntity<PersonaResponse> createPersona
            (
                    @ApiParam(value = "data of persona", required = true)
                    @Valid @RequestBody PersonaRequest request
            ) {
        System.out.println("REQUEST " + request);
        PersonaResponse persona = personaService.createPersona(request);
        return new ResponseEntity<>(persona, HttpStatus.CREATED);

    }}