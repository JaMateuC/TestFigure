public class Cercle extends Figura{

    private double radi;

    public Cercle(double radi) {
        this.radi = radi;
    }

    public double area() {

        return Math.PI*2*this.radi;

    }
}
