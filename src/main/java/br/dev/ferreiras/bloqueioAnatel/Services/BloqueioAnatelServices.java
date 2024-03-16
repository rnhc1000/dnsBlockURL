package br.dev.ferreiras.bloqueioAnatel.Services;

import br.dev.ferreiras.bloqueioAnatel.Entity.BloqueioAnatelEntity;
import br.dev.ferreiras.bloqueioAnatel.Repository.BloqueioAnatelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloqueioAnatelServices {
  private BloqueioAnatelRepository bloqueioAnatelRepository;
  private BloqueioAnatelEntity bloqueioAnatelEntity;

  @Autowired
  public BloqueioAnatelServices(BloqueioAnatelRepository bloqueioAnatelRepository) {
    this.bloqueioAnatelRepository = bloqueioAnatelRepository;
  }

  public BloqueioAnatelServices() {
  }
  public List<BloqueioAnatelEntity> getAllSites() {
    return bloqueioAnatelRepository.findAll();
  }
}
