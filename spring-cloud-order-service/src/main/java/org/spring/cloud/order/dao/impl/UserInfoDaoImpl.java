package org.spring.cloud.order.dao.impl;

import org.spring.cloud.order.dao.UserInfoDao;
import org.spring.cloud.order.entity.PageData;
import org.spring.cloud.order.mapper.UserMapper;
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
