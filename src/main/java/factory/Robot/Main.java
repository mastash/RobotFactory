package factory.Robot;

public class Main {
    public static void main(String[] args) {

        RobotFactory robotFactory = new RobotFactory();

        Robot piesRobot = robotFactory.makeRobot("ROBOT_PIES");
        Robot krowaRobot = robotFactory.makeRobot("KROWA_ROBOT");

        piesRobot.work();
        krowaRobot.work();


    }
}
