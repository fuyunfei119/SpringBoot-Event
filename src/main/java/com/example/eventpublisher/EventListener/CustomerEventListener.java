package com.example.eventpublisher.EventListener;

import com.example.eventpublisher.Event.CustomerEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerEventListener {

    @EventListener
    public void OnBeforeCheckIfCustomerHasOverDueBalance(CustomerEvent.OnBeforeCheckIfCustomerHasOverDueBalance event) {
        System.out.println(event.getSource());
        System.out.println(event.getHandled());
    }
}
