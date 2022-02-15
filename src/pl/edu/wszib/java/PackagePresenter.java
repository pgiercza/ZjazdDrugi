package pl.edu.wszib.java;

public class PackagePresenter {
    public PackagePresenter() {
        System.out.println("Dzień");
    }

    public static void main(String[] args) {
        PackagePresenter packagePresenter = new PackagePresenter();
        packagePresenter.showPackage();
    }

    public void showPackage() {
        System.out.println("To obiekt klsy " + this.getClass().getName() + "\n w pakiecie " + this.getClass().getPackageName());
    }

}
