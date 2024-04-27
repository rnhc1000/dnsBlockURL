package br.dev.ferreiras.bloqueioanatel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.ferreiras.bloqueioanatel.dto.BloqueioAnatelDTO;
import br.dev.ferreiras.bloqueioanatel.entity.BloqueioAnatelEntity;
import br.dev.ferreiras.bloqueioanatel.repository.BloqueioAnatelRepository;

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

