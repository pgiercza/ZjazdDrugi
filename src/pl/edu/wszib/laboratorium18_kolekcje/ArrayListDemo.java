package pl.edu.wszib.laboratorium18_kolekcje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(120);
        for (int i = 1; i < 100; i++) {
            arr.add(i);
        }
        for (Integer i : arr
        ) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 3 == 0) {
                arr.remove(i);
            }
        }
        Iterator<Integer>iterator=arr.iterator();
        while (iterator.hasNext()){
            Integer i= iterator.next();
            if(arr.get(i)%3==0){
                iterator.remove();
            }
        }
        System.out.println();
        for (Integer i : arr
        ) {
            System.out.print(i + " ");
        }
    }
}
