package sails;


import sails.components.JobHandler;
import sails.factory.ClientHandlerID;
import sails.factory.SpringBeansFactory;

public class Main {

    public static void main(String[] args) {

        String clientPreRequest = "CLIENT_TEXT_MESSAGE";
        String clientPostRequest = "CLIENT_SESSION_EVENT";

        for (String arg : args) {
            System.out.println("Passed arguments " + arg);
        }

        JobHandler handler = SpringBeansFactory.INSTANCE.getBean(JobHandler.class);

        SpringBeansFactory.INSTANCE.getBean(ClientHandlerID.valueOf(clientPreRequest).getBeanID());

        handler.handle();

    }
}
