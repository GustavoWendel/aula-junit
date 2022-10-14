package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FinancingTests {

    @Test
    public void constructorShouldCreateObjectWhenValidData() {
        // Action
        Financing f = new Financing(100000.0, 2000.0, 80);
        // Assertions
        assertEquals(100000.0, f.getTotalAmount());
        assertEquals(2000.0, f.getIncome());
        assertEquals(80, f.getMonths());
    }

    @Test
    public void constructorShouldThrowExceptionWhenInvalidData() {
        assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 20);
            f.validateFinancing(f.getTotalAmount(), f.getIncome(), f.getMonths());
        });
    }
}
