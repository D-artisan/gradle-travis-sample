package io.turntabl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorporateClientTest {

    CorporateClient corporateClient = new CorporateClient("Godric", 5, ServiceLevel.PLATINUM, new AccountManager("Ofosu"));

    @Test
    void getContactName() {
        assertEquals("Ofosu", corporateClient.getContactName());
    }
}