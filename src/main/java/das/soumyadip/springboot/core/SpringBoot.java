package das.soumyadip.springboot.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"das.soumyadip.springboot"})
public class SpringBoot {

	public static void main(String[] args) {
		System.out.println("In SpringBoot......");
		SpringApplication.run(SpringBoot.class, args);
	}
}
