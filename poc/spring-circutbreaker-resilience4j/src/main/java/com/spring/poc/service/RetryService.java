package com.spring.poc.service;

import com.spring.poc.client.PaymentClient;
import com.spring.poc.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetryService {

    @Autowired
    private PaymentClient paymentClient;

    public List<Payment> retryPaymentHistory() {
        return paymentClient.getRetryPaymentHistory();
    }
}
