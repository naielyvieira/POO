package atv02;

import java.util.Scanner;

public class InverterNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe um valor inteiro de três dígitos: ");
        int numeroOriginal = scanner.nextInt();


        if (numeroOriginal >= 100 && numeroOriginal <= 999) {
 
            int numeroInvertido = inverterNumero(numeroOriginal);

  
            System.out.println("O valor original é: " + numeroOriginal);
            System.out.println("O valor invertido é: " + numeroInvertido);
        } else {
            System.out.println("Por favor, informe um número de três dígitos.");
        }

  
        scanner.close();
    }


    private static int inverterNumero(int numero) {
        int digito1 = numero % 10;
        int digito2 = (numero / 10) % 10;
        int digito3 = numero / 100;

        return digito1 * 100 + digito2 * 10 + digito3;
    }
}
