package io.turntabl;

public class AccountManager {

    private String managerName;

    public AccountManager(String managerName) {
        this.managerName = managerName;
    }


    public String getManagerName() {
        return managerName;
    }

    @Override
    public String toString() {
        return "AccountManager{" +
                "managerName='" + managerName + '\'' +
                '}';
    }

}
