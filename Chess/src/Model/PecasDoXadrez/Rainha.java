package Model.PecasDoXadrez;

import Model.Pecas;

import java.util.Scanner;

public class Rainha extends Pecas {
    public String reinha(String cor){
        setNome("DAMA ");
        String nome;
        nome = getNome();
        setCor(cor);
        String cores;
        cores = getCor();
        String pecas;
        pecas = nome + cores;
        return pecas;
    }

    @Override
    public void selecionarPecas() {
        super.selecionarPecas();
    }
}
