package demo.service; /**
 * @Author:zhoayu
 * @Date:2024/10/29 18:24
 * @Description:PACKAGE_NAME
 * @version:1.0
 */

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @ClassName service.DemoServiceImpl
 * @Description //TODO 
 * @Author zhaoyu
 * @Date 2024/10/29
 */

// consumer的@Service注解使用spring的@Service
@Service
public class DemoServiceImpl implements DemoService {
    //使用Dubbo的@Reference注解完成注入
    @Reference
    private DemoDubboService demoDubboService;

    @Override
    public String demo(String param) {
        //通过rpc的方式远程调用服务的provider
        return demoDubboService.demo(param);
    }
}
