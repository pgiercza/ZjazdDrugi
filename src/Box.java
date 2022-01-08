import java.awt.*;

public class Box {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    public Box(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Box(Point topLeft, Point bottomRight) {
        this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
    }

    void printBox() {
        System.out.print("Box: <" + x1 + ", " + y1);
        System.out.println(", " + x2 + ", " + y2 + ">");
    }

    public Box(Point topLeft, int width, int height) {
        this(topLeft.x, topLeft.y, topLeft.x + width, topLeft.y + height);
    }

    public static void main(String[] args) {
        Box box;
        System.out.println("Box ze współrzędnymi (25,25) i (50,50)");
        box = new Box(25, 25, 50, 50);
        box.printBox();

        System.out.println("\nPunkty ze współrzędnymi (10,10) i (20,20)");
        box = new Box(new Point(10, 10), new Point(20, 20));
        box.printBox();

        System.out.println("\nJeden Punkt (10,10) o szerokości 50 i wysokości 50");
        box = new Box(new Point(10, 10), 50, 50);
        box.printBox();
    }
}
