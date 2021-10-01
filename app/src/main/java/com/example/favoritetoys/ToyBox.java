package com.example.favoritetoys;

public class ToyBox {
    private static String[] toyNames;

    public ToyBox(String[] toyNames) {
        this.toyNames = toyNames;
    }

    public static String[] getToyNames() {
        return toyNames;
    }

    public void setToyNames(String[] toyNames) {
        this.toyNames = toyNames;
    }
}
