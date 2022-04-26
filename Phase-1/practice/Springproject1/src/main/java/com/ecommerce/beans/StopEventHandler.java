package com.ecommerce.beans;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StopEventHandler {


        public void onApplicationEvent(ContextStoppedEvent event) {
           System.out.println("ContextStoppedEvent Received");
        }

}
