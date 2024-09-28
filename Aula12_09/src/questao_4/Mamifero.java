package questao_4;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
    public Mamifero(String nome, String especie, int idade, Habitate habitat) {
        super(nome, especie, idade, habitat);
    }

    public void amamentar() {
        System.out.println(getNome() + " está amamentando.");
    }
}

class Zoologico {
    private List<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("Animal cadastrado: " + animal.getNome());
    }

    public void listarAnimaisPorHabitat(Habitate habitat) {
        System.out.println("Animais no habitat " + habitat + ":");
        for (Animal animal : animais) {
            if (animal.getHabitat() == habitat) {
                System.out.println(animal);
            }
        }
    }
}
