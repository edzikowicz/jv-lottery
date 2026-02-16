package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();

        System.out.println("Ball 1: number " + ball1.getNumber() + " color " + ball1.getColor());
        System.out.println("Ball 2: number " + ball2.getNumber() + " color " + ball2.getColor());
        System.out.println("Ball 3: number " + ball3.getNumber() + " color " + ball3.getColor());
        // create three balls using class Lottery and print information about them in console
    }
}
