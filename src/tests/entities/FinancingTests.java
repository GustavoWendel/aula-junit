package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Test;
import tests.factory.FinancingFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FinancingTests {

    @Test
    public void constructorShouldCreateObjectWhenValidData() {
        // Action
        Financing f = FinancingFactory.createFinancingWithValidData();
        // Assertions
        assertEquals(100000.0, f.getTotalAmount());
        assertEquals(2000.0, f.getIncome());
        assertEquals(80, f.getMonths());
    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        assertThrows(IllegalArgumentException.class,
                () -> new Financing(100000.0, 2000.0, 20));
    }

    @Test
    public void setTotalAmountShouldSetDataWhenValidData() {
        // Arrage
        Financing f = FinancingFactory.createFinancingWithValidData();

        // Action
        f.setTotalAmount(90000.0);

        // Assertions
        assertEquals(90000.0, f.getTotalAmount());
    }

    @Test
    public void setAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = FinancingFactory.createFinancingWithValidData();
            financing.setTotalAmount(110000.0);
        });
    }



}
