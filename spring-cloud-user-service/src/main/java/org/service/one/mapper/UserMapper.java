package org.service.one.mapper;

import org.service.one.entity.PageData;
import org.service.one.entity.User_info;

public interface UserMapper {
	PageData selectByPhone(PageData pd);
}
