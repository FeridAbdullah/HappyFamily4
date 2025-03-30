package az.edu.bhos.lesson11;

public class RoboCat extends Pet {
    public RoboCat(String name, int age, int trickLevel) {
        super(name, age, trickLevel);
    }

    @Override
    public void respond() {
        System.out.println("I am RoboCat. I obey my programming.");
    }

    @Override
    public void foul() {
        System.out.println("I cannot foul. I am a robot.");
    }
}
