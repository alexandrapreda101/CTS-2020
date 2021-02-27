package seminar1;

import clase.Animal;
import clase.Tiger;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Tiger tiger1 = new Tiger("Harry");
		Tiger tiger2 = new Tiger("Meghan");
		Animal tiger3 = new Tiger("Anna");
		zoo.adaugareAnimal(tiger1);
		zoo.adaugareAnimal(tiger2);
		zoo.adaugareAnimal(tiger3);
		zoo.feedAllAnimals();
		
	}
}
