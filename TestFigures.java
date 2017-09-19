import java.util.Arrays;
import java.util.Comparator;

public class TestFigures {

    public static void main(String[] args){
        Figura[] f = new Figura[4];
        f[0] = new Cercle(4);
        f[1] = new Rectangle(2,3);
        f[2] = new Triangle(2,4);
        f[3] = new Cuadrado(2);

        System.out.println(sum(f));

        Comparator<Figura> areaComparator = new Comparator<Figura>() {
            public int compare(Figura o1, Figura o2) {
                return (int) (o1.area() - o2.area());
            }
        };

        Arrays.sort(f, areaComparator);
        comp(f);
    }

    public static double sum(Figura[] f){
        double res = 0;

        for (Figura r:f){
            res = res+r.area();
        }
        return res;
    }

    public static void comp(Figura[] f){

        for (Figura r:f) {
            System.out.println(r.area());
        }
    }
}
