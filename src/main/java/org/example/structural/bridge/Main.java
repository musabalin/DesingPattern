package org.example.structural.bridge;

import org.example.structural.bridge.message.senders.EmailSender;
import org.example.structural.bridge.message.senders.SmsSender;
import org.example.structural.bridge.services.CustomerManager;

/**
 * @author musa.balin
 */
public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();

        customerManager.messageSenderBase = new EmailSender();
        customerManager.verify();

        customerManager.messageSenderBase = new SmsSender();
        customerManager.verify();
    }
}
