import java.awt.*;

public class Arrays {
    public static void main(String[] args) {
        Point[] points = {new Point(0, 1), new Point(0, 0)};
        System.out.println(points[0]);

        Point p = new Point(5, 5);
        points[0] = p;
        System.out.println(points[0]);

        points[0].y = 9;
        System.out.println(points[0]);

        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        int[][] arr2 = {{1, 2}, {3, 4}};


        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " ");
        }

        String[] dogs = {"Burek", "pluto", "Reks"};
        String[] people = {"Ania", "Wojtek", "Dorota"};
        String[][] names = {people, dogs};
        for(int i=0;i< names.length;i++){
            for(int j=0;j<names[i].length;j++){
                System.out.println(names[i][j]);
                System.out.println(" ");
            }
        }

    }
}
