package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiServiceTestTwo {

    @Test
    void orderSum() {
        {
            TaxiService service = new TaxiService();
            int sale = service.orderSum(1000);
            assertEquals(100,sale);

        }
    }
}