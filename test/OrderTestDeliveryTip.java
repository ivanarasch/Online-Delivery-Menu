import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderTestDeliveryTip {

    @org.junit.jupiter.api.Test
    public void testOrderItemOne() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1 y y 10.0".getBytes());

        assertTrue(Math.abs(Delivery.order(in) - 8.98) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemTwo() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("2 y y 15.0".getBytes());

        assertTrue(Math.abs(Delivery.order(in) - 10.33) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemThree() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("3 y y 18.0".getBytes());

        assertTrue( Math.abs(Delivery.order(in) - 11.70) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemFour() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 y y 20.0".getBytes());

        assertTrue( Math.abs(Delivery.order(in) - 13.08) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }


}
