/*Utwórz klasę o nazwie Rectangle posiadającą dwie właściwości (długość i szerokość) oraz metodę określającą pole powierzchni. Klasa powinna posiadać trzy konstruktory:
*bez parametrowy- wartościom zarówno długości, jak i szerokości przypisuje się zero,
*z dwoma parametrami- dwie liczby są przypisane odpowiednio jako długość i szerokość,
*z jednym parametrem - zarówno długość, jak i szerokość otrzymują tą samą wartość.
Utwórz obiekty klasy Rectangle, korzystając ze wszystkich utworzonych konstruktorów i wyświetl ich pola powierzchni.*/


public class Rectangle {
    int length;
    int width;

    // *bez parametrowy- wartościom zarówno długości, jak i szerokości przypisuje się zero
    public Rectangle() {
        int length = 0;
        int width = 0;
    }

    //*z dwoma parametrami- dwie liczby są przypisane odpowiednio jako długość i szerokość
    public Rectangle(int x, int y) {
        this.length = x;
        this.width = y;
    }

    //*z jednym parametrem - zarówno długość, jak i szerokość otrzymują tą samą wartość.
    public Rectangle(int dimension) {
        this.width = this.length = dimension;
    }

    public void printArea() {
        System.out.println(length * width);
    }

    public static void main(String[] args) {
        Rectangle rectangleArea;

        rectangleArea = new Rectangle();
        System.out.println("Konstruktory równe zeru, bezparametrowe: ");
        rectangleArea.printArea();

        rectangleArea= new Rectangle(2, 4);
        System.out.println("Konstruktory dwuparametrowy: ");
        rectangleArea.printArea();

        rectangleArea = new Rectangle(22);
        System.out.println("Konstruktory jednoparametrowy: ");
        rectangleArea.printArea();
    }
}

