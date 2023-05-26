package CustoViagem;

public class CustoViagem {
    public static void main(String[] args) { 
        System.out.println("===Custo de Viagem==="); 
        double distanciaViagem = 600;
        System.out.println("Distância Total da Viagem é: "+distanciaViagem+"Km");
        double valorGasolina = 5;
        System.out.println("O valor do litro da Gasolina é: "+valorGasolina+"Reais");
        double distanciaPorLitro = 17;
        System.out.println("O veículo percorre "+distanciaPorLitro+"Km com 1L de gasolina");
        double quantidadeLitros = distanciaViagem/distanciaPorLitro;
        double custoViagem = quantidadeLitros*valorGasolina;
        System.out.println("O custo da Viagem será de "+custoViagem+" Reais");
}
}