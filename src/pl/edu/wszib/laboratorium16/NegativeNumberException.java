package pl.edu.wszib.laboratorium16;

public class NegativeNumberException extends  Exception{
    public NegativeNumberException() {
    }

    public NegativeNumberException(String message) {
        System.out.println(message);
    }
}
