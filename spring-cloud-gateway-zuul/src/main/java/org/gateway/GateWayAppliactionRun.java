package org.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@SpringCloudApplication
public class GateWayAppliactionRun {
	public static void main(String[] args) {
		SpringApplication.run(GateWayAppliactionRun.class, args);
	}
}
