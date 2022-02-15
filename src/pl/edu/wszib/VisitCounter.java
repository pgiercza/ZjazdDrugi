package pl.edu.wszib;

public class VisitCounter {
    private int counter;

    void increment(){
        counter++;
    }


    @Override
    public String toString() {
        return "VisitCounter{" +
                "counter=" + counter +
                '}';
    }
}
