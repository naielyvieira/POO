package atv03;

public class Pessoa {

    private String nome;
    private int idade;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public void fazAniversario() {
        idade++;
    }


    public void imprimeIdade() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

 
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João", 25);


        System.out.println("Informações Iniciais:");
        pessoa.imprimeIdade();


        pessoa.fazAniversario();
        pessoa.fazAniversario();


        System.out.println("\nInformações após alguns aniversários:");
        pessoa.imprimeIdade();
    }
}

