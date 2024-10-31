package demo;/**
 * @Author:zhoayu
 * @Date:2024/10/31 12:36
 * @Description:demo
 * @version:1.0
 */

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

/**
 * @ClassName DeptApplication
 * @Description //TODO 
 * @Author zhaoyu
 * @Date 2024/10/31
 */
@SpringBootApplication
@EnableDubbo
public class DeptApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptApplication.class, args);
    }
}

 