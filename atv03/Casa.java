package atv03;

public class Casa {
    
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;


    public Casa(String cor) {
        this.cor = cor;
        this.porta1 = new Porta();
        this.porta2 = new Porta();
        this.porta3 = new Porta();
    }

 
    public void pinta(String cor) {
        this.cor = cor;
    }


    public int quantasPortasEstaoAbertas() {
        int contador = 0;
        if (porta1.estaAberta()) {
            contador++;
        }
        if (porta2.estaAberta()) {
            contador++;
        }
        if (porta3.estaAberta()) {
            contador++;
        }
        return contador;
    }

  
    public static void main(String[] args) {
      
        Casa minhaCasa = new Casa("amarela");

       
        System.out.println("Cor da casa: " + minhaCasa.cor);

       
        minhaCasa.pinta("verde");
        System.out.println("Cor da casa após pintura: " + minhaCasa.cor);

       
        minhaCasa.porta1.abre();
        minhaCasa.porta2.abre();
        minhaCasa.porta3.abre();

        minhaCasa.porta2.fecha();

       
        System.out.println("Número de portas abertas na casa: " + minhaCasa.quantasPortasEstaoAbertas());
    }
}
