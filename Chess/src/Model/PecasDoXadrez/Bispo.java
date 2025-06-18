package Model.PecasDoXadrez;

import Model.Pecas;

import java.util.Scanner;

public class Bispo extends Pecas {
    public String bispo(String cor){
        setNome("BISPO ");
        String nome;
        nome = getNome();
        setCor(cor);
        String Cores;
        Cores = getCor();
        String pecas;
        pecas = nome + Cores;
        return pecas;
    }


}
