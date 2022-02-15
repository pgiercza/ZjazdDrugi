package pl.edu.wszib.polimorfizm;

public class Polimorfizm {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.draw();

        Rectangle rectangle=new Rectangle();
        rectangle.draw();

        shape=new Rectangle();
        shape.draw();
    }
}
