package org.example;

import java.util.Date;

public class ComputadorBuilder {

    private Computador computador;

    public ComputadorBuilder() {
        computador = new Computador();
    }

    public Computador build() {
        if (computador.getNumeroSerie().equals("")) {
            throw new IllegalArgumentException("Número de série inválido");
        }
        if (computador.getProcessador().equals("")) {
            throw new IllegalArgumentException("Processador inválido");
        }
        return computador;
    }

    public ComputadorBuilder setNumeroSerie(String numeroSerie) {
        computador.setNumeroSerie(numeroSerie);
        return this;
    }

    public ComputadorBuilder setProcessador(String processador) {
        computador.setProcessador(processador);
        return this;
    }

    public ComputadorBuilder setDataFabricacao(Date dataFabricacao) {
        computador.setDataFabricacao(dataFabricacao);
        return this;
    }

    public ComputadorBuilder setMarca(String marca) {
        computador.setMarca(marca);
        return this;
    }

    public ComputadorBuilder setModelo(String modelo) {
        computador.setModelo(modelo);
        return this;
    }

    public ComputadorBuilder setPlacaMae(String placaMae) {
        computador.setPlacaMae(placaMae);
        return this;
    }

    public ComputadorBuilder setMemoriaRam(int memoriaRam) {
        computador.setMemoriaRam(memoriaRam);
        return this;
    }

    public ComputadorBuilder setArmazenamento(int armazenamento) {
        computador.setArmazenamento(armazenamento);
        return this;
    }

    public ComputadorBuilder setTipoArmazenamento(String tipoArmazenamento) {
        computador.setTipoArmazenamento(tipoArmazenamento);
        return this;
    }

    public ComputadorBuilder setPlacaDeVideo(String placaDeVideo) {
        computador.setPlacaDeVideo(placaDeVideo);
        return this;
    }

    public ComputadorBuilder setPotenciaFonte(int potenciaFonte) {
        computador.setPotenciaFonte(potenciaFonte);
        return this;
    }

    public ComputadorBuilder setGabinete(String gabinete) {
        computador.setGabinete(gabinete);
        return this;
    }

    public ComputadorBuilder setSistemaOperacional(String sistemaOperacional) {
        computador.setSistemaOperacional(sistemaOperacional);
        return this;
    }
}
