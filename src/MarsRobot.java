public class MarsRobot {

    public String status;
    public int speed;
    public float temperature;


    MarsRobot(String status,int speed,float temperature){
        this.status=status;
        this.speed=speed;
        this.temperature=temperature;
    }



    public void checkTemperature() {
        if (temperature < -80) {
            status = "powrĂłt do domu";
            speed = 5;
        }
    }

    public void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("PrÄdkoĹÄ: " + speed);
        System.out.println("Temperatura: " + temperature);
    }
}