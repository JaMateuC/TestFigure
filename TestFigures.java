package cualquiernombre;

public class TestFigures {
    public double sum(Figura[] f){
        double res = 0;

        for (Figura r:f){
            res = res+r.area();
        }
        return res;
    }
}
