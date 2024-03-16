package br.dev.ferreiras.bloqueioAnatel.Controllers;

import br.dev.ferreiras.bloqueioAnatel.Entity.BloqueioAnatelEntity;
import br.dev.ferreiras.bloqueioAnatel.Services.BloqueioAnatelServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping (value="/api")
public class BloqueioAnatelController {

  private Logger logger = LoggerFactory.getLogger(BloqueioAnatelController.class);
  @Autowired
  private final BloqueioAnatelServices bloqueioAnatelServices;

  public BloqueioAnatelController(BloqueioAnatelServices bloqueioAnatelServices) {

    this.bloqueioAnatelServices = bloqueioAnatelServices;

  }

  @GetMapping(value="/findAllSites")
  public List<BloqueioAnatelEntity> getAllSites() {
    return bloqueioAnatelServices.getAllSites();
  }

}
