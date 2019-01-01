package com.citylife.function.api.user.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.citylife.common.model.RequestVO;
import com.citylife.common.model.ResponseVO;
import com.citylife.common.model.ResultEntity;
import com.citylife.function.api.user.client.entity.BaseRole;

@FeignClient(name = IModuleApiClient.SERVICE_NAME, fallbackFactory = IBaseUserClient.BaseUserClientFallbackFactory.class)
public interface IBaseRoleClient extends IModuleApiClient {

	/**
	 * 根据userId查询角色
	 * 
	 * @param userId
	 * @return
	 */
	@PostMapping(value = "/role/getRoleByUserId")
	ResultEntity<ResponseVO<List<BaseRole>>> getRoleByUserId(final RequestVO<Long> userId);

}
