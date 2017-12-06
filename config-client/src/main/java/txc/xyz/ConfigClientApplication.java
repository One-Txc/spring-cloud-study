package txc.xyz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ConfigClientApplication {

	@Autowired
	void setEnviroment(Environment env) {
		//可以用于检测配置是否加载上了
		System.out.println("my-config.appName from env: " + env.getProperty("from"));
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
