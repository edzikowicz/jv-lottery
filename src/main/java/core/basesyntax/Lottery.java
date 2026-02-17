package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final ColorSupplier supplier = new ColorSupplier();

    public Lottery() {

    }

    public static Ball getRandomBall() {
        String color = supplier.getRandomColor();
        int number = random.nextInt(101);
        return new Ball(number, color);
    }
}
