package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final ColorSupplier supplier = new ColorSupplier();
    private static final int MAX_NUMBER = 100;

    public Lottery() {

    }

    public Ball getRandomBall() {
        String color = supplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER + 1);
        return new Ball(number, color);
    }
}
