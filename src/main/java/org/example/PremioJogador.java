package org.example;

public class PremioJogador {
    double valorPremio;
    Integer numeroDeAcertos;
    private final double valorPremioRecebido;
    public PremioJogador(double valorPremio,Integer numeroDeAcertos){
        this.valorPremio = valorPremio;
        this.numeroDeAcertos = numeroDeAcertos;
        this.valorPremioRecebido = CalculaPremioJogador();
    }
    public double getValorPremioRecebido() {
        return valorPremioRecebido;
    }
    private double CalculaPremioJogador(){
        double valorPremioReceber = 0;
        if(numeroDeAcertos == 6){
            valorPremioReceber = valorPremio;
        } else if (numeroDeAcertos == 5) {
            valorPremioReceber = valorPremio * 0.2;
        }else if (numeroDeAcertos == 4){
            valorPremioReceber = valorPremio * 0.05;
        }
        return valorPremioReceber;
    }
}

