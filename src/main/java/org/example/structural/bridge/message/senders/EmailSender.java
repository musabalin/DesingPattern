package org.example.structural.bridge.message.senders;

/**
 * @author musa.balin
 */
public class EmailSender extends MessageSenderBase {
    @Override
    public void sendMessage(String message) {
        System.out.println("Mail ile yollandı: " + message);
    }
}
