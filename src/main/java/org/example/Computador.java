package org.example;

import java.util.Date;

public class Computador {

    private String numeroSerie;
    private String processador;
    private Date dataFabricacao;
    private String marca;
    private String modelo;
    private String placaMae;
    private int memoriaRam;
    private int armazenamento;
    private String tipoArmazenamento;
    private String placaDeVideo;
    private int potenciaFonte;
    private String gabinete;
    private String sistemaOperacional;

    public Computador() {
        this.numeroSerie = "";
        this.processador = "";
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getTipoArmazenamento() {
        return tipoArmazenamento;
    }

    public void setTipoArmazenamento(String tipoArmazenamento) {
        this.tipoArmazenamento = tipoArmazenamento;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public int getPotenciaFonte() {
        return potenciaFonte;
    }

    public void setPotenciaFonte(int potenciaFonte) {
        this.potenciaFonte = potenciaFonte;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
