package Cars;

import java.util.ArrayList;

/*2. В ArrayList, що містить не менше 3 об’єктів класу Car, що в свою чергу, містить поля
String model, String owner, int price, int produceYear, визначити факт наявності в колекції
автомобілів власника “Serg”. Завдання визначити двома способами:
– методом contains класу ArrayList;
– іншим нестандартним методом, створеним в класі Car або/та в окремому класі
Controller. */

public class Cars {
    public static void main(String[] args) throws Exception {
       ArrayList<Car> cars = new ArrayList<Car>();
        Car c1 = new Car("BMW", "Serg", 1799, 2000);
        Car c2 = new Car("Audi", "Sergey", 28000, 1910);
        Car c3 = new Car("Reno", "Serg", 102020, 1960);
        Car c4 = new Car("BMW", "Ser", 15000, 2020);
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        String owner = "Serg";
        ArrayList<String> owners = new ArrayList<>();
        for (Car car :cars) {
            owners.add(car.getOwner());
        }

        System.out.println(owners.contains(owner));

        for (Car  term : cars) {

            if(term.getOwner().equals(owner)){
                System.out.println(term.getOwner().equals(owner));
                break;
            }
        }
        

    }
}

class Car{
    private String model;
    private String owner;
    private int price;
    private int produceYear;
    public Car(String model, String owner, int price, int produceYear){
        this.model=model;
        this.owner=owner;
        this.price=price;
        this.produceYear=produceYear;
    }
    public Car(){}
    public String getModel(){
        return this.model;
    }
    public String getOwner(){
        return this.owner;
    }
    public int getPrice(){
        return this.price;
    }
    public int getProuceYear(){
        return this.produceYear;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setOwner(String owner){
        this.owner=owner;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setProuceYear(int produceYear){
        this.produceYear=produceYear;
    }
    public boolean equals(String owner)
    {
        return this.owner==owner;
    }
}
