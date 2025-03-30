package az.edu.bhos.lesson11;

import java.util.Random;

public class HumanCreatorImpl implements HumanCreator {
    private static final String[] NAMES = {"Alice", "Bob", "Charlie", "David", "Eva"};

    @Override
    public Human bornChild(String motherName, String fatherName) {
        Random random = new Random();
        boolean isMale = random.nextBoolean();
        String name = NAMES[random.nextInt(NAMES.length)];
        Human child = isMale ? new Man() : new Woman();
        child.name = name;
        child.surname = fatherName;
        return child;
    }
}
