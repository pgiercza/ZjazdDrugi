public class HalfDollars {
    public static void main(String[] args) {
        int[] denver = {1_700_000, 4_600_000, 2_100_000};
        int[] philadelphia = new int[denver.length];
        int[] total = new int[denver.length];
        int arv;
        philadelphia[0] = 1;
        philadelphia[1] = 1;
        philadelphia[2] = 1;
        total[0] = philadelphia[0] + denver[0];
        total[1] = philadelphia[1] + denver[1];
        total[2] = philadelphia[2] + denver[2];
        arv = (total[0] + total[1] + total[2]) / denver.length;
        System.out.println("W tych latach suma: ");
        System.out.format("%,d%n", arv);
    }
}
