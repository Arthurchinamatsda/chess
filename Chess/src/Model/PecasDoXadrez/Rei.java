package Model.PecasDoXadrez;

import Model.Pecas;

public class Rei extends Pecas{
    public String rei(String cor){
        setNome("REI ");
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
