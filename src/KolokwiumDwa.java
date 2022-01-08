import java.util.Scanner;

public class KolokwiumDwa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int[][] array = new int[input][input];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                array[i][j] = i + 1;
                System.out.printf("%3S", i + j + " ");
            }
            System.out.println();
        }


    }

}
