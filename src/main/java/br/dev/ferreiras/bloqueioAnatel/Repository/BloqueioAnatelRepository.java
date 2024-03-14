package br.dev.ferreiras.bloqueioAnatel.Repository;

import br.dev.ferreiras.bloqueioAnatel.Entity.BloqueioAnatelEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloqueioAnatelRepository extends MongoRepository<BloqueioAnatelEntity, String> {

}
