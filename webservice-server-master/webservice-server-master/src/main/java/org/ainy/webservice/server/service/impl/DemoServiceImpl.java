package org.ainy.webservice.server.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.ainy.webservice.server.service.DemoService;

import javax.jws.WebService;

/**
 * @Author 阿拉丁省油的灯
 * @Date 2019-07-28 09:51
 * @Description 服务端实现类
 * <p>
 *     注：此接口必须加targetNamespace，否则动态调用invoke的时候，会报找不到接口内的方法
 * </p>
 */
@Slf4j
@WebService(targetNamespace = "http://impl.service.server.webservice.ainy.org",
        serviceName = "demoService",
        endpointInterface = "org.ainy.webservice.server.service.DemoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String demo(String param) {

        System.out.println("请求调用-------");
        return "success";
    }
}
