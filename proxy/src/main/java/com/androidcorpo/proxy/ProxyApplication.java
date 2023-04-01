package com.androidcorpo.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;
import java.util.Objects;

@SpringBootApplication
public class ProxyApplication {

	public static void main(String[] args) {
    SpringApplication.run(ProxyApplication.class, args);
	}

	@Bean
	public KeyResolver keyResolver() {
    return exchange ->
        Mono.just(
            Objects.requireNonNull(exchange.getRequest().getRemoteAddress())
                .getAddress()
                .getHostAddress()); //Actually just focus on HostAddress for limit
	}
}
