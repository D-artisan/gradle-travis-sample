package io.turntabl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrivateClientTest {

    PrivateClient privateClient = new PrivateClient("Amin", 2, ServiceLevel.GOLD);

    @Test
    void getContactName() {

        assertEquals("Amin", privateClient.getContactName());
    }
}