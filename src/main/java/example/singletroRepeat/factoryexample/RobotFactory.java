package example.singletroRepeat.factoryexample;

public class RobotFactory {

    public Robot makeRobot(String robotType) {
        if (robotType == "dog") {
            return new RobotDog();
        }
        return null;
    }

}
