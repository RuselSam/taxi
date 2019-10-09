package ru.itpark;

import org.junit.jupiter.api.Test;
import ru.itpark.TaxiService;

import static org.junit.jupiter.api.Assertions.*;

class TaxiServiceTest {

    @Test
    void orderSum() {
        {
            TaxiService service = new TaxiService();
            int sale = service.orderSum(50);
            assertEquals(53,sale);

        }

    }
}