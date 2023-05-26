package IteracaoFor;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class ExercicioFor {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int vetorA[] = new int[5];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor do vetorA[" + i + "]=");
            vetorA[i] = sc.nextInt();
        }
        System.out.println("==============================================");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("O valor do vetorA[" + i + "] é " + vetorA[i]);
        }
    }

    public void exercicio2() {
        double vetorA[] = new double[10];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor do vetorA[" + i + "]=");
            vetorA[i] = sc.nextDouble();
        }
        for (int i = vetorA.length - 1; i >= 0; i--) {
            System.out.println("O valor do vetorA[" + i + "]= " + vetorA[i]);
        }
    }

    public void exercicio3() {
        double notas[] = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.println(" Digite a nota " + (i + 1));
            notas[i] = sc.nextDouble();
        }
        System.out.println("====================================");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("A nota " + (i + 1) + " é :" + notas[i]);
        }
        // calculando a média
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        System.out.println("E a média foi de : " + media);
    }

    public void exercicio4() {
        String letras[] = new String[10];
        System.out.println("Digite 10 caracteres");
        System.out.println("================================");
        for (int i = 0; i < letras.length; i++) {
            System.out.println(i + "º caracter");
            letras[i] = sc.nextLine();
            System.out.println("===============================");
        }
        int cont = 0;
        for (int i = 0; i < letras.length; i++) {
            System.out.println("O caracter " + i + " é : " + letras[i]);
            if (letras[i].equals("a") || letras[i].equals("A") || letras[i].equals("e") || letras[i].equals("E")
                    || letras[i].equals("i") || letras[i].equals("I") || letras[i].equals("o")
                    || letras[i].equals("O") || letras[i].equals("u") || letras[i].equals("U")) {
                System.out.println("O caracter " + i + " é uma vogal");
            } else {
                System.out.println("O caracter " + i + " é uma consoante");
                cont++;
            }
            System.out.println("=========================================");
        }
        System.out.println("O nº de consoantes foi de: " + cont);
    }

    public void exercicio4extra() {
        System.out.println("Digite uma palavra");
        String letras = sc.next();
        letras = letras.toLowerCase();
        System.out.println("================================");
        int cont = 0;
        for (int i = 0; i < letras.length(); i++) {
            char c = letras.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.println("O caracter " + c + " é uma vogal");
            } else {
                System.out.println("O caracter " + c + " é uma consoante");
                cont++;
            }
            System.out.println("=========================================");
        }
        System.out.println("O nº de consoantes foi de: " + cont);
    }

    public void exercicio5() {
        int vetorA[] = new int[20];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um numero inteiro para vetorA[" + i + "]");
            vetorA[i] = sc.nextInt();
        }
        int contPar = 0;
        int contImpar = 0;
        System.out.println("================================");
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                contPar++;

            } else {
                contImpar++;
            }
        }
        int vetorPAR[] = new int[contPar];
        int vetorIMPAR[] = new int[contImpar];
        // distribuir os nºs nos vetores par e impar
        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorPAR[contPar] = vetorA[i];
                contPar++;
            } else {
                vetorIMPAR[contImpar] = vetorA[i];
                contImpar++;
            }
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("O valor do vetorA[" + i + "]= " + vetorA[i]);
        }
        System.out.println("===================================");
        for (int i = 0; i < vetorPAR.length; i++) {
            System.out.println("O valor do vetorPAR[" + i + "]= " + vetorPAR[i]);
        }
        System.out.println("=====================================");
        for (int i = 0; i < vetorIMPAR.length; i++) {
            System.out.println("O valor do vetroIMPAR[" + i + "]= " + vetorIMPAR[i]);
        }
    }

    public void exercicio6() {
        double notas[] = new double[4];
        double medias[] = new double[10];
        int cont = 0;
        for (int i = 0; i < medias.length; i++) {
            for (int j = 0; j < notas.length; j++) {
                System.err.print("Informe a nota " + (j + 1) + " do aluno " + (i + 1) + " :");
                notas[j] = sc.nextDouble();
                medias[i] += notas[j]; 
            }
            medias[i] /= notas.length;
            if (medias[i] >= 7) {
                cont++;
            }
        }
        for (int i = 0; i < medias.length; i++) {
            System.out.println("A média do aluno "+(i+1)+" é : "+medias[i]);
        }
        System.out.println("O n° de aluno com a nota >=7 é de: "+cont);
    }

    public void exercicio1extras() {
        System.out.println("Digite seu nome de usuario:");
        String nomeDeUsuario = sc.next();
        nomeDeUsuario = nomeDeUsuario.toLowerCase();
        System.out.println("===========================");
        boolean tenteNovamente = true;
        while (tenteNovamente) {
            System.out.println("Digite sua senha");
            String senha = sc.next();
            senha = senha.toLowerCase();
            if (senha == nomeDeUsuario) {
                System.out.println("Parabéns , seu login foi feito com sucesso");
                tenteNovamente = false;
            } else {
                System.out.println("Erro!! Sua senha não pode ser igual ao nome de usuario");
            }
        }
    }

    public void exercicio2extras() {
        boolean nomeErro = true;
        while (nomeErro) {
            System.out.println("Digite seu nome");
            String nome = sc.next();
            nome = nome.toLowerCase();
            if (nome.length() > 3) {
                nomeErro = false;
            } else {
                System.out.print("Erro!!O nome deve ter mais quue 3 caracteres , tente novamente!");
            }
        }
        System.out.println("============================");
        boolean idadeErro = true;
        while (idadeErro) {
            System.out.println("Digite sua idade");
            int idade = sc.nextInt();
            if (idade > 0 && idade < 150) {
                idadeErro = false;
            } else {
                System.out.println("Erro!! A idade deve estar entre 0 e 150 anos , tente novamente!");
            }
        }
        System.out.println("============================");
        boolean salarioErro = true;
        while (salarioErro) {
            System.out.println("Digite seu salario");
            double salario = sc.nextDouble();
            if (salario > 0) {
                salarioErro = false;
            } else {
                System.out.println("Erro!! O salario deve ser maior que 0 , tente Novamente!");
            }
        }
        System.out.println("=================================");
        boolean sexoErro = true;
        while (sexoErro) {
            System.out.println("Informe seu sexo : ( 'f' para feminino / 'm' para masculino)");
            char sexo = sc.next();
            if (sexo == 'f' || sexo == 'm') {
                sexoErro = false;
            } else {
                System.out.println("Erro! As unicas opções são 'f' e 'm' , tente novamente");
            }
        }
        boolean estadoCivilErro = true;
        while (estadoCivilErro) {
            System.out.println(
                    "Informe seu sexo : ('s' para solteiro / 'c' para solteiro / 'd' para divorciado / 'v' para viuvo)");
            char estadoCivil = sc.next();
            if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'd' || estadoCivil == 'v') {
                estadoCivilErro = false;
            } else {
                System.out.println("Erro!! Você digitou uma opção inválida , tente novamente");
            }
        }
    }

    public void exercicios3extras() {
        int habA = 80000;
        int habB = 200000;
        double crescA = 0.03 * habA;
        double crescB = 0.015 * habB;
        double populacaoA;
        double populacaoB;
        int anos = 0;
        while (habA < habB) {
            populacaoA = habA + crescA;
            populacaoB = habB + crescB;
            anos++;
        }
        System.out.println("O n° de anos que se passaram até que as populações foi de:" + anos);
    }
}