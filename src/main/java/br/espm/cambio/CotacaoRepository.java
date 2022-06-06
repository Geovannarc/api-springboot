package br.espm.cambio;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CotacaoRepository extends CrudRepository<CotacaoModel, String> {
    
    @Override
    Iterable<CotacaoModel> findAll();

    @Override
    Optional<CotacaoModel> findById(String idCotacao);
    
   @Query("SELECT c from CotacaoModel c WHERE UPPER(c.idMoeda) = UPPER(:simbolo)")
    Iterable<CotacaoModel> findBySimbolo(@Param("simbolo") String simbolo);

    @Query("SELECT c from CotacaoModel c WHERE UPPER(c.dtData) = UPPER(:data) and c.idMoeda = :idMoeda")
    Optional<CotacaoModel> findByDate(@Param("data") String data);

}

