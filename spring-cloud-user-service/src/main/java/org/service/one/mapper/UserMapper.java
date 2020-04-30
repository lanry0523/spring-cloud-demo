package org.service.one.mapper;

import org.service.one.entity.PageData;

public interface UserMapper {
	PageData selectByPhone(PageData pd);
}
