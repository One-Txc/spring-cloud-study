package txc.xyz;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import txc.xyz.filter.AccessFilter;

@EnableZuulProxy
@SpringCloudApplication
public class ApiGetwayApplication {
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }


    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGetwayApplication.class).web(true).run(args);
    }
}
