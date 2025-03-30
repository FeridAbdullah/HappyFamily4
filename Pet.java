package az.edu.bhos.lesson11;

public abstract class Pet {
    String name;
    int age;
    int trickLevel;
    Species species;

    public Pet(String name, int age, int trickLevel) {
        this.name = name;
        this.age = age;
        this.trickLevel = trickLevel;
    }

    public abstract void respond();
    public abstract void foul();
    
    public void eat() {
        System.out.println("I am eating.");
    }

    public void setSpecies(Species species) {
        this.species = species;
    }
}
