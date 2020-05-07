package com.order.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.order.base.BaseController;
import com.order.entity.PageData;
import com.order.entity.UserInfo;
import com.order.service.UserInfoService;
import com.order.util.Logger;
import com.order.util.RestResult;
import com.order.util.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(description="订单")
public class UserController extends BaseController{
protected final Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserInfoService userInfoService;

	@ApiOperation("订单查询")
	@RequestMapping(value="/serviceOne", produces = { "application/json;charset=UTF-8" },method=RequestMethod.GET)
	@ResponseBody
	public RestResult serviceOne(String mobile) throws Exception{
		PageData pd = this.getPageData();
		UserInfo userInfo = new UserInfo();
		userInfo.setMobile(mobile);
		userInfo = userInfoService.selectByPhone(userInfo);
		logger.info("返回："+userInfo);
		return ResultGenerator.getSuccessResult(userInfo);
	}
}
