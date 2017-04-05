package sails.factory;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sails.factory.config.ApplicationConfiguration;


public enum SpringBeansFactory {

    INSTANCE(ApplicationConfiguration.class);

    ApplicationContext applicationContext;

    SpringBeansFactory(Class configurationClazz) {
        this.applicationContext = new AnnotationConfigApplicationContext(configurationClazz);
    }

    public <T> T getBean(String beanID, Class<T> type) {

        return this.applicationContext.getBean(beanID, type);
    }

    public Object getBean(String beanID) {

        return this.applicationContext.getBean(beanID);
    }


    public <T> T getBean(Class<T> type) {

        return this.applicationContext.getBean(type);
    }


}
