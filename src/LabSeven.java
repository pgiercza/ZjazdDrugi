import java.util.Scanner;

public class LabSeven {
    public static void main(String[] args) {

        System.out.print("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(" " + n + " matrix");
        System.out.println("--------");
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3S", i + j + " ");
            }
            System.out.println();
        }
    }
}