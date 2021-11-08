package io.turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Register {

    List<Client> clientList = new ArrayList<>();

    public Register(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Client> getClientList() {
        return clientList;
    }


    public List<String> getContactForGoldClients(){
        return clientList.stream()
                .filter(client -> client.getServiceLevel() == ServiceLevel.GOLD)
                .map(client -> client.getContactName())
                .collect(Collectors.toList());
    };

    public String getClientNamebyID(int ID) throws RuntimeException {
        return clientList.stream()
                .filter(client -> client.getClientID() == ID)
                .map(client -> client.getClientName())
                .findFirst()
                .orElseThrow(RuntimeException::new);
    };


    public Long getClientAtEveryServiceLevel(ServiceLevel serviceLevel){
        return clientList.stream()
                .filter(client -> client.getServiceLevel() == serviceLevel)
                .count();
    };


}
