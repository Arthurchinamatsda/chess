package Model.PecasDoXadrez;

import Model.Pecas;

public class Cavalo extends Pecas {
    public String cavalo(String cor){
        setNome("CAVALO ");
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
