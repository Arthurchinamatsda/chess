package Model.PecasDoXadrez;

import Model.Pecas;

import java.util.Scanner;

public class Torre extends Pecas{
    public String Torres(String cor){
        setNome("TORRE ");
        String nome;
        nome = getNome();
        setCor(cor);
        String cores;
        cores = getCor();
        String pecas;
        pecas = nome + cores;
        return pecas;
    }
}
