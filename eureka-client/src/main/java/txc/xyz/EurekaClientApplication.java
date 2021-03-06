package txc.xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.HashMap;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

    public static void main(String[] args) {
        //SpringApplication.run(EurekaClientApplication.class, args);
        new SpringApplicationBuilder(EurekaClientApplication.class).web(true).run(args);
    }

}
