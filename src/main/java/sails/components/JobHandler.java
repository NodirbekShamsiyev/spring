package sails.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sails.components.service.MessageService;

import javax.inject.Inject;


@Component
public class JobHandler {

    private MessageService service;

    public void handle(){
        service.printMessage();
    }

    public MessageService getService() {
        return service;
    }

    @Inject
    public void setService(@Qualifier("componentOne") MessageService service) {
        this.service = service;
    }
}
