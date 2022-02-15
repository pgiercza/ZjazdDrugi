package pl.edu.wszib.package1;

public class PackageTesterApp {
    public static void main(String[] args) {
        PackageTester packageTesterApp1 = new PackageTester();
        pl.edu.wszib.package2.PackageTester packageTesterApp2 = new pl.edu.wszib.package2.PackageTester();
        pl.edu.wszib.package3.PackageTester packageTesterApp3 = new pl.edu.wszib.package3.PackageTester();

        packageTesterApp1.introduce();
        packageTesterApp2.introduce();
        packageTesterApp3.introduce();
    }
}
