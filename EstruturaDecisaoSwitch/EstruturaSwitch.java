package EstruturaDecisaoSwitch;

import java.text.BreakIterator;
import java.util.Scanner;

public class EstruturaSwitch {
    Scanner sc = new Scanner(System.in);
    
    public void letra() {
        System.out.println("Digite uma letra (minúscula)");
        String letra = sc.next();
        String tipoDeLetra = "";
        switch (letra) {
            case "a" : tipoDeLetra = "Vogal" ;
            break;
            case "e" : tipoDeLetra = "Vogal";
            break;
            case "i" : tipoDeLetra = "Vogal";
            break;
            case "o" : tipoDeLetra = "Vogal";
            break;
            case "u" : tipoDeLetra = "Vogal";
            break;
            default: tipoDeLetra = "Consoante";
            break;
        }
        System.out.println("A letra que você digitou é uma : "+tipoDeLetra);

    }
    public void mes() {
        System.out.println("Digite um número correspondente a um mês:");
        int numeroMes = sc.nextInt();
        String mes = "";
        switch (numeroMes) {
            case 1 : mes = "Janeiro";
            break;
            case 2 : mes = "Fevereiro";
            break;
            case 3 : mes = "Março";
            break;
            case 4 : mes = "Abril";
            break;
            case 5 : mes = "Maio";
            break;
            case 6 : mes = "Junho";
            break;
            case 7 : mes = "Julho";
            break;
            case 8 : mes = "Agosto";
            break;
            case 9 : mes = "Setembro";
            break;
            case 10 : mes = "Outubro";
            break;
            case 11 : mes = "Novembro";
            break;
            case 12 : mes = "Dezembro";
            break;
            default : mes = "Esse número não corresponde a nenhum mês";
            break;
        }
        System.out.println("O mês correspondente a esse número é : "+mes);
        
    }
}