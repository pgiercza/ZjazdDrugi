import java.awt.*;

public class Passing {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Przed zmianą i" + i);
        chengIt(i);
        System.out.println("Po zmianie i" + i);

        Point p = new Point(1, 1);
        System.out.println("Przed zmianą p" + p);
        chengIt(p);
        System.out.println("Po zmianie p" + p);
    }

    static void chengIt(int i) {
        System.out.println("Zmieniam i ");
        i++;
    }

    static void chengIt(Point p) {
        p = new Point(9, 9);
        System.out.println("Zmieniam to na co wskazuje obecnie zmienna p ");
        p.x++;
    }
}
