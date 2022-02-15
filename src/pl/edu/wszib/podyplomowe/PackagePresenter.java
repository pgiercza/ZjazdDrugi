package pl.edu.wszib.podyplomowe;

public class PackagePresenter {
    public PackagePresenter() {
        System.out.println("Dzień");
    }

    public static void main(String[] args) {
        pl.edu.wszib.java.PackagePresenter packagePresenter = new pl.edu.wszib.java.PackagePresenter();
        packagePresenter.showPackage();
    }

    public void showPackage() {
        System.out.println("To obiekt klsy " + this.getClass().getName() + "\n w pakiecie " + this.getClass().getPackageName());
    }
}
