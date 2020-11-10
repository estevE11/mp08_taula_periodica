package com.example.periodictable;

public class Element {

    private String symbol, atomicMass, name, state;
    private int atomicNumber;

    public Element(String symbol, int atomicNumber, String name, String atomicMass, String state) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.name = name;
        this.atomicMass = atomicMass;
        this.state = state;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getAtomicMass() {
        return atomicMass;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }
}
