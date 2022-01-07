import java.util.Scanner;
import java.util.Random;

public class Domowe2Zadanie2 {
    public static void main(String[] args) {
        System.out.print("Xmas Tree height: ");
        Scanner input = new Scanner(System.in);

        int heightInputInt = 0;
        String heightInputString = input.nextLine();

        if (heightInputString.equals("")) {
            heightInputInt = 18;
            System.out.println(heightInputInt);
        } else {
            heightInputInt = Integer.parseInt(heightInputString);
        }


        String[] arr = {"+", ".", "*", "~", "^", "o"};
        Random r = new Random();
        int randomNumber = r.nextInt(arr.length);


        for (int i = 0; i <= heightInputInt - 1; i++) {
            for (int j = heightInputInt - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                randomNumber = r.nextInt(arr.length);
                System.out.print(arr[randomNumber]);
            }
            System.out.println();
        }
    }
}




/*
https://java.mmiklas.wszib.edu.pl/dodatki/zadanie-domowe2.html

Napisz program wyświetlający świąteczną choinkę składającą się z losowych elementów następującego zbioru znaków ASCII: ‘+’, ‘.’, ‘*’, ‘~’, ‘^’, ‘o’.
Wysokość choinki powinna być podawana jako argument programu. Jeżeli wysokość nie zostanie określona to powinna zostać przyjęta domyślna wartość 18.
*/