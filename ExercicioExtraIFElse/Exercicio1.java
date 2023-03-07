package ExercicioExtraIFElse;

import java.util.Scanner;

public class Exercicio1 {
    Scanner sc = new Scanner(System.in);

    // Resolução do Exercício 1 extra
    public void Ex1() {
        System.out.println("Digite um número");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Portanto o número será par");
        } else {
            System.out.println("Portanto o número será ímpar");
        }
    }

    // Resolução do Exercício 2 extra
    public void Ex2() {
        System.out.println("Digite a sua nota");
        int nota = sc.nextInt();
        if (nota >= 7) {
            System.out.println("Parabéns você foi aprovado!");
        } else if (nota >= 5 && nota <= 7) {
            System.out.println("Você tem direto a uma recuperação!");
        } else {
            System.out.println("Você foi reprovado!");
        }
    }

    // Resolução do Exercício 3 extra
    public void Ex3() {
        System.out.println("Digite uma letra");
        String N = sc.next();
        if (N.equalsIgnoreCase("a") || N.equalsIgnoreCase("e") || N.equalsIgnoreCase("i") || N.equalsIgnoreCase("o")
                || N.equalsIgnoreCase("u")) {
            System.out.println("A letra digitada é uma vogal");
        } else {
            System.out.println("A letra digitada é uma consoante");
        }
    }

    // Resolução do Exercício 4 extra
    public void Ex4() {
        System.out.println("Qual o salário do colaborador ?");
        double salario = sc.nextDouble();
        double aumento =0.0;
        int percentualdeaumento = 0;
        if (salario <= 1280) {
        aumento = salario*20/100;
        percentualdeaumento = 20;
        }
        else if (salario>=1280 && salario<=1700) {
        aumento = salario*15/100;
        percentualdeaumento = 15;
        }
        else if (salario>=1700 && salario<=2500) {
            aumento = salario*10/100;
            percentualdeaumento = 10;
        } 
        else if (salario>=2500) {
            aumento = salario*5/100;
            percentualdeaumento = 5;
        }
        double salarioFinal = salario + aumento;
        System.out.println("Seu salário era de R$" + salario + "contendo um aumento de R$" + percentualdeaumento +
        "% que vale R$" + aumento + "seu novo salário será de R$" + salarioFinal);
    }

    // Resolução do Exercício 5 extra
    public void Ex5() {

    }
}
