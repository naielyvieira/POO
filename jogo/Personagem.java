package jogo;

// Classe base para Personagem
class Personagem {
    private String nome;
    private int vida;
    private Arma arma;
    private Poder poder;
    private int mana;

    public Personagem(String nome, int vida, Arma arma, Poder poder) {
        this.nome = nome;
        this.vida = vida;
        this.arma = arma;
        this.poder = poder;
        this.mana = 100; // Valor inicial da mana (ajustar conforme necessário)
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public Arma getArma() {
        return arma;
    }

    public Poder getPoder() {
        return poder;
    }

    public void sofrerDano(int dano) {
        this.vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
    }

    public boolean temManaSuficiente(int custoMana) {
        return this.mana >= custoMana;
    }

    public void gastarMana(int custoMana) {
        this.mana -= custoMana;
    }

    public void usarPoder(Personagem oponente) {
        if (this.getPoder() != null) {
            String nomePoder = this.getPoder().usarPoder(this, oponente);
            if (nomePoder != null) {
                System.out.println(this.getNome() + " usou o poder: " + nomePoder);
            }
        } else {
            System.out.println("Este personagem não possui um poder associado.");
        }
    }
}