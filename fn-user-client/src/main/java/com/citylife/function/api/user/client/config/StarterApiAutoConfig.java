package com.citylife.function.api.user.client.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.citylife.function.api.user.client.IBaseUserClient.BaseUserClientFallbackFactory;
import com.citylife.function.api.user.constant.ClientConstants;

@Configuration
@EnableFeignClients("com.citylife.function.api.user.client")
@ConditionalOnExpression("#{!environment['spring.application.name'].equals('" + ClientConstants.SERVICE_NAME
		+ "')}")
public class StarterApiAutoConfig {

	@Bean
	@ConditionalOnMissingBean
	public BaseUserClientFallbackFactory productClientFallbackFactory() {
		BaseUserClientFallbackFactory bean = new BaseUserClientFallbackFactory();
		return bean;
	}

}
