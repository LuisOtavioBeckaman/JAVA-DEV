package AulaRevisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);
    public void exercicio1() {
        System.out.println("Escreva a primeira nota do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.println("Escreva a segunda nota do aluno: ");
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;
        System.out.println("A média do aluno foi de: "+media);
        System.out.println("Escreva o total de aulas da disciplina");
        int totalAulas = sc.nextInt();
        System.out.println("Escreva o total de faltas do aluno: ");
        int faltas = sc.nextInt();
        double freq = (totalAulas-faltas)*100/totalAulas;
        System.out.println("A frequência do aluno foi de : "+freq+" %");
        if (media>=50 && freq>=75) {
            System.out.println("O aluno foi aprovado");
        } else if (media<50 && freq>=75) {
            System.out.println("O aluno está de recuperação");
        } else {
            System.out.println("O aluno está reprovado");

        }
    }
}