import java.util.Scanner;

public class LabSevenPointTwo {
    public static void main(String[] args) {
        String binary = "1101333";
        Long result = 0L;
        /*int i=3;
        char c=binary.charAt(i);
        int bit=Character.getNumericValue(c);
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            int bit = Character.getNumericValue(c);
            System.out.println(bit);
        }
*/
        for (int i = 0; i < binary.length(); i++) {
            int reversIndex = binary.length() - 1 - i;
            char c = binary.charAt(reversIndex);
            int bit = Character.getNumericValue(c);
            result += bit * (int) Math.pow(2, i);
        }
        System.out.println("Binarnie " + binary + " to " + result + " dziesiętne.");
    }
}
