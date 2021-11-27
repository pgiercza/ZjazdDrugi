import java.util.Locale;

public class StringChecker
{
    public static void main(String[] args) {
        String str = "Lannister zawsze spłaca swoje długi";
        System.out.println("Długość textu: "+str.length());
        System.out.println("Znak na pozycji 6:"+str.charAt(5));
        System.out.println("Fragment znaków od 10 do 16:"+str.substring(10,16));
        System.out.println("Indeks pierwszej litery t: "+str.indexOf('t'));
        System.out.println("Indeks początku tekstu \"ługi\" : "+str.indexOf("długi"));
        System.out.println("Text zamiany na wielkie litery: "+str.toUpperCase());

    }
}
