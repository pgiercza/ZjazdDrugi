import java.util.StringTokenizer;

public class DataFormat {
    public static void main(String[] args) {


        String date = "29/04/2016";
        String[] arrOfStr = date.split("/");

        String day=date.substring(0,2);
        String month=date.substring(3,5);
        String Year=date.substring(6,10);

        StringTokenizer st=new StringTokenizer(date,"/");
        System.out.println("\nUrodziny: "+st.nextToken());
        System.out.println(st.nextToken());

        for (String a:arrOfStr)
        System.out.println(a);
    }
}
