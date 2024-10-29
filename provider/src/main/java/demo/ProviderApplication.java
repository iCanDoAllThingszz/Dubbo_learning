package demo; /**
 * @Author:zhoayu
 * @Date:2024/10/29 12:36
 * @Description:PACKAGE_NAME
 * @version:1.0
 */

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName demo.ProviderApplication
 * @Description //TODO 
 * @Author zhaoyu
 * @Date 2024/10/29
 */
@SpringBootApplication
@EnableDubbo
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}