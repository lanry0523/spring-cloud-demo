package org.service.one.service;

import org.service.one.entity.PageData;
import org.service.one.entity.User_info;

public interface UserInfoService {
	PageData selectByPhone(PageData pd) throws Exception;
}
