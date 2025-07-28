package com.example.interviewdemo.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value="/interview")
public interface InterviewController {

    @CrossOrigin
    @RequestMapping(value = "/test1", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpEntity test1();

    @CrossOrigin
    @RequestMapping(value = "/test2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpEntity test2();

    @CrossOrigin
    @RequestMapping(value = "/test3", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpEntity test3();

    @CrossOrigin
    @RequestMapping(value = "/test4", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpEntity test4();

    @CrossOrigin
    @RequestMapping(value = "/test5", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpEntity test5();

    @CrossOrigin
    @RequestMapping(value = "/test6", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpEntity test6(@RequestParam("test") String test);

}
