public class Robot {
  public String Name;
  public int CPUSpeed;
  public int Power;

  public Robot(String name, int cPUSpeed, int power) {
    Name = name;
    CPUSpeed = cPUSpeed;
    Power = power;
  }

  public void increasePower() {
    this.Power += 10;
  }

  public void decreasePower() {
    this.Power -= 10;
  }

}