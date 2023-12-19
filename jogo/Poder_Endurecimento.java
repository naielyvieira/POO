package jogo;

public class Poder_Endurecimento extends Poder {
    public Poder_Endurecimento() {
        super("Endurecimento", 70, 90);
    }

    @Override
    public String usarPoder(Personagem atacante, Personagem oponente) {
        if (atacante.temManaSuficiente(getCustoMana())) {
            System.out.println(atacante.getNome() + " usa " + getNome() + "!");
            oponente.sofrerDano(getDano());
            atacante.gastarMana(getCustoMana());
            System.out.println("Dano causado: " + getDano());
            System.out.println("O oponente está endurecido!");
            return getNome();
        } else {
            System.out.println("Mana insuficiente para usar " + getNome() + ".");
            return null;
        }
    }
}