package br.dev.ferreiras.bloqueioAnatel.services.exceptions;

public class DatabaseException extends RuntimeException{
  public DatabaseException(String msg) {
    super(msg);
  }
}
