package org.spring.cloud.order.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.spring.cloud.order.base.BaseController;
import org.spring.cloud.order.entity.PageData;
import org.spring.cloud.order.entity.RestResult;
import org.spring.cloud.order.entity.ResultGenerator;
import org.spring.cloud.order.service.UserInfoService;
import org.spring.cloud.order.util.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@Api(description="订单")
public class UserController extends BaseController{
protected final Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private  ResultGenerator generator;
	
//	@Autowired  // 自动装配
//	public UserController(UserInfoService userInfoService, ResultGenerator generator) {
//		this.userInfoService = userInfoService;
//		this.generator = generator;
//	}
	@ApiOperation("订单查询")
	@RequestMapping(value="/serviceOne", produces = { "application/json;charset=UTF-8" },method=RequestMethod.GET)
	@ResponseBody
	public RestResult serviceOne(String mobile) throws Exception{
		PageData pd = this.getPageData();
		pd.put("mobile",mobile);
		pd = userInfoService.selectByPhone(pd);
		
		return generator.getSuccessResult(pd);
	}
}
