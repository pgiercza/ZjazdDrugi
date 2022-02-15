package pl.edu.wszib.podyplomowe;

import pl.edu.wszib.java.PackagePresenter;

public class Test {
    public static void main(String[] args) {
        System.out.println("Pakiet: "+Test.class.getPackageName());
        PackagePresenter pp1=new PackagePresenter();
        pp1.showPackage();

        pl.edu.wszib.podyplomowe.PackagePresenter pp2=new pl.edu.wszib.podyplomowe.PackagePresenter();
        pp2.showPackage();
    }


}
