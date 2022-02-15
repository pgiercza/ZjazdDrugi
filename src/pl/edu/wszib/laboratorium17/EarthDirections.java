package pl.edu.wszib.laboratorium17;
/*Napisz typ wyliczeniowy z kierunkami świata (także pośrednimi, np. “north east”).
Typ powinien przechowywać informacje o skrótach (np. “NE”) oraz nazwach zarówno w języku angielskim oraz polskim.
Zademonstruj na przykładzie działanie nowego typu.


 */
public enum EarthDirections {
    N("Północ","North",0),
    E("Wschód","East",90),
    S("Południe","South",180),
    W("Zachód","West",270),
    NE("Północny Wschód","NorthEst",45),
    SE("Południowy Wschód","SouthEast",135),
    SW("Południowy Zachód","SouthWest",225),
    NW("Północny Zachód","NorthWest",315);



    private String namePL;
    private String nameEN;
    private int rotation;

    EarthDirections(String namePL, String nameEN, int rotation) {

        this.namePL = namePL;
        this.nameEN = nameEN;
        this.rotation = rotation;
    }

    @Override
    public String toString() {
        return "EarthDirections{" +
                "namePL='" + namePL + '\'' +
                ", nameEN='" + nameEN + '\'' +
                ", rotation=" + rotation +
                '}';
    }

    public String getNamePL() {
        return namePL;
    }

    public String getNameEN() {
        return nameEN;
    }

    public int getRotation() {
        return rotation;
    }

    public void setNamePL(String namePL) {
        this.namePL = namePL;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }
}
