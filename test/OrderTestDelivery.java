import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderTestDelivery {

    @org.junit.jupiter.api.Test
    public void testOrderItemOne() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1 y n".getBytes());

        assertTrue(Math.abs(Delivery.order(in) - 8.78) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemTwo() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("2 y n".getBytes());

        assertTrue(Math.abs(Delivery.order(in) - 9.88) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemThree() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("3 y n".getBytes());

        assertTrue(Math.abs(Delivery.order(in) - 10.98) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemFour() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 y n".getBytes());

        assertTrue( Math.abs(Delivery.order(in) - 12.08) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }
}
