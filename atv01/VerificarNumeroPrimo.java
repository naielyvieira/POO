import java.util.Scanner;

public class VerificarNumeroPrimo {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe um número para verificar se é primo: ");
        int numero = scanner.nextInt();


        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }


        scanner.close();
    }


    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }


        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
