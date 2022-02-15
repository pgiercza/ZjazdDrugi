package pl.edu.wszib.laboratorium18_kolekcje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(5);
        myList.add(245);
        Iterator<Integer>iterator=myList.iterator();
        while (iterator.hasNext()){
            System.out.println("Liczba: "+iterator.next());
            if (iterator.next()==5){
                iterator.remove();
            }
        }
        System.out.println(myList);
    }
}
