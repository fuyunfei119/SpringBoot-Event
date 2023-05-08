package com.example.eventpublisher.Codeunits;

import com.example.eventpublisher.Entity.Customer;
import com.example.eventpublisher.Event.CustomerEvent;
import com.example.eventpublisher.Record.BusinessCentral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class CustomerMgmt {

    @Autowired
    private BusinessCentral<Customer> businessCentral;
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void Test() throws Exception {
        Customer customer = new Customer()
                .setId("54651981561981651")
                .setUserName("YUNFEIFU")
                .setPassword("12345678")
                .setBalance(1000);

        CheckIfCustomerHasOverDueBalance(customer);
    }

    public void CheckIfCustomerHasOverDueBalance(Customer customer) throws Exception {
        Boolean IsHandled = false;
        OnBeforeCheckIfCustomerHasOverDueBalance(IsHandled,customer);
        if (IsHandled) return;

        double balance = customer.getBalance();
        if (balance < 0.0) throw new Exception("Overdue Balance!!!");


    }

    public void OnBeforeCheckIfCustomerHasOverDueBalance(Boolean IsHandled,Customer customer) {
        applicationEventPublisher.publishEvent(new CustomerEvent.OnBeforeCheckIfCustomerHasOverDueBalance(customer,IsHandled));
    }

}
