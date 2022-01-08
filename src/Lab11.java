/*Zaprojektuj hierarchię klas tak, aby:

-klasa C dziedziczyła po klasie B, a klasa B dziedziczyła po klasie A
-instrukcja new C(); lub new B(); lub new A(); wyświetliła kolejno informacje o wywoływaniu poszczególnych konstruktorów wszystkich klas
-instrukcja new C(true); lub new B(true); lub new A(true); utworzyła konkretny obiekt nie informując o wywołaniu konstruktorów
-instrukcja new C(false); lub new B(false); lub new A(false); utworzyła konkretny obiekt informując tylko o wywołaniu “pierwszego” konstruktora (konstruktory klas bazowych milczą)
*/

public class Lab11 {
    public static void main(String[] args) {
        //new CC();
        //new CC(true);
        new BB(true);
    }
}

class AA {
    public AA() {
        super();
        System.out.println("Działa konstruktor new AA()");
    }

    public AA(boolean isSilent) {
        if (!isSilent) {
            System.out.println("Konstruktor A(bolean)");
        }

    }
}

class BB extends AA {
    public BB() {
        super();
        System.out.println("Działa konstruktor new BB()");
    }

    public BB(boolean isSilent) {
        super(true);
        if (!isSilent) {
            System.out.println("Konstruktor B(bolean)");
        }
    }

}

class CC extends BB {
    public CC() {
        super();
        System.out.println("Działa konstruktor new CC()");
    }

    public CC(boolean isSilent) {
        super(true);
        if (!isSilent) {
            System.out.println("Konstruktor C(bolean)");
        }
    }

}