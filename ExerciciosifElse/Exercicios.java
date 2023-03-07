package ExerciciosifElse;

import java.util.Scanner;

public class Exercicios {
     
        Scanner sc = new Scanner(System.in);
        public void ex1(){
            System.out.println("Informe o Primeiro Número ");
            double primeiroNumero = sc.nextDouble();
            System.out.println("Informe o Segundo Número ");
            double segundoNumero = sc.nextDouble();
            if (primeiroNumero >= segundoNumero){
                System.out.println("O Maior Número é " +primeiroNumero);
            }
            if (segundoNumero >= primeiroNumero){
                System.out.println("O Maior Número é " +segundoNumero);
            }
            
        }
            public void ex2(){
                System.out.println("Informe o Seu Ano de Nascimento ");
        int anoNasc = sc.nextInt();
        int idade = 2023 - anoNasc;
        if (idade > 16){
                System.out.println("Você Pode Votar ");}
             else{
                System.out.println("Você Não Pode Votar");
                }
            
        }
            public void ex3(){
                
            }
        
        }

