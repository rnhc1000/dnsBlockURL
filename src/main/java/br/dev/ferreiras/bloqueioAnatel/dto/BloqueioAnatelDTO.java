package br.dev.ferreiras.bloqueioAnatel.dto;

import br.dev.ferreiras.bloqueioAnatel.entity.BloqueioAnatelEntity;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class BloqueioAnatelDTO {
  private BigInteger _id;
  private Integer serial;
  private LocalDateTime created_at;
  private String url;
  private String status;

  public BloqueioAnatelDTO(BigInteger _id, Integer serial, LocalDateTime created_at, String url, String status) {
    this._id = _id;
    this.serial = serial;
    this.created_at = created_at;
    this.url = url;
    this.status = status;
  }

  public BloqueioAnatelDTO(String url, String status) {
    this.url = url;
    this.status = status;
  }

  public BloqueioAnatelDTO(BloqueioAnatelEntity entity) {
    _id = entity.getId();
    serial = entity.getSerial();
    created_at = entity.getCreated_at();
    url = entity.getUrl();
    status = entity.getStatus();
  }

  public BigInteger get_id() {
    return _id;
  }

  public Integer getSerial() {
    return serial;
  }

  public LocalDateTime getCreated_at() {
    return created_at;
  }

  public String getUrl() {
    return url;
  }

  public String getStatus() {
    return status;
  }
}
