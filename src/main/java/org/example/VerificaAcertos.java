package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class VerificaAcertos {
    private ArrayList<Integer> numerosEscolhidos;
    private ArrayList<Integer> numerosSorteados;

    public VerificaAcertos(ArrayList<Integer> numerosEscolhidos, ArrayList<Integer> numerosSorteados) {
        this.numerosEscolhidos = numerosEscolhidos;
        this.numerosSorteados = numerosSorteados;
    }

    private boolean numerosEscolhidosValidos() {
        int tamanho = numerosEscolhidos.size();
        return tamanho >= 6 && tamanho <= 15 && Collections.max(numerosEscolhidos) <= 60 && Collections.min(numerosEscolhidos) >= 1;
    }
    public ArrayList<Integer> getNumerosSorteadosJogador() {
        return numerosEscolhidos;
    }
    private Integer verificaAcertosJogador() {
        Integer numeroDeAcertos = 0;
        if (numerosEscolhidosValidos()) {
            for (Integer numeroJogadorSorteado : numerosEscolhidos) {
                if (numerosSorteados.contains(numeroJogadorSorteado)) {
                    numeroDeAcertos++;
                }
            }
        }
        return numeroDeAcertos;
    }

    public Integer getNumeroDeAcertos() {
        return verificaAcertosJogador();
    }
}