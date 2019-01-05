package com.citylife.function.api.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.citylife.common.model.RequestVO;
import com.citylife.common.model.ResponseVO;
import com.citylife.common.model.ResultEntity;
import com.citylife.function.api.user.client.entity.BaseUser;
import com.citylife.function.api.user.constant.ClientConstants;
import com.citylife.function.core.api.feign.AbstractClientFallbackFactory;
import com.citylife.function.core.api.feign.IApiClient;

@FeignClient(name = ClientConstants.SERVICE_NAME, fallbackFactory = IBaseUserClient.BaseUserClientFallbackFactory.class)
public interface IBaseUserClient extends IApiClient {

	@PostMapping("/{" + VERSION_KEY + "}/user/getUserByUserName")
	ResultEntity<ResponseVO<BaseUser>> getUserByUserName(@RequestBody final RequestVO<String> userName,
			final @PathVariable(VERSION_KEY) String version,
			final @RequestHeader(name = HEADER_TOKEN_KEY) String token);

	@PostMapping("/{" + VERSION_KEY + "}/user/getUserByPhone")
	ResultEntity<ResponseVO<BaseUser>> getUserByPhone(@RequestBody final RequestVO<String> phone,
			final @PathVariable(VERSION_KEY) String version,
			final @RequestHeader(name = HEADER_TOKEN_KEY) String token);

	public static class BaseUserClientFallbackFactory extends AbstractClientFallbackFactory<IBaseUserClient> {

	}
}
