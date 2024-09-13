// HIERARCHIAL INHERITANCE MEANS THERE WILL BE ONE BASE CLASS AND MULTIPLE DERIVED CLASSES
// ALL THE DERIVED CLASSES INHERIT FROM THAT ONE BASE CLASS ITSELF

class Car
{
    public void displayInfo()
    {
        System.out.println("Generic car...");
    }
}

class Koenigsegg extends Car
{
    public void displayInfo()
    {
        System.out.println("I am a Koenigsegg");
    }
}

class WMotors extends Car
{
    public void displayInfo()
    {
        System.out.println("I am Fenyr Supersport");
    }
}

public class HierarchialInheritance
{
    public static void main(String[] args)
    {
        WMotors wm = new WMotors();
        wm.displayInfo();

        Koenigsegg koe = new Koenigsegg();
        koe.displayInfo();

        Car c = new Car();
        c.displayInfo();
    }
}