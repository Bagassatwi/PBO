public class PatrolRobot extends Robot {
  public Battery RobotBattery;

  public PatrolRobot(String Name, int cpuSpeed, int power, Battery robotBattery) {
    super("PATROL " + Name, cpuSpeed, power);
    RobotBattery = robotBattery;
  }

  @Override
  public void increasePower() {
    super.Power += 20;
  }
}
