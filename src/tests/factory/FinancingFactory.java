package tests.factory;

import entities.Financing;

public class FinancingFactory {

    private FinancingFactory() {
    }

    public static Financing createFinancingWithValidData() {
        return new Financing(100000.0, 2000.0, 80);
    }
}
