package io.turntabl;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    AccountManager accountManager = new AccountManager("Daniel");

    CorporateClient corporateClient = new CorporateClient("Daniel", 5, ServiceLevel.GOLD, accountManager);
    CorporateClient corporateClient2 = new CorporateClient("Israel", 6, ServiceLevel.GOLD, accountManager);
    CorporateClient corporateClient3 = new CorporateClient("Kojo", 7, ServiceLevel.PLATINUM, accountManager);

    PrivateClient privateClient = new PrivateClient("Abena", 10, ServiceLevel.PLATINUM);


    List<Client> clientList = Arrays.asList(
            corporateClient, corporateClient2, privateClient
    );

    Register register = new Register(clientList);



    @Test
    void getClientList() {

        assertTrue(Arrays.asList(corporateClient, corporateClient2, corporateClient3, privateClient).containsAll(register.getClientList()));

    }

    @Test
    void getContactForGoldClients() {

        assertTrue(Arrays.asList("Daniel").containsAll(register.getContactForGoldClients()));
    }

    @Test
    void getClientNamebyID() {

        assertEquals("Daniel", register.getClientNamebyID(5));
        assertThrows(RuntimeException.class, () -> register.getClientNamebyID(50));
    }

    @Test
    void getClientAtEveryServiceLevel() {

        assertEquals(2, register.getClientAtEveryServiceLevel(ServiceLevel.GOLD));

    }
}