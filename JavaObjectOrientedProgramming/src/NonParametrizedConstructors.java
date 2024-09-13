class Student
{
    // non-parametrized constructor
    Student()
    {
        System.out.println("Constructor invoked...");
    }
}

public class NonParametrizedConstructors
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
    }
}