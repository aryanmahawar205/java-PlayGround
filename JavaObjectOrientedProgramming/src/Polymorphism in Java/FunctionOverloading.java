// FUNCTION OVERLOADING IS A TYPE OF POLYMORPHISM IN JAVA ALSO KNOWN AS "COMPILE TIME POLYMORPHISM"

class Add
{
    int x, y;

    Add(int aX, int aY)
    {
        this.x = aX;
        this.y = aY;
    }

    public int computeSum(int num1)
    {
        return num1;
    }

    public int computeSum(int num1, int num2)
    {
        return (num1 + num2);
    }
}

public class FunctionOverloading
{
    public static void main(String[] args)
    {
        Add obj = new Add(5, 6);
        int firstValue = obj.computeSum(obj.x);
        int secondValue = obj.computeSum(obj.x, obj.y);

        System.out.println(firstValue);
        System.out.println(secondValue);
    }
}