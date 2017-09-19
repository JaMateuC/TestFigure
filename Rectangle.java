
public class Rectangle extends Figura{
    private double l1;
    private double l2;

    public Rectangle(double a, double b) {
        this.l1 = a;
        this.l2 = b;
    }

    public double area(){
        return this.l1*this.l2;
    }

}
