package atv03;

public class Porta {
    
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

   
    public Porta() {

        this.aberta = false;
        this.cor = "branca";
        this.dimensaoX = 1.0;
        this.dimensaoY = 2.0;
        this.dimensaoZ = 0.1;
    }


    public void abre() {
        aberta = true;
    }


    public void fecha() {
        aberta = false;
    }


    public void pinta(String cor) {
        this.cor = cor;
    }


    public boolean estaAberta() {
        return aberta;
    }


    public static void main(String[] args) {

        Porta porta = new Porta();

 
        porta.abre();
        System.out.println("A porta está aberta? " + porta.estaAberta());

        porta.fecha();
        System.out.println("A porta está aberta? " + porta.estaAberta());


        porta.pinta("azul");
        System.out.println("Cor da porta: " + porta.cor);

        porta.pinta("vermelho");
        System.out.println("Cor da porta: " + porta.cor);


        porta.dimensaoX = 0.8;
        porta.dimensaoY = 1.9;
        porta.dimensaoZ = 0.05;

        System.out.println("Dimensões da porta: " + porta.dimensaoX + " x " + porta.dimensaoY + " x " + porta.dimensaoZ);
    }
}

