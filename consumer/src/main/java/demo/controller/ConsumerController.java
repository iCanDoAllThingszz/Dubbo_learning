package demo.controller;/**
 * @Author:zhoayu
 * @Date:2024/10/29 18:32
 * @Description:demo.controller
 * @version:1.0
 */

import demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConsumerController
 * @Description //TODO 
 * @Author zhaoyu
 * @Date 2024/10/29
 */
@RestController
public class ConsumerController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo")
    public String demo(@RequestParam("name") String param){
        return demoService.demo(param);
    }
}

 