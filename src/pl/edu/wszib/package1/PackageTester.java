package pl.edu.wszib.package1;

public class PackageTester {
    public void introduce() {
        System.out.println("To obiekt klsy " + this.getClass().getName() + "\n w pakiecie " + this.getClass().getPackageName());
    }
}
