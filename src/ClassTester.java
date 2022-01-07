public class ClassTester {
    int i;//zmienna egzemplarza- nie musi mieć przypisanej wartości,przyjmuje wartość domyślną
    static int j = 2;//zmienna klasowa(pole statyczne)

    public int change() {
        int k = 7;//zmienna lokalna-musi mieć przypisaną wartość
        //int i=0;
        return this.i + (k * j);
    }

    public static void main(String[] args) {
        int i = 77;
        System.out.println(i);

        ClassTester classTester1 = new ClassTester();
        ClassTester classTester2 = new ClassTester();
        ClassTester classTester3 = new ClassTester();
        classTester1.change();
        //classTester1.i=88;

        System.out.println("Wyświetlam zmienną egzemplarza i dla classTester: " + classTester1.i);
        System.out.println("Wyświetlam zmienną lokalną i: " + i);
    }
}
