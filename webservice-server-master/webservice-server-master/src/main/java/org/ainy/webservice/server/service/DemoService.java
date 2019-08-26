package org.ainy.webservice.server.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @Author 阿拉丁省油的灯
 * @Date 2019-07-28 09:49
 * @Description WebService服务端
 * <p>
 *     注：此接口必须加targetNamespace，否则动态调用invoke的时候，会报找不到接口内的方法
 * </p>
 */
@WebService(targetNamespace = "http://impl.service.server.webservice.ainy.org")
public interface DemoService {

    @WebMethod
    @WebResult
    String demo(@WebParam String param);
}
