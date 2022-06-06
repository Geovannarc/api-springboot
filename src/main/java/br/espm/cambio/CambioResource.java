package br.espm.cambio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CambioResource {

    @Autowired
    private MoedaService moedaService;

    @GetMapping("/moeda")
    public List<Moeda> listMoeda(){
        return moedaService.listaAll();
        
    }

    @GetMapping("/moeda/{simbolo:[A-Z]{3,}}")
    public Moeda findMoedaBySimbolo(@PathVariable String simbolo){
        return moedaService.findBySimbolo(simbolo);
        
    }

    @GetMapping("/moeda/{id:[a-f0-9]{8}(?:-[a-f0-9]{4}){4}[a-f0-9]{8}}")
    public Moeda findMoeda(@PathVariable String id){
        return moedaService.findById(id);
    }

    @RequestMapping(
    method = RequestMethod.DELETE,    
    value = "/moeda/{id}")
    public void deleteMoeda(@PathVariable String id){
        moedaService.deleteMoeda(id);
    }
    
    @PostMapping("/moeda")
    public void save(@RequestBody Moeda moeda){
        moedaService.create(moeda);
    }
}
