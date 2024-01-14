package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/increment")
    public Payload incrementData(@RequestBody Payload payload) {

        // Update the string value to be the concatenation of  itself
        payload.setStringValue(payload.getStringValue() + " " + payload.getStringValue());

        // Increment the int value by itself
        payload.setIntValue(payload.getIntValue() + payload.getIntValue());

        // Increment the date by one day
        payload.setDateTime(payload.getDateTime().plusDays(1));

        // Return the modified payload
        return payload;
    }
}
