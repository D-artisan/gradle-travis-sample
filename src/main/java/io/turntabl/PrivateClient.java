package io.turntabl;

public class PrivateClient extends Client{


    public PrivateClient(String clientName, int clientID, ServiceLevel serviceLevel) {
        super(clientName, clientID, serviceLevel);
    }

    @Override
    public String getContactName() {
        return this.clientName;
    }

    @Override
    public String toString() {
        return "PrivateClient{" +
                "clientName='" + clientName + '\'' +
                ", clientID=" + clientID +
                ", serviceLevel=" + serviceLevel +
                '}';
    }
}
