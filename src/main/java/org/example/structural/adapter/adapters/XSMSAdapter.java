package org.example.structural.adapter.adapters;

import org.example.structural.adapter.XSMS;
import org.example.structural.adapter.sms.SmsSender;

/**
 * @author musa.balin
 */
public class XSMSAdapter implements SmsSender {
    @Override
    public void send(String message, String to) {
        XSMS xsms = new XSMS();
        xsms.sendSms(message, to);
    }
}
