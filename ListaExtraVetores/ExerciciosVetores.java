package ListaExtraVetores;

import java.util.Scanner;
import java.lang.Math;

public class ExerciciosVetores {
    Scanner sc = new Scanner(System.in);


    public void exercicio1() {
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        System.out.println("Preencha o vetor A de 5 posições para ter o valor do Vetor B");
        vetorA[0] = sc.nextInt();
        vetorA[1] = sc.nextInt();
        vetorA[2] = sc.nextInt();
        vetorA[3] = sc.nextInt();
        vetorA[4] = sc.nextInt();
        // valores vetorB:
        vetorB[0] = vetorA[0];
        vetorB[1] = vetorA[1];
        vetorB[2] = vetorA[2];
        vetorB[3] = vetorA[3];
        vetorB[4] = vetorA[4];
        System.out.println("Os valores do vetor B são: " + vetorB[0] + "; " + vetorB[1] + "; " + vetorB[2] + "; "
                + vetorB[3] + "; " + vetorB[4]);
    }

    public void exercicio2() {
        int vetorA[] = new int[8];
        int vetorB[] = new int[8];
        System.out.println("Preencha o vetor A de 8 posições para ter o valor de B");
        vetorA[0] = sc.nextInt();
        vetorA[1] = sc.nextInt();
        vetorA[2] = sc.nextInt();
        vetorA[3] = sc.nextInt();
        vetorA[4] = sc.nextInt();
        vetorA[5] = sc.nextInt();
        vetorA[6] = sc.nextInt();
        vetorA[7] = sc.nextInt();
        // valores B:
        vetorB[0] = 2 * vetorA[0];
        vetorB[1] = 2 * vetorA[1];
        vetorB[2] = 2 * vetorA[2];
        vetorB[3] = 2 * vetorA[3];
        vetorB[4] = 2 * vetorA[4];
        vetorB[5] = 2 * vetorA[5];
        vetorB[6] = 2 * vetorA[6];
        vetorB[7] = 2 * vetorA[7];
        System.out.println("Os valores do vetor B são: " + vetorB[0] + ", " + vetorB[1] + ", " + vetorB[2] + ", "
                + vetorB[3] + ", " + vetorB[4] + ", " + vetorB[5] + ", " + vetorB[6] + ", " + vetorB[7]);

    }

    public void exercicio3() {
        int vetorA[] = new int[15];
        int vetorB[] = new int[15];
        System.out.println("Preencha o vetor A de 15 posições para ter o valor de B");
        vetorA[0] = sc.nextInt();
        vetorA[1] = sc.nextInt();
        vetorA[2] = sc.nextInt();
        vetorA[3] = sc.nextInt();
        vetorA[4] = sc.nextInt();
        vetorA[5] = sc.nextInt();
        vetorA[6] = sc.nextInt();
        vetorA[7] = sc.nextInt();
        vetorA[8] = sc.nextInt();
        vetorA[9] = sc.nextInt();
        vetorA[10] = sc.nextInt();
        vetorA[11] = sc.nextInt();
        vetorA[12] = sc.nextInt();
        vetorA[13] = sc.nextInt();
        vetorA[14] = sc.nextInt();
        // valores de B:
        vetorB[0] = vetorA[0] * vetorA[0];
        vetorB[1] = vetorA[1] * vetorA[1];
        vetorB[2] = vetorA[2] * vetorA[2];
        vetorB[3] = vetorA[3] * vetorA[3];
        vetorB[4] = vetorA[4] * vetorA[4];
        vetorB[5] = vetorA[5] * vetorA[5];
        vetorB[6] = vetorA[6] * vetorA[6];
        vetorB[7] = vetorA[7] * vetorA[7];
        vetorB[8] = vetorA[8] * vetorA[8];
        vetorB[9] = vetorA[9] * vetorA[9];
        vetorB[10] = vetorA[10] * vetorA[10];
        vetorB[11] = vetorA[11] * vetorA[11];
        vetorB[12] = vetorA[12] * vetorA[12];
        vetorB[13] = vetorA[13] * vetorA[13];
        vetorB[14] = vetorA[14] * vetorA[14];
        System.out.println("Os valores do vetor B são: " + vetorB[0] + ", " + vetorB[1] + ", " + vetorB[2] + ", "
                + vetorB[3] + ", " + vetorB[4] + ", " + vetorB[5] + ", " + vetorB[6] + ", " + vetorB[7] + ", "
                + vetorB[8] + ", " + vetorB[9] + ", " + vetorB[10] + ", " + vetorB[11] + ", " + vetorB[12] + ", "
                + vetorB[13] + ", " + vetorB[14]);

    }
    public void exercicio4() {
        int vetorA[] = new int[15];
        int vetorB[] = new int[15];
        System.out.println("Preencha o vetor A de 15 posições para ter o valor de B");
        vetorA[0] = sc.nextInt();
        vetorA[1] = sc.nextInt();
        vetorA[2] = sc.nextInt();
        vetorA[3] = sc.nextInt();
        vetorA[4] = sc.nextInt();
        vetorA[5] = sc.nextInt();
        vetorA[6] = sc.nextInt();
        vetorA[7] = sc.nextInt();
        vetorA[8] = sc.nextInt();
        vetorA[9] = sc.nextInt();
        vetorA[10] = sc.nextInt();
        vetorA[11] = sc.nextInt();
        vetorA[12] = sc.nextInt();
        vetorA[13] = sc.nextInt();
        vetorA[14] = sc.nextInt();
        //valores de B:
        vetorB[0] = sqrt(vetorA[0]);
        vetorB[1] = sqrt(vetorA[1]);
        vetorB[2] = vetorA[2];
        vetorB[3] = vetorA[3];
        vetorB[4] = vetorA[4];
        vetorB[5] = vetorA[5];
        vetorB[6] = vetorA[6];
        vetorB[7] = vetorA[7];
        vetorB[8] = vetorA[8];
        vetorB[9] = vetorA[9];
        vetorB[10] = vetorA[10];
        vetorB[11] = vetorA[11];
        vetorB[12] = vetorA[12];
        vetorB[13] = vetorA[13];
        vetorB[14] = vetorA[14];
    }
    public void exercicio5() {
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        System.out.println("Preencha o vetor A de 15 posições para ter o valor de B");
        vetorA[0] = sc.nextInt();
        vetorA[1] = sc.nextInt();
        vetorA[2] = sc.nextInt();
        vetorA[3] = sc.nextInt();
        vetorA[4] = sc.nextInt();
        vetorA[5] = sc.nextInt();
        vetorA[6] = sc.nextInt();
        vetorA[7] = sc.nextInt();
        vetorA[8] = sc.nextInt();
        vetorA[9] = sc.nextInt();
        //valores B:
        vetorB[0] = vetorA[0] * 0;
        vetorB[1] = vetorA[1] * 1;
        vetorB[2] = vetorA[2] * 2;
        vetorB[3] = vetorA[3] * 3;
        vetorB[4] = vetorA[4] * 4;
        vetorB[5] = vetorA[5] * 5;
        vetorB[6] = vetorA[6] * 6;
        vetorB[7] = vetorA[7] * 7;
        vetorB[8] = vetorA[8] * 8;
        vetorB[9] = vetorA[9] * 9;
        System.out.println("Os valores do vetor B são: " + vetorB[0] + ", " + vetorB[1] + ", " + vetorB[2] + ", "
                + vetorB[3] + ", " + vetorB[4] + ", " + vetorB[5] + ", " + vetorB[6] + ", " + vetorB[7] + ", "
                + vetorB[8] + ", " + vetorB[9]);
    }
}