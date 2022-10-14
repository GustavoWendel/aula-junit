package tests.factory;

import entities.Financing;

public class FinancingFactory {

    private FinancingFactory() {
    }

    public static Financing createFinancing() {
        return new Financing(100000.0, 2000.0, 20);
    }
}
