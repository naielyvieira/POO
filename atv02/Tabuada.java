package atv02;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número (1 a 9) para ver a tabuada: ");
        int numero = scanner.nextInt();


        if (numero >= 1 && numero <= 9) {
           
            System.out.println("\nTabuada do " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.printf("%d x %d = %d\n", numero, i, resultado);
            }
        } else {
            System.out.println("Por favor, digite um número válido entre 1 e 9.");
        }

       
        scanner.close();
    }
}

