package pl.edu.wszib.laboratorium16;

public class ExceptionTester {
    public static void main(String[] args) {
        int[] numbers={1,2,3};


        try {
            System.out.println("Nasz numer to: "+numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nie ma takiego indeksu!");
        }
        catch (Exception e) {
            System.out.println("Coś poszło nie tak!");
        }
        finally {
            System.out.println("Koniec");
        }

    }
}
