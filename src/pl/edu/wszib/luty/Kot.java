package pl.edu.wszib.luty;

class Kot extends Animal {
    private static String type = "cat"; //pole klasowe
    private static int counter;

    public Kot() {
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
