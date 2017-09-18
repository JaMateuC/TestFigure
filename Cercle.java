package TESTF;

public class Cercle extends Figura{


    private double radi;

    public Cercle(double radi) {
        this.radi = radi;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public double area(double radi) {
        return Math.PI*2*radi;

    }
}
