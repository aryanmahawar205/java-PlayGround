package Polymorphism;

class Triangle extends Shapes
{
    // annotation added for just to check overriding
    @Override
    void area()
    {
        System.out.println("Area function in Triangle class");
    }
}