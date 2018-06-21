package org.service.one.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.service.one.base.BaseController;
import org.service.one.entity.PageData;
import org.service.one.entity.RestResult;
import org.service.one.entity.ResultGenerator;
import org.service.one.entity.User_info;
import org.service.one.service.UserInfoService;
import org.service.one.util.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@Api(description="用户")
public class UserController extends BaseController{
protected final Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserInfoService userInfoService;
	
	private final ResultGenerator generator;
	
	@Autowired  // 自动装配
	public UserController(UserInfoService userInfoService, ResultGenerator generator) {
		this.userInfoService = userInfoService;
		this.generator = generator;
	}
	@ApiOperation("用户查询")
	@RequestMapping(value="/serviceOne", produces = { "application/json;charset=UTF-8" },method=RequestMethod.GET)
	@ResponseBody
	public RestResult serviceOne(String mobile) throws Exception{
		PageData pd = this.getPageData();
		pd.put("mobile",mobile);
		pd = userInfoService.selectByPhone(pd);
		
		return generator.getSuccessResult(pd);
	}
}
