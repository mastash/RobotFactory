package example.singletroRepeat.factoryexample;

public class Main {
    public static void main(String[] args) {
        RobotFactory robotFactory = new RobotFactory();

        robotFactory.makeRobot("dog").work();

    }
}
