package atv02;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe sua idade em anos, meses e dias:");

        System.out.print("Anos: ");
        int anos = scanner.nextInt();

        System.out.print("Meses: ");
        int meses = scanner.nextInt();

        System.out.print("Dias: ");
        int dias = scanner.nextInt();


        int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);


        System.out.println("\nIdade expressa em dias: " + idadeEmDias);


        scanner.close();
    }


    private static int calcularIdadeEmDias(int anos, int meses, int dias) {
        final int DIAS_POR_ANO = 365;
        final int DIAS_POR_MES = 30; 

        return anos * DIAS_POR_ANO + meses * DIAS_POR_MES + dias;
    }
}
