package pl.edu.wszib.laboratorium17;

/*Napisz typ wyliczeniowy Computation, który będzie reprezentował prosty kalkulator.
Niech typ ten posiada następujące wartości MULTIPLY, DIVIDE, ADD, SUBTRACT.
Niech typ ten posiada metodę public double perform(double x, double y), która zwróci wynik odpowiedniej operacji.
Na przykład Computation.ADD.perform(1, -5) powinno zwrócić -4.
*/
public enum Computation {
    ADD {
        @Override
        public double perform(double x, double y) {
            return x + y;
        }
    },
    SUBSTRACT {
        @Override
        public double perform(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        public double perform(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public double perform(double x, double y) {
            return x / y;
        }
    };

    public abstract double perform(double x, double y);



}
