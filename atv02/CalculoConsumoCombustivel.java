package atv02;

import java.util.Scanner;

public class CalculoConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempoViagem = scanner.nextDouble();


        System.out.print("Digite a velocidade média durante a viagem (em Km/h): ");
        double velocidadeMedia = scanner.nextDouble();


        double distanciaPercorrida = tempoViagem * velocidadeMedia;


        double litrosUsados = distanciaPercorrida / 12;


        System.out.println("\nResultados da Viagem:");
        System.out.printf("Velocidade Média: %.2f Km/h\n", velocidadeMedia);
        System.out.printf("Tempo Gasto: %.2f horas\n", tempoViagem);
        System.out.printf("Distância Percorrida: %.2f Km\n", distanciaPercorrida);
        System.out.printf("Quantidade de Litros Utilizada: %.2f litros\n", litrosUsados);


        scanner.close();
    }
}
