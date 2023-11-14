import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();

     
        double percentualAumento;
        if (salarioAtual <= 280) {
            percentualAumento = 0.2;
        } else if (salarioAtual <= 700) {
            percentualAumento = 0.15;
        } else if (salarioAtual <= 1500) {
            percentualAumento = 0.1;
        } else {
            percentualAumento = 0.05;
        }


        double aumento = salarioAtual * percentualAumento;
        double novoSalario = salarioAtual + aumento;


        System.out.println("\nResumo do Reajuste:");
        System.out.printf("Salário antes do reajuste: R$ %.2f\n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.2f%%\n", percentualAumento * 100);
        System.out.printf("Valor do aumento: R$ %.2f\n", aumento);
        System.out.printf("Novo salário após o aumento: R$ %.2f\n", novoSalario);


        scanner.close();
    }
}
