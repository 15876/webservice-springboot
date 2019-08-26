package com.example.websearvice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by LYS55650 on 2019/8/26.
 */

@WebService(name = "HelloWebService", targetNamespace = "http://impl.webservice.example.com")
public interface IHelloWorldService {
    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    String sayHello(@WebParam(name = "userName") String name);
}
