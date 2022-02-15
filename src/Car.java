import java.util.Random;

public class Car {
    public static void main(String[] args) {
        String[] model = {"Yaris", "Corolla", "Aygo"};
        String[] color = {"Silver", "Blue", "Black"};
        int[] year = {2018, 2019, 2020};
        String[] parkingName = {"Motomachi", "Tsutsumi", "Tahara"};
        int[] parkingCapacity = {5000, 4500, 1700};

        Car parkingMotomahi;
        parkingMotomahi = new Car(model, color, year);
        String[][] parkingMotomahiArray = parkingMotomahi.Car(parkingName[0], parkingCapacity[0]);
        //parkingMotomahi.printParking(parkingMotomahiArray);
        parkingMotomahi.printSilverYaris2020(parkingMotomahiArray);

        Car parkingTsutsumi;
        parkingTsutsumi = new Car(model, color, year);
        String[][] parkingTsutsumiArray = parkingTsutsumi.Car(parkingName[1], parkingCapacity[1]);
        //parkingMotomahi.printParking(parkingTsutsumiArray);
        parkingTsutsumi.printMostSameColor(parkingTsutsumiArray);

        Car parkingTahara;
        parkingTahara = new Car(model, color, year);
        String[][] parkingTaharaArray = parkingTahara.Car(parkingName[2], parkingCapacity[2]);
        //parkingTahara.printParking(parkingTaharaArray);
        parkingTahara.printFirstTenCarsAtParking(parkingTaharaArray);
    }

    private String[] model;
    private String[] color;
    private int[] year;
    private int parkingCapacity;
    private String parkingName;

    public Car(String[] model, String[] color, int[] year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String[][] Car(String parkingName, int parkingCapacity) {
        this.parkingName = parkingName;
        this.parkingCapacity = parkingCapacity;
        String[][] parkingArray = new String[parkingCapacity][3];
        Car car;
        car = new Car(model, color, year);
        for (int i = 0; i < parkingCapacity; i++) {
            int rndModel = new Random().nextInt(car.model.length);
            parkingArray[i][0] = car.model[rndModel];
            int rndColor = new Random().nextInt(car.color.length);
            parkingArray[i][1] = car.color[rndColor];
            int rndYear = new Random().nextInt(car.year.length);
            parkingArray[i][2] = Integer.toString(car.year[rndYear]);
        }
        return parkingArray;
    }

    //wyświetl informacje ile srebrnych Toyot Yaris z rocznika 2020 znajduje się na parkingu fabryki Motomachi
    public void printSilverYaris2020(String[][] parkingArray) {
        int countSilverYaris2020 = 0;
        for (int i = 0; i < parkingArray.length; i++) {
            if (parkingArray[i][0].equals("Yaris") && parkingArray[i][1].equals("Silver") && parkingArray[i][2].equals("2020")) {
                countSilverYaris2020 = countSilverYaris2020 + 1;
            }
        }
        System.out.println("Quantity of silver Toyota Yaris from 2020 year at " + parkingName + " parking: " + countSilverYaris2020);
        System.out.println();
    }

    //*wyświetl informacje jakiego koloru samochodów jest najwięcej na parkingu fabryki Tsutsumi,
    public void printMostSameColor(String[][] parkingArray) {
        int countColorSilver = 0;
        int countColorBlue = 0;
        int countColorBlack = 0;

        for (int i = 0; i < parkingArray.length; i++) {
            if (parkingArray[i][1].equals("Black")) {
                countColorBlack = countColorBlack + 1;
            }
            if (parkingArray[i][1].equals("Silver")) {
                countColorSilver = countColorSilver + 1;
            }
            if (parkingArray[i][1].equals("Blue")) {
                countColorBlue = countColorBlue + 1;
            }
        }
        System.out.print("The most cars at the " + parkingName + " parking are with colours: ");
        int maxColours = Math.max(countColorBlack, Math.max(countColorBlue, countColorSilver));
        if (countColorBlack == maxColours) {
            System.out.print("Black ");
        }
        if (countColorBlue == maxColours) {
            System.out.print("Blue");
        }
        if (countColorSilver == maxColours) {
            System.out.print("Silver ");
        }
        System.out.println();
        System.out.println("(Black (" + countColorBlack + " cars), Blue (" + countColorBlue + " cars), Silver (" + countColorSilver + " cars))");
        System.out.println();

    }

    //*wyświetl informacje o pierwszych 10 samochodach na parkingu fabryki
    public void printFirstTenCarsAtParking(String[][] parkingArray) {
        System.out.println("First 10 cars at the the " + parkingName + " parking are: ");
        for (
                int i = 0;
                i < 10; i++) {
            System.out.printf("%-5S",i+1+".");
            System.out.printf("%-15S", parkingArray[i][0] + "     ");
            System.out.printf("%-15S", parkingArray[i][1] + "      ");
            System.out.printf("%-15S", parkingArray[i][2]);
            System.out.println();
        }
    }

    /*
    public void printParking(String parkingArray[][]) {
        for (int i = 0; i < parkingArray.length; i++) {
            System.out.print(parkingArray[i][0]);
            System.out.print(parkingArray[i][1]);
            System.out.print(parkingArray[i][2]);
            System.out.println();
        }

    }
    */
}





