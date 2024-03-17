package br.dev.ferreiras.bloqueioAnatel.controllers;

import br.dev.ferreiras.bloqueioAnatel.dto.BloqueioAnatelDTO;
import br.dev.ferreiras.bloqueioAnatel.services.BloqueioAnatelServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value="/api")
public class BloqueioAnatelController {

  private Logger logger = LoggerFactory.getLogger(BloqueioAnatelController.class);
  @Autowired
  private BloqueioAnatelServices service;


  @GetMapping(value="/findAllSites")
  public ResponseEntity<List<BloqueioAnatelDTO>> getAllSites() {
    List<BloqueioAnatelDTO> list = service.findAll();
    return ResponseEntity.ok(list);
  }

  @GetMapping(value="/total")
  public long getCount() { return service.getCountSites();}
}
