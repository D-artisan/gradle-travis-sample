package io.turntabl;

public class CorporateClient extends Client{


//    public CorporateClient(String clientName, int clientID, ServiceLevel serviceLevel, Object accountManager) {
//        super(clientName, clientID, serviceLevel, accountManager);
//    }
    AccountManager accountManager;

    public CorporateClient(String clientName, int clientID, ServiceLevel serviceLevel, AccountManager accountManager) {
        super(clientName, clientID, serviceLevel);
        this.accountManager = accountManager;
    }

    @Override
    public String getContactName() {
        return this.accountManager.getManagerName();
    }

    @Override
    public String toString() {
        return "CorporateClient{" +
                "clientName='" + clientName + '\'' +
                ", clientID=" + clientID +
                ", serviceLevel=" + serviceLevel +
                ", accountManager=" + accountManager +
                '}';
    }
}
