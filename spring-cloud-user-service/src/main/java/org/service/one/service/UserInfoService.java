package org.service.one.service;

import org.service.one.entity.PageData;

public interface UserInfoService {
	PageData selectByPhone(PageData pd) throws Exception;
}
