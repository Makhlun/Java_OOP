package TaskForStatic;

import java.util.Random;

class Driver
{
    public String name;
    public Car car;
    private static int maxFixValue = 20;

    public Driver (String name, Car car){
        this.name = name;
        this.car = car;
    }

    public void FixByDriver (){
        if (car.damage>=0)
        System.out.println(name + "'s car is OK");
        else if (car.damage<-30){
            System.out.println("Driver cannot do anything. He went to autoservice station.");
            FixByAutoserviceStation();
            System.out.println("Damage of car now " + car.damage);
        }
        else {
                Random rnd = new Random();
                boolean b = rnd.nextBoolean();
                int val =rnd.nextInt(maxFixValue);
                if (b){
                    System.out.println("Driver fixed his car to "+val);
                    car.FixCar(val);  
                }
                else{
                    System.out.println("Driver broke his car to "+val);
                    car.FixCar(-val);  
                }
            }
    }
    
    public void FixByAutoserviceStation (){
        if (car.damage<-150){
            System.out.println("Car finally broken.");
        }
        else if (car.damage >=0){
            System.out.println(name + "'s car is OK");
        }
        else{
            AutoserviceStation.StationFix(car);
        }
    }

    public void Drive(){
        Random rnd = new Random();
        car.addDamage(rnd.nextInt(50));
        System.out.println("Car damage now is " + car.damage);
        if (car.damage<=-150)
        {
            System.out.println("Car finnaly broken.");
            System.exit(0);
        }
    }
    
}