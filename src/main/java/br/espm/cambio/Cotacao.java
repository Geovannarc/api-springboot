package br.espm.cambio;
import java.time.LocalDate;
import java.util.UUID;

public class Cotacao {
    private UUID idCotacao;
    private String idMoeda;
    private LocalDate dtData;
    private Float vrValor;

    public UUID getIdCotacao() {
        return idCotacao;
    }
    public LocalDate getDtData() {
        return dtData;
    }
    public String getIdMoeda() {
        return idMoeda;
    }
    public float getVrValor() {
        return vrValor;
    }
    
    public void setIdCotacao(UUID idCotacao) {
        this.idCotacao = idCotacao;
    }
    
    public void setDtData(LocalDate dtData) {
        this.dtData = dtData;
    }

    public void setIdMoeda(String idMoeda) {
        this.idMoeda = idMoeda;
    }
    public void setVrValor(float vrValor) {
        this.vrValor = vrValor;
    }

}
