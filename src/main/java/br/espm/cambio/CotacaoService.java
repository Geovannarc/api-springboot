package br.espm.cambio;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CotacaoService {

    @Autowired
    private CotacaoRepository cotacaoRepository;
    

    public Cotacao create(Cotacao cotacao){
        cotacao.setIdCotacao(UUID.randomUUID());
        return cotacaoRepository.save(new CotacaoModel(cotacao)).to();
    }

    public List<Cotacao> findBySimbolo(String simbolo){
        return StreamSupport.stream(cotacaoRepository.findBySimbolo(simbolo).spliterator(), false)
        .collect(Collectors.toList()).stream()
        .map(CotacaoModel::to)
        .collect(Collectors.toList());
    }

    public Cotacao findByDate(String data){
        return cotacaoRepository.findByDate(data)
        .map(CotacaoModel::to)
        .orElse(null);
    }

    public List<Cotacao> findAll(){
        return StreamSupport.stream(cotacaoRepository.findAll().spliterator(), false).collect(Collectors.toList()).stream().map(CotacaoModel::to).collect(Collectors.toList());

        // StreamSupport.stream(
        //         moedaRepository.findAll().spliterator(), false)
        //         .collect(Collectors.toList())
        //         .stream().map(MoedaModel::to).collect(Collectors.toList());
    }
}
