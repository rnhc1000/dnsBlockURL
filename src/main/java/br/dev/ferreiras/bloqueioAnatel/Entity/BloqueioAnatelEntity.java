package br.dev.ferreiras.bloqueioAnatel.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Objects;

@Document (collection = "blockedSites")
public class BloqueioAnatelEntity implements Serializable {

  @Serial
  private static final long serialVersionUID=1L;

  @Id
  private BigInteger _id;
  private Integer serial;
  private LocalDateTime created_at;
  private String url;
  private String status;

  public BloqueioAnatelEntity() {
  }

  public BloqueioAnatelEntity(BigInteger _id, String serial, LocalDateTime created_at, String url, String status) {
    this._id = _id;
    this.serial = Integer.valueOf(serial);
    this.created_at = created_at;
    this.url = url;
    this.status = status;
  }

  public BigInteger getId() {
    return _id;
  }

  public void setId(BigInteger _id) {
    this._id = _id;
  }

  public Integer getSerial() {
    return serial;
  }

  public void setSerial(Integer serial) {
    this.serial = serial;
  }

  public LocalDateTime getCreated_at() {
    return created_at;
  }

  public void setCreated_at(LocalDateTime created_at) {
    this.created_at = created_at;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof BloqueioAnatelEntity that)) return false;
    return Objects.equals(_id, that._id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_id);
  }

  @Override
  public String toString() {
    return "BloqueioAnatelEntity{" +
            "id='" + _id + '\'' +
            ", serial=" + serial +
            ", created_at=" + created_at +
            ", url='" + url + '\'' +
            ", status='" + status + '\'' +
            '}';
  }
}
