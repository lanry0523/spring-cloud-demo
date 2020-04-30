package org.service.one.dao.impl;

import org.service.one.dao.UserInfoDao;
import org.service.one.entity.PageData;
import org.service.one.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserInfoDaoImpl  implements UserInfoDao{

	@Autowired
	private UserMapper userMapper;
	@Override
	public PageData selectByPhone(PageData pd) {
		return userMapper.selectByPhone(pd);
	}

}
