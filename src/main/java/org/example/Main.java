package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numerosEscolhidos = new ArrayList<>();
        numerosEscolhidos.add(1);
        numerosEscolhidos.add(5);
        numerosEscolhidos.add(7);
        numerosEscolhidos.add(10);
        numerosEscolhidos.add(60);
        numerosEscolhidos.add(20);



        NumerosSorteados ns = new NumerosSorteados();
        VerificaAcertos va = new VerificaAcertos(numerosEscolhidos,ns.getNumerosSorteados());
        PremioJogador pj = new PremioJogador(100000,va.getNumeroDeAcertos());

        System.out.println("Numeros escolhidos Jogador:"+ va.getNumerosSorteadosJogador()+" e os numeros vencedores eram: " + ns.getNumerosSorteados());
        System.out.printf("O jogador acertou: "+va.getNumeroDeAcertos()+" e ganhou: "+pj.getValorPremioRecebido());
    }
}