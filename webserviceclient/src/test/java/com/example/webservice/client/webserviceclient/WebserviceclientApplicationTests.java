package com.example.webservice.client.webserviceclient;

import mypackage.HelloWebService;
import mypackage.HelloWebService_Service;
import mypackage.ObjectFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebserviceclientApplicationTests {


	@Test
	public void contextLoads() throws MalformedURLException {
		HelloWebService_Service h = new HelloWebService_Service();
		HelloWebService hs = h.getHelloWorldServiceImplPort();
		System.out.println(hs.sayHello("haha"));
	}

}
