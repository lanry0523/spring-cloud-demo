package org.spring.cloud.order.dao;

import org.spring.cloud.order.entity.PageData;

public interface UserInfoDao {
	PageData selectByPhone(PageData pd);
}
