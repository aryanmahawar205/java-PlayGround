// MULTI LEVEL INHERITANCE IN JAVA MEANS ONE BASE CLASS, THEN A DERIVED CLASS
// AFTER THAT, ANOTHER DERIVED CLASS WHOSE BASE CLASS IS THE PREVIOUS DERIVED CLASS
// CHECK OUT THIS EXAMPLE TO FIND OUT

class SmartPhone
{
    public void whoAmI()
    {
        System.out.println("This is a generic smartphone...");
    }
}

// derived class here is Apple and base class is SmartPhone
class Apple extends SmartPhone
{
    public void whoAmI()
    {
        System.out.println("This is an Apple smartphone...");
    }
}

// derived class here is iPhone and base class is Apple
class iPhone extends Apple
{
    public void whoAmI()
    {
        System.out.println("I am an iPhone 12 mini...");
    }
}

public class MultiLevelInheritance
{
    public static void main(String[] args)
    {
        iPhone ip1 = new iPhone();

        ip1.whoAmI();
    }
}