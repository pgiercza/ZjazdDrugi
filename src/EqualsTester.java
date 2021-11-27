public class EqualsTester {
    public static void main(String[] args) {
        String st1, st2;
        st1 = "efwfew";
        st2 = st1;
        System.out.println("Ten sam obiekt?: " + (st1 == st2));
        st2 = new String(st1);
        System.out.println("Ten sam obiekt?: " + (st1 == st2));
        System.out.println("Ta sama wartość?: " + st1.equals(st2));
        System.out.println("Ta sama wartość?: " + st2.equals(st1));
        boolean check1 = "Texas" instanceof String;
        System.out.println(check1);

        Object obj=new Object();
        boolean check2=obj instanceof String;
        System.out.println(check2);

        boolean check3="ikjfwfe" instanceof Object;
        System.out.println(check3);

    }
}
