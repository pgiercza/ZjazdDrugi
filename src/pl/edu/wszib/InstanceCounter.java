package pl.edu.wszib;

public class InstanceCounter {
    private static int numInstances;


    public static int getCount(){
        return numInstances;
    }

    private static void addInstance(){
        numInstances++;
    }

    public static void main(String[] args) {
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();




        System.out.println(InstanceCounter.getCount());
    }

    public InstanceCounter() {
        addInstance();
    }


}
