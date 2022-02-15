package pl.edu.wszib.laboratorium16;

public class StackTraceExample {
    public static void main(String[] args) {
        StackTraceExample ste=new StackTraceExample();
        ste.method1();

    }

    public void method1(){
        method2();
    }
    public void method2(){
        method3();
    }
    public void method3(){
        throw new RuntimeException("BUUUUUM");
    }
}
