package com.example.eventpublisher;

import com.example.eventpublisher.Codeunits.CustomerMgmt;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EventPublisherApplicationTests {

    @Autowired
    private CustomerMgmt customerMgmt;

    @Test
    void contextLoads() {
    }

    @Test
    void test() throws Exception {
        customerMgmt.Test();
    }

}
