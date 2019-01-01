package com.citylife.function.api.user.controller;


import com.citylife.common.model.RequestVO;
import com.citylife.common.model.ResponseVO;
import com.citylife.common.model.ResultEntity;
import com.citylife.function.api.user.client.IBaseUserClient;
import com.citylife.function.api.user.client.entity.BaseUser;
import com.citylife.function.core.boot.template.AbstractTemplateController;
import com.citylife.function.core.boot.template.TemplateService;

public class BaseUserServiceController extends AbstractTemplateController<TemplateService> implements IBaseUserClient {
	
	
	

	@Override
	public ResultEntity<ResponseVO<BaseUser>> getUserByUserName(RequestVO<String> userName, String version,
			String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultEntity<ResponseVO<BaseUser>> getUserByPhone(RequestVO<String> phone, String version, String token) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
