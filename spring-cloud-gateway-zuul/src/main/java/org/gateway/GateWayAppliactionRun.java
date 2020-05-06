package org.gateway;


import filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
@EnableZuulProxy
public class GateWayAppliactionRun {
	public static void main(String[] args) {
		SpringApplication.run(GateWayAppliactionRun.class, args);
	}

	@Bean
	public AccessFilter myZuulPreFilter() {
		return new AccessFilter();
	}
}
