public class PriceFormater {
    String currency = "zł";

    String formatPrice(int value) {
        return String.format("%d,00 %s", value, currency);
    }

    String formatPrice(double value) {
        return String.format("%.2f %s", value, currency);
    }

    String formatPrice(String value) {
        //return String.format("%d,00 %s",Double.parseDouble(value),currency);
        return formatPrice(Double.parseDouble(value));
    }

    public static void main(String[] args) {
        PriceFormater pf = new PriceFormater();
        pf.currency="PLN";
        System.out.println(pf.formatPrice(500));
        System.out.println(pf.formatPrice(89.847382));
        System.out.println(pf.formatPrice("50"));
    }
}
