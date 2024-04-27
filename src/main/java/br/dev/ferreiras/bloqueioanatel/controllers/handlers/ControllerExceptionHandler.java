package br.dev.ferreiras.bloqueioanatel.controllers.handlers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.dev.ferreiras.bloqueioanatel.dto.CustomError;
import br.dev.ferreiras.bloqueioanatel.services.exceptions.DatabaseException;
import br.dev.ferreiras.bloqueioanatel.services.exceptions.ResourceNotFoundException;

import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandler {
  @ExceptionHandler (ResourceNotFoundException.class)
  public ResponseEntity<CustomError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
    HttpStatus status = HttpStatus.NOT_FOUND;
    CustomError err = new CustomError(Instant.now(), status.value(), e.getMessage(), request.getRequestURI());
    return ResponseEntity.status(status).body(err);
  }

  @ExceptionHandler(DatabaseException.class)
  public ResponseEntity<CustomError> database(DatabaseException e, HttpServletRequest request) {
    HttpStatus status = HttpStatus.BAD_REQUEST;
    CustomError err = new CustomError(Instant.now(), status.value(), e.getMessage(), request.getRequestURI());
    return ResponseEntity.status(status).body(err);
  }
}
