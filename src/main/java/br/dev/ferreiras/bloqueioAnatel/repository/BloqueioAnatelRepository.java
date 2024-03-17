package br.dev.ferreiras.bloqueioAnatel.repository;

import br.dev.ferreiras.bloqueioAnatel.entity.BloqueioAnatelEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.math.BigInteger;
import java.util.List;

public interface BloqueioAnatelRepository extends MongoRepository<BloqueioAnatelEntity, Integer> {
@Query ("{id: '?0'}")
  BloqueioAnatelEntity findItemById(BigInteger _id);
@Query(value="{status:'?0'}", fields="{'url' : 1, 'serial' : 1, 'created_at' : 1}")
  List<BloqueioAnatelEntity> findAll(BigInteger _id);
public long count();
}
