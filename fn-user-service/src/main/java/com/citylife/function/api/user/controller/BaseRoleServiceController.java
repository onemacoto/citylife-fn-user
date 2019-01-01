package com.citylife.function.api.user.controller;

import java.util.List;

import com.citylife.common.model.RequestVO;
import com.citylife.common.model.ResponseVO;
import com.citylife.common.model.ResultEntity;
import com.citylife.function.api.user.client.IBaseRoleClient;
import com.citylife.function.api.user.client.entity.BaseRole;

public class BaseRoleServiceController implements IBaseRoleClient {

	@Override
	public ResultEntity<ResponseVO<List<BaseRole>>> getRoleByUserId(RequestVO<Long> userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
