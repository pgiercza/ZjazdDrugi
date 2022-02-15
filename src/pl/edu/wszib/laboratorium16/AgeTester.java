package pl.edu.wszib.laboratorium16;

public class AgeTester {
    static void checkAge(int age){
        if(age<18){
            throw new AgeRangeException("Uwaga, osoba niepełnoletnia!");
        }else{
            System.out.println("Dostęp przyznany!");
        }
    }

    public static void main(String[] args) {
        checkAge(5);
    }
}
