package pl.edu.wszib.interfaces;

public class SimpleDataProvider implements DataProvider {
    @Override
    public String getData() {
        return "raz dwa trzy";
    }
}
