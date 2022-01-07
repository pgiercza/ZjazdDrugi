import java.math.BigInteger;

public class Domowe2Zadanie3 {
    public static void main(String[] args) {
        BigInteger[][] szachownica = new BigInteger[8][8];
        BigInteger l = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger n = BigInteger.valueOf(2);
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                szachownica[i - 1][j - 1] = l;
                sum = l.add(sum);
                l = l.multiply(n);
                System.out.printf("%25S", szachownica[i - 1][j - 1]);
            }
            System.out.println();
        }
        System.out.println("Suma wszystkich ziarenek wynosi: " + sum);
    }
}

/*
https://java.mmiklas.wszib.edu.pl/dodatki/zadanie-domowe2.html

Załóżmy, że na pierwsze pole szachownicy kładziemy 1 ziarno pszenicy, na drugie 2 ziarna, na trzecie 4 ziarna i na
każde następne pole dwa razy więcej ziaren niż na pole poprzednie. Napisz program, który zasymuluje taką sytuację i
zliczy sumę wszystkich ziaren na szachownicy.*/