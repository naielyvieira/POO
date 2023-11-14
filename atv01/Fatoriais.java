public class Fatoriais {
    public static void main(String[] args) {
        System.out.println("Fatoriais de 1 a 10:");


        for (int i = 1; i <= 10; i++) {
            long fatorial = calcularFatorial(i);
            System.out.println("O fatorial de " + i + " é: " + fatorial);
        }
    }


    private static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}
