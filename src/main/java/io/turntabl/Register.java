package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Register {

    List<Client> clientList = new ArrayList<>();

    public Register(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Client> getClientList() {
        return clientList;
    }


}
