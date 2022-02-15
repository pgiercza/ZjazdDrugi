package pl.edu.wszib.finalapp;

import java.math.BigDecimal;

public class BudgetEntry {
    private BigDecimal amound;
    private String entryName;

    public BigDecimal getAmound() {
        return amound;
    }

    public void setAmound(BigDecimal amound) {
        this.amound = amound;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }
}
