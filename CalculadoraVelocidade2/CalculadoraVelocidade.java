package CalculadoraVelocidade2;

import java.util.Scanner;

public class CalculadoraVelocidade {
    Scanner sc = new Scanner(System.in);
    public void calcular() {
        System.out.println("Informe a Distância Percorrida");

double distanciaPercorrida = sc.nextDouble();
System.out.println("Informe o Tempo Gasto");
double tempoGasto = sc.nextDouble();
double velocidadeMedia = distanciaPercorrida/tempoGasto;
System.out.println("a Velocidade Média é"
+ velocidadeMedia + "Km/h");


    }
    public void destino() {
        System.out.println("Informe o Seu Ponto de Origem");
        String origem = sc.next();
        System.out.println("Informe o ponto de destino");
        String destino = sc.next();
        System.out.println("Então Você irá de"
        + origem +" até" + destino);
    }
}
