package org.spring.cloud.order.mapper;

import org.spring.cloud.order.entity.PageData;

public interface UserMapper {
	PageData selectByPhone(PageData pd);
}
