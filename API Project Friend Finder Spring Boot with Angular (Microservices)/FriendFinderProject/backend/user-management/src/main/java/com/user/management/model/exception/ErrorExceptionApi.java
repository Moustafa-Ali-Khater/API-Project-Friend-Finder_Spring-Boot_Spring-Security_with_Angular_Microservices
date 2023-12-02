package com.user.management.model.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.user.management.model.bundle.BundleErrorMessage;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorExceptionApi {


    private HttpStatus status;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "hh:mm:ss dd/MM/yyyy")
    private LocalDateTime localDateTime;

    @JsonProperty("errorMessages")
    private BundleErrorMessage bundleErrorMessage;

    @JsonProperty("message")
    private String message;

    public ErrorExceptionApi(HttpStatus status, BundleErrorMessage bundleErrorMessage) {
        localDateTime = LocalDateTime.now();
        this.status = status;
        this.bundleErrorMessage = bundleErrorMessage;
    }

    public ErrorExceptionApi(HttpStatus status, String message) {
        localDateTime = LocalDateTime.now();
        this.status = status;
        this.message = message;
    }
}
