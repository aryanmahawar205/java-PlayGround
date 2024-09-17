package SingletonClasses;

public class Main
{
    public static void main(String[] args)
    {
        Singleton obj1 = Singleton.getInstance(); // this one object is created
        Singleton obj2 = Singleton.getInstance(); // same object created above is referenced to obj2, nothing new is created...and so on

        // so basically both obj1 and obj2 point to the same instance created originally in obj1
    }
}