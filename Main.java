package az.edu.bhos.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human man = new Man();
        man.name = "John";
        man.surname = "Doe";

        Human woman = new Woman();
        woman.name = "Jane";
        woman.surname = "Doe";

        List<Human> children = new ArrayList<>();
        HumanCreator creator = new HumanCreatorImpl();

        children.add(creator.bornChild(woman.name, man.name));
        children.add(creator.bornChild(woman.name, man.name));

        Pet dog = new Dog("Buddy", 3, 7);
        Pet fish = new Fish("Goldie", 1, 5);
        Pet domesticCat = new DomesticCat("Whiskers", 2, 6);
        Pet roboCat = new RoboCat("RoboWhiskers", 1, 9);

        dog.setSpecies(Species.DOG);
        fish.setSpecies(Species.FISH);
        domesticCat.setSpecies(Species.CAT);
        roboCat.setSpecies(Species.ROBOCAT);

        System.out.println("Man greets pet: ");
        man.greetPet();
        System.out.println("Woman greets pet: ");
        woman.greetPet();

        System.out.println("\nPets respond: ");
        dog.respond();
        fish.respond();
        domesticCat.respond();
        roboCat.respond();

        System.out.println("\nPets fouling: ");
        if (dog instanceof Foulable) {
            ((Foulable) dog).foul();
        }
        if (domesticCat instanceof Foulable) {
            ((Foulable) domesticCat).foul();
        }

        System.out.println("\nChildren in the family:");
        for (Human child : children) {
            System.out.println(child.name + " " + child.surname);
        }

        deleteChild(children, children.get(0));
        System.out.println("\nChildren after removal:");
        for (Human child : children) {
            System.out.println(child.name + " " + child.surname);
        }

        System.out.println("\nTotal family members: " + countFamily(man, woman, children));
    }

    public static void deleteChild(List<Human> children, Human child) {
        if (children.contains(child)) {
            children.remove(child);
            System.out.println(child.name + " has been removed from the family.");
        } else {
            System.out.println(child.name + " does not exist in the family.");
        }
    }

    public static int countFamily(Human man, Human woman, List<Human> children) {
        return 2 + children.size();
    }
}
