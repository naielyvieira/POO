public class SerieFibonacci {
    public static void main(String[] args) {
        int limite = 100;
        int numeroAnterior = 0;
        int numeroAtual = 1;

        System.out.println("Série de Fibonacci até ultrapassar 100:");


        while (numeroAnterior <= limite) {
            System.out.print(numeroAnterior + " ");

            int proximoNumero = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;
        }
    }
}

