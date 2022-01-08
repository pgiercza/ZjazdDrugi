public class Boy extends Human {
    String boymlask = "ulala";

    @Override
    void eat() {
        System.out.println("Chłopczyk mlaska tak: " + boymlask);
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();
    }
}
