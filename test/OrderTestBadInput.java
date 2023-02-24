import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderTestBadInput {

    @org.junit.jupiter.api.Test
    public void testOrderBadItem() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("5 n n 10.0".getBytes());

        assertTrue(Math.abs(Delivery.order(in) + 1) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderBadDelivery() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 c".getBytes());

        assertTrue(Math.abs(Delivery.order(in) + 1) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderBadTip() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 y c".getBytes());

        assertTrue(Math.abs(Delivery.order(in) + 1) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderBadTipNeg() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 y y -1.0".getBytes());

        assertTrue(Math.abs(Delivery.order(in) + 1) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderBadTipZero() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 y y 0.0".getBytes());

        assertTrue(Math.abs(Delivery.order(in) + 1) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderBadTipTooBig() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 y y 40.0".getBytes());

        assertTrue(Math.abs(Delivery.order(in) + 1) < 0.01);

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }
}
