package br.dev.ferreiras.bloqueioanatel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.dev.ferreiras.bloqueioanatel.entity.BloqueioAnatelEntity;

import java.math.BigInteger;
import java.util.List;

public interface BloqueioAnatelRepository extends MongoRepository<BloqueioAnatelEntity, BigInteger> {
@Query ("{id: '?0'}")
  BloqueioAnatelEntity findItemById(BigInteger _id);
@Query(value="{status:'?0'}", fields="{'url' : 1, 'serial' : 1, 'created_at' : 1}")
  List<BloqueioAnatelEntity> findAll(BigInteger _id);
public long count();
}
