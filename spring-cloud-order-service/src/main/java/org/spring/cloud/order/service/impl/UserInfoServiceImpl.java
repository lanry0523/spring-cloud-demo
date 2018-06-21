package org.spring.cloud.order.service.impl;

import org.spring.cloud.order.dao.UserInfoDao;
import org.spring.cloud.order.entity.PageData;
import org.spring.cloud.order.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl implements UserInfoService{
	@Autowired
	private UserInfoDao userInfoDao;
	@Override
	public PageData selectByPhone(PageData pd) throws Exception {
		return userInfoDao.selectByPhone(pd);
	}

}
