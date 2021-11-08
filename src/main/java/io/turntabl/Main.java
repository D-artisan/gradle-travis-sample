package io.turntabl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AccountManager accountManager1 = new AccountManager("Daniel");
//        accountManager1.getAccountManager1();

        AccountManager accountManager2 = new AccountManager("Godric");
//        accountManager2.getAccountManager2();

        AccountManager accountManager3 = new AccountManager("Godwin");
//        accountManager2.getAccountManager3();


        CorporateClient corporateClient1 = new CorporateClient("Daniel", 5, ServiceLevel.GOLD, accountManager1);

        System.out.println(corporateClient1);

        PrivateClient privateClient1 = new PrivateClient("Abena", 10, ServiceLevel.PLATINUM);
        System.out.println(privateClient1);
        System.out.println(privateClient1.getClientName());


        List<Client> corporateClientList = new ArrayList<>();
        corporateClientList.add(corporateClient1);
        corporateClientList.add(privateClient1);

//        System.out.println(corporateClientList);


        List<Client> corporateClientList1 = Arrays.asList(
                corporateClient1, privateClient1
        );

        Register register = new Register(corporateClientList1);


        System.out.println(register.getClientList());

        System.out.println(corporateClient1.getContactName());




    }
}
