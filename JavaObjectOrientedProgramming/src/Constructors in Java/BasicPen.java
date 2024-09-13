class Pen
{
    String colour;
    String type;

    public void write()
    {
        System.out.println("Pen is writing!");
    }

    public void PrintColour()
    {
        System.out.println(this.colour);
    }
}

public class BasicPen
{
    public static void main(String[] args)
    {
        Pen p1 = new Pen();
        p1.colour = "Blue";
        p1.type = "Ballpoint";

        Pen p2 = new Pen();
        p2.colour = "Black";
        p2.type = "Gel";

        p1.PrintColour();
        p2.PrintColour();
    }
}