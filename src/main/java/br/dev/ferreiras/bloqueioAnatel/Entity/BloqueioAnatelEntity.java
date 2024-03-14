package br.dev.ferreiras.bloqueioAnatel.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Document (collection = "blockedsites")
public class BloqueioAnatelEntity implements Serializable {

  @Serial
  private static final long serialVersionUID=1L;

  @Id
  private String id;
  private Integer serial;
  private Timestamp created_at;

  private String url;

  private String status;

  public BloqueioAnatelEntity() {
  }

  public BloqueioAnatelEntity(String id, Integer serial, Timestamp created_at, String url, String status) {
    this.id = id;
    this.serial = serial;
    this.created_at = created_at;
    this.url = url;
    this.status = status;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getSerial() {
    return serial;
  }

  public void setSerial(Integer serial) {
    this.serial = serial;
  }

  public Timestamp getCreated_at() {
    return created_at;
  }

  public void setCreated_at(Timestamp created_at) {
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
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "BloqueioAnatelEntity{" +
            "id='" + id + '\'' +
            ", serial=" + serial +
            ", created_at=" + created_at +
            ", url='" + url + '\'' +
            ", status='" + status + '\'' +
            '}';
  }
}
