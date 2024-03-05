package com.safaricom.mspinlesspartycreateprofilepostv1.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;
import org.springframework.web.context.request.WebRequest;

import com.safaricom.mspinlesspartycreateprofilepostv1.dto.DealerProfileResponseDTO;

@ControllerAdvice
public class DealerProfileExceptionsAdvice {
    
@ExceptionHandler(InternalServerError.class)
    public ResponseEntity<?> internalServerErrorHandler(InternalServerError err, WebRequest request) {

        // String errorMessage = "Sorry, an unexpected error occurred!";
        DealerProfileResponseDTO dealerProfileResponseDTO = DealerProfileResponseDTO.builder()

                .responseCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .responseDescription("error")
                .responseSummary(err.getMessage())
                .build();

        // if (env.getProperty("app.environment").equalsIgnoreCase("dev")) {
        // errorMessage += "\nDetails:\n" + ex.getMessage();
        // }

        // ErrorDetails errorDetails = new ErrorDetails(errorMessage);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(dealerProfileResponseDTO);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public final ResponseEntity<Object> handleAllExceptions(HttpMessageNotReadableException ex, WebRequest request) {

        DealerProfileResponseDTO dealerProfileResponseDTO = DealerProfileResponseDTO.builder()

                .responseCode(HttpStatus.BAD_REQUEST.value())
                .responseDescription("failed")
                .responseSummary(ex.getMessage())
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dealerProfileResponseDTO);
    }



}
