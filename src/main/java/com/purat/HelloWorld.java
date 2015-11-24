package com.purat;

import org.springframework.stereotype.Component;

/**
 * Created by compurat on 11/24/15.
 */
@Component
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

}
