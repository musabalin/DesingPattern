package org.example.structural.adapter.adapters;

import org.example.structural.adapter.YSMS;
import org.example.structural.adapter.sms.SmsSender;

/**
 * @author musa.balin
 */
public class YSMSAdapter implements SmsSender {
    @Override
    public void send(String message, String to) {
        YSMS ysms = new YSMS();
        ysms.send(to, message);
    }
}
