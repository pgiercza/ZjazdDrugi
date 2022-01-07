import java.util.Scanner;


public class Domowe2Zadanie1 {
    public static void main(String[] args) {
        Domowe2Zadanie1 a1 = new Domowe2Zadanie1();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array=a1.makeSequence(n);
        System.out.print("Tablica przed konwersją: [ ");
        a1.showArray(array,n);
        a1.changeSequence(array,n);
        System.out.print("Tablica po konwersji: [ ");
        a1.showArray(array,n);
    }

    int[] makeSequence(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    void changeSequence(int[] array,int arrayLength) {
        for (int i = 0; i < arrayLength; i++) {
            array[i] = arrayLength - i;
        }
    }

    void showArray(int[] currentArray,int arrayLength){

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(currentArray[i]);
            System.out.print(" ");
        }
        System.out.println("]");
    }
}


/*
https://java.mmiklas.wszib.edu.pl/dodatki/zadanie-domowe2.html

Napisz program, który:
-stworzy tablicę liczb typu int o rozmiarze, który będziemy podawać jako argument przy starcie programu,
-wypełni tablicę kolejno liczbami od 1 do n, gdzie n to rozmiar tablicy,
-wyświetli zawartość tablicy,
-dokona konwersji tablicy tak, aby elementy ułożyły się odwrotnie (ciąg malejący: n, n-1, n-2… 1),
-wyświetli zawartyość przekonwertowanej tablicy,
-fragmenty programu odpowiadjące za konkretne zadania zostaną wyodrębnione jako oddzielne metody.*/