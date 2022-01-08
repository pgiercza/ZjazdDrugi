public class SubPrinter extends Printer {
    int z=22;

    @Override
    void printMe() {
        System.out.println("z wynosi: "+z);
        System.out.println("Jestem egzemplarzem klacy "+this.getClass().getName());
    }

    public static void main(String[] args) {
        SubPrinter subPrinter=new SubPrinter();
        subPrinter.printMe();
    }
}
