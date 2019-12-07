package factory.Robot;

public class RobotFactory {

    public  Robot makeRobot(String robotType) {

        if (robotType == "ROBOT_PIES") {
            return new PiesRobot();

        } else if (robotType == "KROWA_ROBOT") {
            return new KrowaRobot();
        }
        return null;
    }
}