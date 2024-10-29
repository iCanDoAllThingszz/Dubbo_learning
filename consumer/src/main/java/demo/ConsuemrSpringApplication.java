package demo;/**
 * @Author:zhoayu
 * @Date:2024/10/29 18:31
 * @Description:demo
 * @version:1.0
 */

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ConsuemrSpringApplication
 * @Description //TODO 
 * @Author zhaoyu
 * @Date 2024/10/29
 */
@SpringBootApplication
@EnableDubbo
public class ConsuemrSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsuemrSpringApplication.class, args);
    }
}

 