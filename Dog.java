package az.edu.bhos.lesson11;

public class Dog extends Pet implements Foulable {
    public Dog(String name, int age, int trickLevel) {
        super(name, age, trickLevel);
    }

    @Override
    public void respond() {
        System.out.println("Woof! I am a dog, your best friend.");
    }

    @Override
    public void foul() {
        System.out.println("I am fouling! Sorry, human!");
    }
}
