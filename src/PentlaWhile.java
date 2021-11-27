public class PentlaWhile {
    public static void main(String[] args) {
        boolean cond=true;
        while(cond){
            System.out.println("Działa");
            if((int)(Math.random()*50)==20){
                cond=false;
            }
        }
    }
}
