package ExemploVetores;

public class Vetores {
    public void exemplo1() {
        // Criando Um Vetor
        double[] valores = new double[]{23.6,44.7,88.9,77};
        System.out.println("1° posição - Indice [0]: "+valores[0]);
        System.out.println("2° posição - Indice [1]: "+valores[1]);
        System.out.println("3° posição - Indice [2]: "+valores[2]);
        System.out.println("4° posição - Indice [3]: "+valores[3]);
        //Mundando valores de uma posição definida
        valores[0] = 15.89; // Mudando o valor do indice 0
    
}
public void exemplo2() {
    int[] novoValores = new int[5];
    // outro jeito de escrever : int novoValores[]= new int[5];
    novoValores[0] = 10;
    novoValores[1] = 20;
    novoValores[2] = 30;
    novoValores[3] = 40;
    novoValores[4] = 50;
    System.out.println("O vetor é : posição [0] = "+novoValores[0]);
    System.out.println("O vetor é : posição [1] = "+novoValores[1]);
    System.out.println("O vetor é : posição [2] = "+novoValores[2]);
    System.out.println("O vetor é : posição [3] = "+novoValores[3]);
    System.out.println("O vetor é : posição [4] = "+novoValores[4]);
}
}