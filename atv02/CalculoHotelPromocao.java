package atv02;

import java.util.Scanner;

public class CalculoHotelPromocao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor da diária normal: ");
        double diariaNormal = scanner.nextDouble();


        double taxaPromocao = 0.22;


        double ocupacaoMediaSemPromocao = 0.4;
        double ocupacaoMediaComPromocao = 0.7;


        double diariaPromocao = diariaNormal * (1 - taxaPromocao);

 
        double valorMedioSemPromocao = diariaNormal * ocupacaoMediaSemPromocao * 30;


        double valorMedioComPromocao = diariaPromocao * ocupacaoMediaComPromocao * 30;


        double lucroPrejuizo = valorMedioComPromocao - valorMedioSemPromocao;


        System.out.printf("\n(a) O valor da diária no período da promoção: R$ %.2f\n", diariaPromocao);
        System.out.printf("(b) O valor médio arrecadado sem a promoção, durante um mês: R$ %.2f\n", valorMedioSemPromocao);
        System.out.printf("(c) O valor médio arrecadado com a promoção, durante um mês: R$ %.2f\n", valorMedioComPromocao);
        System.out.printf("(d) Lucro ou prejuízo mensal com a promoção: R$ %.2f\n", lucroPrejuizo);


        scanner.close();
    }
}
