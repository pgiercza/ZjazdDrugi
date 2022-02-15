package pl.edu.wszib.luty;

public class Dog extends Animal {
    private static String type = "dog"; //pole klasowe
    private static int counter;

    public Dog() {
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

