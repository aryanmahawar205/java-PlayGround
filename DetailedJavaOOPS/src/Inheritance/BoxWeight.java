package Inheritance;

class BoxWeight extends Box
{
    double w;

    BoxWeight(double l, double b, double h, double w)
    {
        //this.l = l; --> will give error cause explicitly BoxWeight does not have l, b, h

        // super is used to initialize values present in parent class
        super(l, w, h); //calls the parent class constructor
        this.w = w;
    }
}