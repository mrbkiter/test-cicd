package test.personal.cicd2.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApis {
    @GetMapping("/health-check")
    public String healthCheck() {
        return "ok";
    }
}
