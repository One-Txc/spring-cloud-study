package txc.xyz.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    @HystrixCommand(fallbackMethod = "fallback")
    public String dc(){
        //throw new Exception("");
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    public String fallback() {
        System.out.println("fallback");
        return "fallback";
    }

}