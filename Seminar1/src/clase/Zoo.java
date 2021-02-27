package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> lista;
	
	public Zoo(Zookeeper zookeeper, List<Animal> lista) {
		super();
		this.zookeeper = zookeeper;
		
		this.lista = lista;
	}
	
	
	public Zoo() {
		super();
		
		this.zookeeper= new Zookeeper("Maria");
		this.lista = new ArrayList();
	}
	
	public void adaugareAnimal(Animal animal) {
		lista.add(animal);
	}
	
	public void feedAllAnimals() {
		for(Animal a:lista) {
			zookeeper.feed(a);
		}
	}
}


