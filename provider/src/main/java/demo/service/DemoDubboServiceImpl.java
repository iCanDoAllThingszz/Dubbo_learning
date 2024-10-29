package demo.service;/**
 * @Author:zhoayu
 * @Date:2024/10/29 12:33
 * @Description:service
 * @version:1.0
 */


import org.apache.dubbo.config.annotation.Service;

/**
 * @ClassName DemoDubboServiceImpl
 * @Description //TODO 
 * @Author zhaoyu
 * @Date 2024/10/29
 */
// 注意这里的@Service注解要使用org.apache.dubbo.config.annotation.Service, 否则dubbo会认为这是一个consumer 不是一个provider
// 标识有dubbo的@Service的bean中的方法就会被注册到registry中
@Service
public class DemoDubboServiceImpl implements  DemoDubboService {

    @Override
    public String demo(String param) {
        System.out.println("demo方法执行了");
        return param + "demo123";
    }
}
