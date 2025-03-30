package az.edu.bhos.lesson11;

public class Fish extends Pet {
    public Fish(String name, int age, int trickLevel) {
        super(name, age, trickLevel);
    }

    @Override
    public void respond() {
        System.out.println("I am a fish. I don't know what to do, but I swim!");
    }

    @Override
    public void foul() {
        System.out.println("I don't foul, I swim in the water.");
    }
}
