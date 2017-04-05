package sails;


import sails.components.JobHandler;
import sails.factory.SpringBeansFactory;

public class Main {

    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println("Passed arguments "+arg);
        }


        System.out.println("Hello world");
        System.out.println("");
        System.out.println("");

        JobHandler handler = SpringBeansFactory.INSTANCE.getBean(JobHandler.class);

        handler.handle();


    }
}
