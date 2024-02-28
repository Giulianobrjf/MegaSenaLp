package org.example;

import java.util.ArrayList;
import java.util.Random;

public class NumerosSorteados {

    ArrayList<Integer> numerosSorteados  = new ArrayList<>();

    public NumerosSorteados() {
        this.numerosSorteados = sorteiaNumerosVencedores();
    }
    public ArrayList<Integer> getNumerosSorteados() {
        return numerosSorteados;
    }

    private ArrayList<Integer> sorteiaNumerosVencedores() {
        ArrayList<Integer> sorteio = new ArrayList<>();
        Random random = new Random();
        while (sorteio.size() < 6) {
            int numeroDaVez = random.nextInt(60) + 1;
            if (!sorteio.contains(numeroDaVez)) {
                sorteio.add(numeroDaVez);
            }
        }
        return sorteio;
    }
}