package com.example.swaggerdemo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Operation(
            summary = "Hello API",
            description = "Returns a greeting message"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Successful response"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping("/hello")
    public String hello(){
        return "Hello Swagger";
    }

    @GetMapping("/greet")
    public String greet(
            @Parameter(
                    description = "Name of the User",
                    example = "Vishakha",
                    required = true
            )
            @RequestParam String name
    ){
        return "Hello " + name;
    }

    @SecurityRequirement(name = "BearerAuth")
    @GetMapping("/secure")
    public String secureApi(){
        return "This is a secured API";
    }

}
