package pl.edu.wszib.luty;

public class Hamster extends Animal {
    private static String type = "hamster"; //pole klasowe
    private static int counter;

    public Hamster() {
        counter++;
    }

    @Override
    String getType() {
        return type;
    }

    @Override
    int getInstanceNumber() {
        return counter;
    }
}
