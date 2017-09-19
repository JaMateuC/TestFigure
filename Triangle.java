

public class Triangle extends Figura{

    private double h;
    private double c;

    public Triangle(double h, double c) {
        this.h = h;
        this.c = c;
    }

    public double area(){

        return this.h*this.c/2;

    }
}
