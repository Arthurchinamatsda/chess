package Movimentos;

import Model.Tabuleiro;

import java.util.Scanner;

public class Movimentos {
    Scanner peca = new Scanner(System.in);
    String nomeDaPecas = peca.nextLine().toUpperCase();
    Scanner cor = new Scanner(System.in);
    String corDaPeca = cor.nextLine().toUpperCase();

    public void setCorDaPeca( String corDaPeca) {
        this.corDaPeca = corDaPeca;
    }
}
