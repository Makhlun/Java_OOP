package TaskForStatic;
class Car{
    public String name;
    public int damage=0;

    public Car(String name,  int damage)
    {
        this.name = name;
        this.damage = damage;
    }
    public Car(String name)
    {
        this.name = name;
    }

    public void addDamage(int value)
    {
        damage-=value;
    }
    public void setDamage(int value)
    {
        damage = value;
    }
    public void FixCar (int value)
    {
        damage+=value;
    }
}