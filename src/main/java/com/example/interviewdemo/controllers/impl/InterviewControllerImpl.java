package com.example.interviewdemo.controllers.impl;

import com.example.interviewdemo.controllers.InterviewController;
import com.example.interviewdemo.model.ReturnObject;
import com.example.interviewdemo.model.ReturnOtherObject;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class InterviewControllerImpl implements InterviewController {

    public HttpEntity test1() {
        ReturnObject ret = new ReturnObject();
//        ret.setMessage("Hello, ""World!");
        ret.setCode(200);
        return new HttpEntity(ret.toString());
    }

    public HttpEntity test2() {
        ReturnObject ret = new ReturnObject();
        ret.setMessage("Hello, World!");
        ret.setCode(200);
//        ret.setOtherCode(201);
        return new HttpEntity(ret.toString());
    }

    public HttpEntity test3() {
        ReturnObject ret = new ReturnObject();
        ret.setMessage("Hello, World!");
        String code = " 200";
        ret.setCode(Integer.parseInt(code));
        return new HttpEntity(ret.toString());
    }

    public HttpEntity test4() {
        ReturnObject ret = new ReturnObject();
        ret.setMessage("Hello, World1");
        ret.setCode(200);
        return new HttpEntity(ret.toString());
    }

    public HttpEntity test5() {
        ReturnOtherObject ret = new ReturnOtherObject();
        ret.setMessage("Hello, World!");
        ret.setCode(200);
        ret.setOtherCode(201);
        return new HttpEntity(ret.toString());
    }

    public HttpEntity test6(String test) {
        ReturnObject ret = new ReturnOtherObject();
        ret.setMessage(test + ", World!");
        ret.setCode(200);
        return new HttpEntity(ret.toString());
    }

}
