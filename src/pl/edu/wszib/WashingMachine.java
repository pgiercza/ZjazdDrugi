package pl.edu.wszib;

public class WashingMachine {
    private int temperature;
    private int spining;

    public void modeForSensitiveClothes(){
        temperature=30;
        spining=800;
    }

    public void modeForeTowelsAndBedLinen(){
        temperature=90;
        spining=1200;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "temperature=" + temperature +
                ", spining=" + spining +
                '}';
    }
}
