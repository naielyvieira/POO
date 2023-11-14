package atv02;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();


        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;


        System.out.printf("Temperatura em Fahrenheit: %.2f\n", temperaturaFahrenheit);

        
        scanner.close();
    }
}

