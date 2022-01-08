/*Załóżmy, że na pierwsze pole szachownicy kładziemy 1 ziarno pszenicy, na drugie 2 ziarna,
na trzecie 4 ziarna i na każde następne pole dwa razy więcej ziaren niż na pole poprzednie.
Napisz program, który zasymuluje taką sytuację i zliczy sumę wszystkich ziaren na szachownicy.*/

import java.math.BigInteger;

public class Szachownica {
    public static void main(String[] args) {
        BigInteger[][] szachownica = new BigInteger[8][8];
        BigInteger l = BigInteger.valueOf(1);   //liczba ziaren, wstępnie 1 na pierwszym polu
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger multiplyValue = BigInteger.valueOf(2);

        System.out.println("Rozmieszczenie ziaren na poszczególnych polach szachownicy: " );
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                szachownica[i][j] = l;
                sum = l.add(sum);
                l = l.multiply(multiplyValue);
                System.out.printf("%25S", szachownica[i][j]);
            }
            System.out.println();
        }
        System.out.println("Suma ziaren na wszystkich polach szachownicy wynosi: " + sum);
    }
}
