package Matriz;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.BorderUIResource.MatteBorderUIResource;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // criar, preencher e manipular uma matriz
        // declarar a matriz
        int matriz[][] = new int[10][9]; // vetor de duas dimensões
        // preencher a matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Matriz[" + i + "][" + j + "] =");
                matriz[i][j] = rd.nextInt(9);
            }
        }
        // impressão dos elementos da matriz individual
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Matriz[" + i + "][" + j + "]= " + matriz[i][j]);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" | ");
        }
        // soma dos termos da quarta linha
        int somaLinha = 0;
        for (int i = 0; i < matriz[3].length; i++) {
            somaLinha += matriz[3][i];
        }
        int somaColuna = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaColuna += matriz[i][3];
        }
        System.out.println(
                " A soma da quarta linha é: " + somaLinha + " e a soma da quarta coluna é: " + somaColuna);
    }

    public void exercicio1() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" | ");
        }

        // exercicio 2

        
       

    }
    public void exercicio2a() {
        int matriz[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz[" + i + "][" + j + "] =");
                matriz[i][j] = rd.nextInt(9);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" | ");
        }

        System.out.println("A matriz transposta fica:");
        int matrizt[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizt[i][j] = matriz[j][i];
            }
        }
        for (int i = 0; i < matrizt.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matrizt[0].length; j++) {
                System.out.print(matrizt[i][j]);
            }
            System.out.println(" | ");
        }

        //soma dos elementos na diagonal principal

        int somaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if ( i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }
        System.out.println("A soma da diagonal principal é de: "+somaDiagonal);

    }
}