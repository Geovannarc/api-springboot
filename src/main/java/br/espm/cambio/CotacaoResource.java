package br.espm.cambio;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CotacaoResource {
    
    @Autowired
    private CotacaoService cotacaoService;

    @GetMapping("/cotacao/{simbolo:[A-Z]{3,}}")
    public List<Cotacao> findCotacaoBySimbolo(@PathVariable String simbolo){
        return cotacaoService.findBySimbolo(simbolo);    
    }

    @GetMapping("/cotacao")
    public List<Cotacao> findAll(){
        return cotacaoService.findAll();
        
    }

    @PostMapping("/cotacao/{simbolo}/{ano}/{mes}/{dia}")
    public void save(@PathVariable String simbolo, @PathVariable String ano, @PathVariable String mes, @PathVariable String dia, @RequestBody Valor vrValor){
        LocalDate data = LocalDate.parse(ano+"-"+mes+"-"+dia);
        Cotacao cotacao = new Cotacao();
        cotacao.setDtData(data);
        cotacao.setIdMoeda(simbolo);
        cotacao.setVrValor(vrValor.getValor());
        cotacaoService.create(cotacao);
    }
}
