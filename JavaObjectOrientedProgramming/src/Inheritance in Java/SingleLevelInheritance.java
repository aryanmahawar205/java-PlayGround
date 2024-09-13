// SINGLE LEVEL INHERITANCE IN JAVA MEANS ONE BASE CLASS AND ONE DERIVED CLASS

import org.w3c.dom.ls.LSOutput;

class Shape
{
    public void area()
    {
        System.out.println("Display area...");
    }
}

// derived class here is Triangle and base class is Shape
class Triangle extends Shape
{
    public void area(int b, int h)
    {
        System.out.println(0.5*b*h);
    }
}

public class SingleLevelInheritance
{
    public static void main(String[] args)
    {
        Triangle t1 = new Triangle();
        t1.area(2, 2);
    }
}