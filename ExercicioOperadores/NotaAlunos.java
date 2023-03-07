package ExercicioOperadores;

import java.util.Scanner;
 
public class NotaAlunos {
    public void alunos() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite a primeira Nota do Aluno");
            double nota1 = sc.nextDouble();
            System.out.println("Digite a Segunda Nota do Aluno");
            double nota2 = sc.nextDouble();
            System.out.println("Digite a Frequência do Aluno");
            double freq = sc.nextDouble();
            double  notaMedia = (nota1+nota2)/2;
            //Fazendo o mesmo mas com Operações de Atribuição
            // notaMedia = nota1;
            // notaMedia += nota2;
            // notaMedia /=2;
            boolean notaAprovado = notaMedia >= 50;
            boolean freqAprovado = freq >= 75;
            System.out.println("O aluno está APROVADO por nota? "+notaAprovado);
            System.out.println("O aluno está APROVADO por frequência? "+freqAprovado);  
            boolean resultadoFinal = (notaAprovado==true) && (freqAprovado==true);
            System.out.println("O aluno está APROVADO? "+resultadoFinal);
        }    
    }
    
}
