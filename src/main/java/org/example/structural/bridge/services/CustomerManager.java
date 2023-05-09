package org.example.structural.bridge.services;

import org.example.structural.bridge.message.senders.MessageSenderBase;

/**
 * @author musa.balin
 */
public class CustomerManager implements CustomerService {
    public MessageSenderBase messageSenderBase;

    @Override
    public void verify() {
        messageSenderBase.sendMessage("Doğrulama Linkiniz.");
    }
}
