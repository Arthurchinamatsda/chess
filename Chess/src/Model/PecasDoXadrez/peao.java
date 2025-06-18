package Model.PecasDoXadrez;

import Model.Pecas;

public class peao extends Pecas {
    public String Peao(String cor){
        setNome("PEÃO ");
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
