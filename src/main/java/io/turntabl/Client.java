package io.turntabl;

public abstract class Client {
    protected String clientName;
    protected int clientID;
    protected ServiceLevel serviceLevel;

    public Client(String clientName, int clientID, ServiceLevel serviceLevel) {
        this.clientName = clientName;
        this.clientID = clientID;
        this.serviceLevel = serviceLevel;
    }

    public abstract String getContactName();


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientID=" + clientID +
                ", serviceLevel=" + serviceLevel +
                '}';
    }
    
}
