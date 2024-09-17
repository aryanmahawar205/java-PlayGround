package SingletonClasses;

// Singleton Classes are those classes wherein at max you can create only 1 object

public class Singleton
{
    // constructor, to be called only once to ensure only 1 object is created
    private Singleton()
    {

    }

    private static Singleton instance;

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }

        return instance;
    }
}