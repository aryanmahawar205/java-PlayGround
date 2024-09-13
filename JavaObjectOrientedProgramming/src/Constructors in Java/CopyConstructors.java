// A COPY CONSTRUCTOR IS ONW WHICH IS USED TO SET UP OTHER OBJECTS USING AN ALREADY CREATED OBJECT
// KIND OFF LIKE COPYING THE DATA OF ONE OBJECT TO ANOTHER OBJECT

class Dog
{
    String colour;
    String breed;

    // parametrized constructor
    Dog(String aColour, String aBreed)
    {
        this.colour = aColour;
        this.breed = aBreed;
    }

    // copy constructor
    Dog(Dog aDog)
    {
        this.colour = aDog.colour;
        this.breed = aDog.breed;
    }

    public void printInfo()
    {
        System.out.println(this.colour);
        System.out.println(this.breed);
    }
}


public class CopyConstructors
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog("White", "Husky");

        Dog d2 = new Dog(d1);

        d2.printInfo();
    }
}