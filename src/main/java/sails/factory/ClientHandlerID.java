package sails.factory;

public enum ClientHandlerID {
    CLIENT_TEXT_MESSAGE("clientMessage"),
    CLIENT_SESSION_EVENT("clientSessionEvent");

    String beanID;

    ClientHandlerID(String beanID) {
        this.beanID = beanID;
    }

    public String getBeanID() {
        return beanID;
    }
}
