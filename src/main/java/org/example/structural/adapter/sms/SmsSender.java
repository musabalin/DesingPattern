package org.example.structural.adapter.sms;

/**
 * @author musa.balin
 */
public interface SmsSender {
    void send(String message, String to);
}
