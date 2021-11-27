public class ClassOne {
    public static void main(String[] args) {
        int a, b, c;

        ClassTwo first = new ClassTwo();
        a = first.depth = 22;
        b = first.width = 66;
        c = first.height = 66;
        System.out.println(a + " " + b + " " + c);
    }
}
