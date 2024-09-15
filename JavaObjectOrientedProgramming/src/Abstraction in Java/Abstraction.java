abstract class Animal
{
    abstract public void walk();
}

class Horse extends Animal
{
    public void walk()
    {
        System.out.println("A horse walks on 4 legs");
    }
}

class Chicken extends Animal
{
    public void walk()
    {
        System.out.println("A chicken walks on 2 legs");
    }
}

public class Abstraction
{
    public static void main(String[] args)
    {
        Horse horse = new Horse();
        horse.walk();
    }
}