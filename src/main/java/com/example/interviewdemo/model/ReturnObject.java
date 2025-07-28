package com.example.interviewdemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReturnObject {

    private String message;
    private Integer code;
    private Integer otherCode = 200;

    private boolean testForInt() {
       for(char c : message.toCharArray()) {
           if(Character.isDigit(c))
               return true;
       }
       return false;
    }

    void setOtherCode(int otherCode) {
        this.otherCode = otherCode;
    }

    public void setOtherCode(int otherCode, boolean override) {
        if(override)
            this.otherCode = otherCode;
    }

    public String toString() throws RuntimeException {
        if(testForInt())
            throw new RuntimeException("No numbers in message");
        if(otherCode==500)
            throw new RuntimeException("Other Code cannot be 500");
        return "{\"message\":\""+message+"\",\"code\":"+code+",\"otherCode\":"+otherCode+"}";
    }

}
