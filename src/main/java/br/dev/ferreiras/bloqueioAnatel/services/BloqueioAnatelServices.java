package br.dev.ferreiras.bloqueioAnatel.services;

import br.dev.ferreiras.bloqueioAnatel.dto.BloqueioAnatelDTO;
import br.dev.ferreiras.bloqueioAnatel.entity.BloqueioAnatelEntity;
import br.dev.ferreiras.bloqueioAnatel.repository.BloqueioAnatelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloqueioAnatelServices {
  @Autowired

  private BloqueioAnatelRepository repository;

  public BloqueioAnatelServices() {
  }
  public List<BloqueioAnatelDTO> findAll() {

    List<BloqueioAnatelEntity> result = repository.findAll();
    return result.stream().map(BloqueioAnatelDTO::new).toList();

  }

  public long getCountSites() { return repository.count(); }

}

