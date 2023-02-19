package TaskForStatic;

public class StaticTask {
    public static void main(String[] args) throws Exception {
       Driver driver = new Driver ("John", new Car ("BMW"));
       driver.Drive();
       driver.Drive();
       driver.Drive();
       driver.FixByDriver();
       driver.Drive();
       driver.FixByAutoserviceStation();
       driver.FixByDriver();
       driver.Drive();
       driver.FixByAutoserviceStation();

    }
}
