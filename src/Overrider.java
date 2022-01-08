public class Overrider {
    public static void main(String[] args) {
        B b = new B("jakiś parametr");
    }
}

class A {
    public A() {
        super();
        System.out.println("Działa konstruktor A()");
    }

    public A(String param) {
        System.out.println("Działa konstruktor A(param)");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Działa konstruktor B()");

    }

    public B(String param) {
        super(param);
        System.out.println("Działa konstruktor B(param)");

    }
}