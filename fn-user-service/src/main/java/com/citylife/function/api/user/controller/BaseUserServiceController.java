package com.citylife.function.api.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.citylife.common.model.RequestVO;
import com.citylife.common.model.ResponseVO;
import com.citylife.common.model.ResultEntity;
import com.citylife.function.api.user.action.GetUserByPhoneAction;
import com.citylife.function.api.user.action.GetUserByUserNameAction;
import com.citylife.function.api.user.client.IBaseUserClient;
import com.citylife.function.api.user.client.entity.BaseUser;
import com.citylife.function.core.boot.template.AbstractTemplateController;
import com.citylife.function.core.boot.template.TemplateService;

@RestController
public class BaseUserServiceController extends AbstractTemplateController<TemplateService> implements IBaseUserClient {
	
  @Autowired
  private GetUserByUserNameAction getUserByUserNameAction;
	
  @Autowired
  private GetUserByPhoneAction getUserByPhoneAction;
	

	@Override
	public ResultEntity<ResponseVO<BaseUser>> getUserByUserName(RequestVO<String> userName, String version,
			String token) {
		return doAction(getUserByUserNameAction, userName, version, token);
	}

	@Override
	public ResultEntity<ResponseVO<BaseUser>> getUserByPhone(RequestVO<String> phone, String version, String token) {
	  return doAction(getUserByPhoneAction, phone, version, token);
	}

}
