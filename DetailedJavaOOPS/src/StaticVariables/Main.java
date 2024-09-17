package StaticVariables;

public class Main
{
    public static void main(String[] args)
    {
        Human aryan = new Human(19, "Aryan", 5000000, false);
        Human tarryn = new Human(19, "Tarryn", 5000000, true);

        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}