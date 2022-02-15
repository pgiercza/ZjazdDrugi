package pl.edu.wszib.laboratorium17;

public enum TshirtSize {
    S(48, 71, 36),
    M(52, 74, 38),
    L(56, 76, 41),
    XL(61, 79, 41);

    private int chestWidth;
    private int shirtLength;
    private int sleeveLength;

    TshirtSize(int chestWidth, int shirtLength, int sleeveLength) {
        this.chestWidth = chestWidth;
        this.shirtLength = shirtLength;
        this.sleeveLength = sleeveLength;
    }

    @Override
    public String toString() {
        return "TshirtSize{" +
                "chestWidth=" + chestWidth +
                ", shirtLength=" + shirtLength +
                ", sleeveLength=" + sleeveLength +
                '}';
    }

    public int getChestWidth() {
        return chestWidth;
    }

    public int getShirtLength() {
        return shirtLength;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }

}