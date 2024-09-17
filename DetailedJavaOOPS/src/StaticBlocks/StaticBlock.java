package StaticBlocks;

public class StaticBlock
{
    static int a = 4; // initializing static variable a here itself
    static int b;

    // int c; will cause error in line 13 if both lines uncommented
    // this is mainly because c in non-static and we are accessing and setting it up in static block

    static
    {
        System.out.println("In static block...");
        b = a*5; // initialize static variable b inside the static block
        // c = 5; will cause error in line 7 if both lines uncommented
    }

    public static void main(String[] args)
    {
        // static block runs here once and does its functions
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        // the static block will not be executed here
        // it only runs once and that run took place the first time the class was loaded
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}