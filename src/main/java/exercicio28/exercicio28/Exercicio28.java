package exercicio28.exercicio28;

import javax.swing.*;

public class Exercicio28 {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int i, j;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha " + i + " e coluna " + j + ": "));
            }
        }

        int resp_a = 0;
        for (i = 0; i < 3; i++) {
            resp_a += A[i][0];
        }
        JOptionPane.showMessageDialog(null, "a) Soma dos elementos da primeira coluna: " + resp_a);

        int[] vetor_b = new int[3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                vetor_b[i] += A[j][i];
            }
        }
        JOptionPane.showMessageDialog(null, "b) \nColuna 0: " + vetor_b[0] +
                "\nColuna 1: " + vetor_b[1] +
                "\nColuna 2: " + vetor_b[2]);

        int produto_c = 1;
        for (i = 0; i < 3; i++) {
            produto_c *= A[0][i];
        }
        JOptionPane.showMessageDialog(null, "c) Produto dos elementos da primeira linha: " + produto_c);

        int soma_matriz_d = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                soma_matriz_d += A[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "d) Soma de todos os elementos da matriz: " + soma_matriz_d);

        int media_matriz_e = soma_matriz_d / 9;
        JOptionPane.showMessageDialog(null, "e) Média dos elementos da matriz: " + media_matriz_e);

        String maiores_media_f = "";
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (A[i][j] > media_matriz_e) {
                    maiores_media_f += A[i][j] + " ";
                }
            }
        }
        JOptionPane.showMessageDialog(null, "f) Elementos maiores que a média:\n" + maiores_media_f);

        int maior_g = A[0][0];
        int lin_maior = 0;
        int col_maior = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (A[i][j] > maior_g) {
                    maior_g = A[i][j];
                    lin_maior = i;
                    col_maior = j;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "g) Maior elemento da matriz e sua posição:\nMaior: " +
                maior_g + "\nLinha: " + lin_maior + "\nColuna: " + col_maior);

        int menor_h = A[0][0];
        int lin_menor = 0;
        int col_menor = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (A[i][j] < menor_h) {
                    menor_h = A[i][j];
                    lin_menor = i;
                    col_menor = j;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "h) Menor elemento da matriz e sua posição:\nMenor: " +
                menor_h + "\nLinha: " + lin_menor + "\nColuna: " + col_menor);
    }
}