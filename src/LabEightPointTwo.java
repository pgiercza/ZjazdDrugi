public class LabEightPointTwo {
    public static void main(String[] args) {
        int[][][] arr = {{{1, 2, 3}, {5}}, {{1}}, {{6}, {7}}};
// "licznik"
        int l = 0;
// trzeci wymiar
        // trzeci wymiar
        for (int i = 0; i < arr.length; i++) {
            // drugi wymiar
            for (int j = 0; j < arr[i].length; j++) {
                // pierwszy wymiar
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("arr[" + i + "]" + "[" + j + "]" + "[" + k + "] = ");
                    System.out.println(arr[i][j][k]);
                }
            }
        }
    }
}
