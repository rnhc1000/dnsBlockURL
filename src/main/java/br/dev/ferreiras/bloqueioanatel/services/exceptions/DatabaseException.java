package br.dev.ferreiras.bloqueioanatel.services.exceptions;

public class DatabaseException extends RuntimeException{
  public DatabaseException(String msg) {
    super(msg);
  }
}
