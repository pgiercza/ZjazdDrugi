public class Loops {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;

        y = y + x;
        System.out.println(y);

        if (x > 0) {
            System.out.println("Większe");
        } else if (x < 0) {
            System.out.println("Mniejsze!");
        } else {
            System.out.println("Jest zerem!");
        }

        char grade='A';

        switch (grade){
            case 'A':
                System.out.println("Wspaniale");
                break;
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'C':
                System.out.println("Mogło być lepiej");
                break;
            default:
                System.out.println("Coś poszło nie tak...");
                break;
        }



    }
}
