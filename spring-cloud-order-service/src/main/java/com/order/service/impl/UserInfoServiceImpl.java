package com.order.service.impl;

import com.order.dao.UserInfoDao;
import com.order.entity.UserInfo;
import com.order.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoDao userInfoDao;
	@Override
	public UserInfo selectByPhone(UserInfo userInfo) {
		return userInfoDao.selectOne(userInfo);
	}

}
