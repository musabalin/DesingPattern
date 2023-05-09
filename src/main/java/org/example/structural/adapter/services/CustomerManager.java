package org.example.structural.adapter.services;

import org.example.structural.adapter.XSMS;
import org.example.structural.adapter.sms.SmsSender;

/**
 * @author musa.balin
 */
public class CustomerManager implements CustomerService {
    private SmsSender smsSender;

    public CustomerManager(SmsSender smsSender) {
        this.smsSender = smsSender;
    }

    @Override
    public void register() {
        System.out.println("Veritabanına kayıt edildi.");

        XSMS xsms = new XSMS();
        xsms.sendSms("Kayıt başarılı", "+905545550002");
    }
}
