package ExercicioVetores;

import java.util.Scanner;

public class ExercicioVetores {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int[] valores = new int[5];// vetor com valores não preenchidos
        int[] valores2 = new int[] { 1, 2, 3, 4, 5 };// vetor com valores não preenchidos
        System.out.println("Preencha o vetor de 5 posições");
        valores[0] = sc.nextInt();
        valores[1] = sc.nextInt();
        valores[2] = sc.nextInt();
        valores[3] = sc.nextInt();
        valores[4] = sc.nextInt();
        System.out.println("O valor da posição 1 é: " + valores[0]);
        System.out.println("O valor da posição 2 é: " + valores[1]);
        System.out.println("O valor da posição 3 é: " + valores[2]);
        System.out.println("O valor da posição 4 é: " + valores[3]);
        System.out.println("O valor da posição 5 é: " + valores[4]);
    }

    public void exercicio2() {
        double[] numeros = new double[10];
        numeros[0] = sc.nextDouble();
        numeros[1] = sc.nextDouble();
        numeros[2] = sc.nextDouble();
        numeros[3] = sc.nextDouble();
        numeros[4] = sc.nextDouble();
        numeros[5] = sc.nextDouble();
        numeros[6] = sc.nextDouble();
        numeros[7] = sc.nextDouble();
        numeros[8] = sc.nextDouble();
        numeros[9] = sc.nextDouble();
        System.out.println("A ordem inversa fica:");
        System.out.println("10ª posição:" + numeros[9]);
        System.out.println("9ª posição:" + numeros[8]);
        System.out.println("8ª posição:" + numeros[7]);
        System.out.println("7ª posição:" + numeros[6]);
        System.out.println("6ª posição:" + numeros[5]);
        System.out.println("5ª posição:" + numeros[4]);
        System.out.println("4ª posição:" + numeros[3]);
        System.out.println("3ª posição:" + numeros[2]);
        System.out.println("2ª posição:" + numeros[1]);
        System.out.println("1ª posição:" + numeros[0]);
    }

}