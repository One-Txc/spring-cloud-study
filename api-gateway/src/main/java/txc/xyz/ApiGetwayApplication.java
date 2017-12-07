package txc.xyz;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ApiGetwayApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGetwayApplication.class).web(true).run(args);
    }
}
