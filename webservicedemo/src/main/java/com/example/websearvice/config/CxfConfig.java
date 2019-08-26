package com.example.websearvice.config;

import com.example.websearvice.IHelloWorldService;
import com.example.websearvice.impl.HelloWorldServiceImpl;
import org.apache.cxf.Bus;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Created by LYS55650 on 2019/8/26.
 */
@Configuration
public class CxfConfig {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public IHelloWorldService HelloWorldServiceImpl() {
        return new HelloWorldServiceImpl();
    }

    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/demo/*");
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), HelloWorldServiceImpl());
        endpoint.publish("/service");
        return endpoint;
    }
}
