package txc.xyz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by txc on 17-12-5.
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerGit {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerGit.class).web(true).run(args);
    }

}