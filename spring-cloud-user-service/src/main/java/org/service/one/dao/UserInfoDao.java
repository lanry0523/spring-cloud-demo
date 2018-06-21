package org.service.one.dao;

import org.service.one.entity.PageData;
import org.service.one.entity.User_info;

public interface UserInfoDao {
	PageData selectByPhone(PageData pd);
}
