package questao_4;

public class TesteZoologico {
	public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        Animal tigre = new Mamifero("Tigre", "Panthera tigris", 6, Habitate.TERRESTRE);
        Animal orca = new Animal("Orca", "Orcinus orca", 4, Habitate.AQUATICO);
        Animal coruja = new Animal("Coruja", "Tyto furcata", 1, Habitate.AEREO);

        zoologico.cadastrarAnimal(tigre);
        zoologico.cadastrarAnimal(orca);
        zoologico.cadastrarAnimal(coruja);

        zoologico.listarAnimaisPorHabitat(Habitate.TERRESTRE);
        zoologico.listarAnimaisPorHabitat(Habitate.AQUATICO);
        zoologico.listarAnimaisPorHabitat(Habitate.AEREO);
    }
}
