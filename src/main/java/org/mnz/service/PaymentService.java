package org.mnz.service;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class PaymentService {

    public String paymentProcess(String paymentId) {
        return UUID.randomUUID().toString();
    }
}
