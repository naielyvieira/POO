package atv02;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o valor do saque (valor inteiro): ");
        int valorSaque = scanner.nextInt();


        int notas100 = valorSaque / 100;
        int resto100 = valorSaque % 100;

        int notas50 = resto100 / 50;
        int resto50 = resto100 % 50;

        int notas10 = resto50 / 10;
        int resto10 = resto50 % 10;

        int notas5 = resto10 / 5;
        int notas1 = resto10 % 5;


        System.out.println("\nO valor do saque pode ser expresso em:");
        System.out.println(notas100 + " notas de 100");
        System.out.println(notas50 + " notas de 50");
        System.out.println(notas10 + " notas de 10");
        System.out.println(notas5 + " notas de 5");
        System.out.println(notas1 + " notas de 1");


        scanner.close();
    }
}

