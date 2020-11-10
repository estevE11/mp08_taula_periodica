package com.example.periodictable;

public class Element {
    private String symbol;
    private String type;
    private int atomicNumber;
    private String name;
    private String atomicMass;
    private String elecConfig;
    private String defaultState;

    public Element(String symbol, int atomicNumber, String type, String name, String atomicMass, String elecConfig, String defaultState) {
        this.symbol = symbol;
        this.type = type;
        this.atomicNumber = atomicNumber;
        this.name = name;
        this.atomicMass = atomicMass;
        this.elecConfig = elecConfig;
        this.defaultState = defaultState;
    }

    // GETTERS
    public String getSymbol() {
        return symbol;
    }

    public String getType() {
        return type;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public String getName() {
        return name;
    }

    public String getAtomicMass() {
        return atomicMass;
    }

    public String getElecConfig() {
        return elecConfig;
    }

    public String getDefaultState() {
        return defaultState;
    }
}
