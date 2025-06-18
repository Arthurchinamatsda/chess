package Model;

import Model.PecasDoXadrez.*;

import java.util.Scanner;

public class Tabuleiro {
    peao peao1 = new peao();
    Torre torre1 = new Torre();
    Bispo bispo1 = new Bispo();
    Cavalo cavalo1 = new Cavalo();
    Rainha rainha1 = new Rainha();
    Rei rei1 = new Rei();
    String corTorreB = torre1.Torres("B");
    String corTorreP = torre1.Torres("P");
    String corBispoB = bispo1.bispo("B");
    String corBispoP = bispo1.bispo("P");
    String corCavaloB = cavalo1.cavalo("B");
    String corCavaloP = cavalo1.cavalo("P");
    String corRainhaB = rainha1.reinha("B");
    String corRainhaP = rainha1.reinha("P");
    String corReiB = rei1.rei("B");
    String corReiP = rei1.rei("P");
    String[][] tabuleiro1 = new String[9][9];
    public char letras(){
        for(char i = 'A' ; i<='Z' ; i++){
            char letra = i;
        }
        return ' ';
    }

    public void tabuleiroDeXadrez() {

        for(int linha = 0; tabuleiro1[1].length > linha; linha++) {
            tabuleiro1[linha][0] = String.valueOf(letras());
        }
        for (int coluna = 0; coluna < tabuleiro1[1].length; coluna++) {
            tabuleiro1[1][coluna] = peao1.Peao("B");
        }
        for (int coluna = 0; coluna < tabuleiro1[6].length; coluna++) {
            tabuleiro1[6][coluna] = peao1.Peao("P");
        }
        for (int i = 0; i < tabuleiro1.length; i++) {
            for (int j = 0; j < tabuleiro1[i].length; j++) {
                tabuleiro1[0][1] = corTorreB;
                tabuleiro1[0][8] = corTorreB;
                tabuleiro1[7][1] = corTorreP;
                tabuleiro1[7][8] = corTorreP;
                tabuleiro1[0][3] = corBispoB;
                tabuleiro1[0][8] = corBispoB;
                tabuleiro1[7][4] = corBispoP;
                tabuleiro1[7][8] = corBispoP;
                tabuleiro1[0][2] = corCavaloB;
                tabuleiro1[0][7] = corCavaloB;
                tabuleiro1[7][2] = corCavaloP;
                tabuleiro1[7][7] = corCavaloP;
                tabuleiro1[0][4] = corRainhaB;
                tabuleiro1[7][4] = corRainhaP;
                tabuleiro1[0][5] = corBispoB;
                System.out.print(tabuleiro1[i][j] + "  ");
            }
            System.out.println();
        }
        Scanner nomePecas = new Scanner(System.in);
        String nome = nomePecas.nextLine().toUpperCase();
        if(nome != corTorreP || nome != corTorreB || nome != corBispoB || nome !=  corBispoP)System.out.println("essa peça ja foi capturada ou não existe");
    }
}
