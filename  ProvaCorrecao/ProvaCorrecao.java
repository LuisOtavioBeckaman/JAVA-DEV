package ProvaCorrecao;

import java.util.Scanner;

public class ProvaCorrecao {
    Scanner sc = new Scanner(System.in);

    public void exercico1() {
        //1. Digitar o primeiro número
        System.out.println("Informe o primeiro valor:");
        double n1 = sc.nextDouble();
        //2. Digitar o segundo número 
        System.out.println("Informe o segundo número:");
        double n2 = sc.nextDouble();
        //3. escolher a operação
        System.out.println("Informe a operação desejada");
        System.out.println("1-Adição; 2-Subtração; 3-Multiplicação; 4-Divisão");
        int operacao = sc.nextInt();
        double resultado;
        if (operacao == 1) {
            resultado = n1 + n2;
            System.out.println("O resultado é :"+resultado);
        } else if (operacao == 2) {
            resultado = n1 - n2;
            System.out.println("O resultado é :"+resultado);
        } else if (operacao == 3) {
            resultado = n1*n2;
            System.out.println("O resultado é :"+resultado);
        } else if (operacao == 4 && n2!=0) {
            resultado = n1/n2;
            System.out.println("O resultado é :"+resultado);
        } else {
            System.out.println("Operação inexistente");
        }
    }
    public void exercicio2() {
        //declare o número de matrícula
        System.out.println("Informe o número da matrícula");
        int nMatricula = sc.nextInt();
        int grupo = nMatricula%4;
        if (nMatricula == 0) {
            System.out.println("Time do Chris");
        } else if (nMatricula == 1) {
            System.out.println("Time do Greg");
        } else if (nMatricula == 2) {
            System.out.println("Time do Caruso");
        } else {
            
        }

    }
}