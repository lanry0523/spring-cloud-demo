package org.spring.cloud.order.service;

import org.spring.cloud.order.entity.PageData;

public interface UserInfoService {
	PageData selectByPhone(PageData pd) throws Exception;
}
