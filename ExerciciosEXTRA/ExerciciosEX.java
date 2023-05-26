package ExerciciosEXTRA;

import java.util.Scanner;

public class ExerciciosEX {
    Scanner sc = new Scanner(System.in);

    public void exerc1() {
        System.out.println("Digite um numero");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O numero é par");

        } else {
            System.out.println("o numero é ímpar");
        }
    }

    public void exerc2() {
        System.out.println("Qual foi a sua nota?");
        int nota = sc.nextInt();
        if (nota >= 7) {
            System.out.println("Parabéns , você passou direto!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Você terá direito a fazer uma recuperação");
        } else {
            System.out.println("Você foi reprovado , estude mais da próxima vez");
        }
    }

    public void exerc3() {
        System.out.println("Escreva uma letra");
        String letra = sc.next();
        if (letra.equals("a") || letra.equals("A") || letra.equals("e") || letra.equals("E") || letra.equals("u")
                || letra.equals("U") || letra.equals("I") || letra.equals("i") || letra.equals("o")
                || letra.equals("O")) {
            System.out.println("A letra que você escreveu é uma vogal");

        } else {
            System.out.println("A letra que você escreveu é uma consoante");
        }
    }

    public void exerc4() {
        System.out.println("Bem vindo, para começarmos nos informe seu salario ?");
        double salario = sc.nextDouble();
        double aumento = 0.0;
        int percentaumento = 0;
        if (salario <= 1280) {
            aumento = salario * 20 / 100;
            percentaumento = 20;

        } else if (salario > 1280 && salario < 1700) {
            aumento = salario * 15 / 100;
            percentaumento = 15;
        } else if (salario > 1700 && salario < 2500) {
            aumento = salario * 10 / 100;
            percentaumento = 10;
        } else {
            aumento = salario * 5 / 100;
            percentaumento = 5;
        }
        double salarioFinal = salario + aumento;
        System.out.println("Bom então seu salario era de R$ " + salario + " e teve um aumento de " + percentaumento
                + "% que vale R$ " + aumento + " e seu novo salário será de R$ " + salarioFinal);
    }

    public void exerc5() {
        
    }
}