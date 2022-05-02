package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import test.personal.cicd2.apis.APis;

/**
 *
 */
@SpringBootApplication
@EnableWebMvc
@ComponentScan(
        basePackageClasses = {APis.class}
)
public class AppBoot {
    public static void main(String[] args) {
        SpringApplication.run(AppBoot.class);
    }
}
