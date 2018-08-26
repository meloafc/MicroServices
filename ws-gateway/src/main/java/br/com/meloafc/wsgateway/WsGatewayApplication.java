package br.com.meloafc.wsgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Source: https://howtodoinjava.com/spring-cloud/spring-cloud-api-gateway-zuul/
 */
@SpringBootApplication
@EnableZuulProxy
public class WsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsGatewayApplication.class, args);
	}
}
