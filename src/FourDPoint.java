import java.awt.*;

public class FourDPoint extends Point {
    int z;
    int t;

    public static void main(String[] args) {
        FourDPoint fourDPoint = create(1, 2, 3, 4);
        fourDPoint.show();
    }

    static FourDPoint create(int x, int y, int z, int t) {
        FourDPoint fourDPoint = new FourDPoint();
        fourDPoint.x = x;
        fourDPoint.y = y;
        fourDPoint.z = z;
        fourDPoint.t = t;
        return fourDPoint;
    }

    void show() {
        System.out.println("X wynosi: " + this.x);
        System.out.println("Y wynosi: " + this.y);
        System.out.println("Z wynosi: " + this.z);
        System.out.println("T wynosi: " + this.t);
    }
}
