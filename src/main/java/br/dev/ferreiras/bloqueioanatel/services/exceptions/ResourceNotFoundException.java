package br.dev.ferreiras.bloqueioanatel.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
  public ResourceNotFoundException(String msg) {
    super(msg);
  }
}
