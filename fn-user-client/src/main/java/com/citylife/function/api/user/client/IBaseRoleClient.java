package com.citylife.function.api.user.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.citylife.common.model.RequestVO;
import com.citylife.common.model.ResponseVO;
import com.citylife.common.model.ResultEntity;
import com.citylife.function.api.user.client.entity.BaseRole;
import com.citylife.function.api.user.constant.ClientConstants;
import com.citylife.function.core.api.feign.IApiClient;

@FeignClient(name = ClientConstants.SERVICE_NAME, fallbackFactory = IBaseUserClient.BaseUserClientFallbackFactory.class)
public interface IBaseRoleClient extends IApiClient {

	/**
	 * 根据userId查询角色
	 * 
	 * @param userId
	 * @return
	 */
	@PostMapping(value = "/role/getRoleByUserId")
	ResultEntity<ResponseVO<List<BaseRole>>> getRoleByUserId(@RequestBody final RequestVO<Long> userId);

}
