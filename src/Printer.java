public class Printer {
    int  x=4;
    int y=2;
    void printMe(){
        System.out.println("x wynosi: "+x+" , y wynosi: "+y);
        System.out.println("Jestem egzemplarzem klacy "+this.getClass().getName());
    }
}
