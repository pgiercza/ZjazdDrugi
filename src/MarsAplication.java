class MarsAplication {
    public static void main(String[] arguments) {
        MarsRobot spirit = new MarsRobot("eksploracja",2,-60);

        spirit.showAttributes();
        System.out.println("ZwiÄkszanie prÄdkoĹci do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}