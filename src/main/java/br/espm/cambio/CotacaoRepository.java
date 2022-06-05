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
    
    @Query("SELECT m from CotacaoModel m WHERE UPPER(m.idMoeda) = UPPER(:simbolo)")
    Optional<CotacaoModel> findBySimbolo(@Param("simbolo") String simbolo);

}

