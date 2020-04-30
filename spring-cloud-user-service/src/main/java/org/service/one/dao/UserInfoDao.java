package org.service.one.dao;

import org.service.one.entity.PageData;

public interface UserInfoDao {
	PageData selectByPhone(PageData pd);
}
