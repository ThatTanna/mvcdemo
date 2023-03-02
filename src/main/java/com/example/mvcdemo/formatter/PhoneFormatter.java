package com.example.mvcdemo.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.example.mvcdemo.models.Phone;

public class PhoneFormatter implements Formatter<Phone> {

    @Override
    public Phone parse(String text, Locale locale) throws ParseException {
        // text = 641-451-1111
        String[] temp = text.split("-");
        Phone p = new Phone();
        p.setAreaCode(temp[0]);
        p.setPrefix(temp[1]);
        p.setNumber(temp[2]);
        System.out.println("Inside PhoneFormatter parse method: ");
        System.out.println(p);;
        return p;
    }

    @Override
    public String print(Phone object, Locale locale) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }


    
}
