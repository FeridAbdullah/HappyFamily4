package az.edu.bhos.lesson11;

public class DomesticCat extends Pet implements Foulable {
    public DomesticCat(String name, int age, int trickLevel) {
        super(name, age, trickLevel);
    }

    @Override
    public void respond() {
        System.out.println("I am Domestic Cat! Meow!");
    }

    @Override
    public void foul() {
        System.out.println("Oops! I made a mess.");
    }
}
