package org.discovery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryAppliactionRun {
	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "false1");
		SpringApplication.run(DiscoveryAppliactionRun.class, args);
	}
}
