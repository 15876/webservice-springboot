package com.example.websearvice.impl;

import com.example.websearvice.IHelloWorldService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * Created by LYS55650 on 2019/8/26.
 */
@WebService(serviceName = "HelloWebService",targetNamespace = "http://impl.webservice.example.com",
endpointInterface = "com.example.websearvice.IHelloWorldService")
@Component
public class HelloWorldServiceImpl implements IHelloWorldService {
    @Override
    public String sayHello(String name) {
        return "Hello world";
    }
}
