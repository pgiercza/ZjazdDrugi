public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum1 = calc.add(1, 2);
        double sum2 = calc.add(3, 4, 5);
        System.out.println(sum1 + "  " + sum2);
    }


    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}
