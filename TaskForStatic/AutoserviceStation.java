package TaskForStatic;
import java.util.Random;

class AutoserviceStation{
    public static int maxFixValue = 150;

    public static void StationFix(Car car){
        Random rnd = new Random();
        int value = rnd.nextInt(maxFixValue);
        if (value<30) {
            value+=30;
        }
        car.FixCar(value);
    }

    public void fixAutoserviceStation(Car car) {
    }
}