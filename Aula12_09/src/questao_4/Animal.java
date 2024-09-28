package questao_4;

enum Habitate {
    TERRESTRE, AQUATICO, AEREO;
}

public class Animal {
	private String nome;
    private String especie;
    private int idade;
    private Habitate habitat;

    public Animal(String nome, String especie, int idade, Habitate habitat) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public Habitate getHabitat() {
        return habitat;
    }

    public String toString() {
        return "Nome: " + nome + ", Espécie: " + especie + ", Idade: " + idade + ", Habitat: " + habitat;
    }
}
