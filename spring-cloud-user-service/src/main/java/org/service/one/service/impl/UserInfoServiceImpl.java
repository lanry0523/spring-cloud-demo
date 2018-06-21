package org.service.one.service.impl;

import org.service.one.dao.UserInfoDao;
import org.service.one.entity.PageData;
import org.service.one.entity.User_info;
import org.service.one.service.UserInfoService;
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
