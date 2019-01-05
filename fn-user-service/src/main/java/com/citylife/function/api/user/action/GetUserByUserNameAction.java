package com.citylife.function.api.user.action;

import org.springframework.stereotype.Component;

import com.citylife.common.model.RequestVO;
import com.citylife.common.model.ResponseVO;
import com.citylife.common.model.ResultEntity;
import com.citylife.common.model.builder.ResponseVOBuilder;
import com.citylife.function.api.user.client.entity.BaseUser;
import com.citylife.function.core.annotations.ActionTransactional;
import com.citylife.function.core.boot.template.context.IActionContext;


@ActionTransactional
@Component
public class GetUserByUserNameAction extends AbstractFunctionAction<RequestVO<String>, ResponseVO<BaseUser>> {
  
  @Override
  public ResultEntity<ResponseVO<BaseUser>> execute(IActionContext<RequestVO<String>> context) {
    BaseUser user = new BaseUser();
    user.setId(1L);
    user.setPassword("$2a$06$OF00ODxoQx1G44Cja/aehuzXZ3h1mmIn.Dxo0D793d9rjszrRgnRK");
    user.setUserName(context.getParameter().getData());
    System.out.println(context.getParameter().getData());
    user.setActive(1);
    return ResultEntity.ok(ResponseVOBuilder.build(user));
  }
}
