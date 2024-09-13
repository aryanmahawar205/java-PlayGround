class Person
{
    String name;
    int age;

    Person(String aName, int Aage)
    {
        this.name = aName;
        this.age = Aage;
    }

    public void display()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class ParametrizedConstructors
{
    public static void main(String[] agrs)
    {
        Person p1 = new Person("Aryan", 19);
        p1.display();
    }
}