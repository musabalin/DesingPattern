package org.example.structural.bridge.message.senders;

/**
 * @author musa.balin
 */
public class SmsSender extends MessageSenderBase {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sms ile yollandı: " + message);
    }
}
