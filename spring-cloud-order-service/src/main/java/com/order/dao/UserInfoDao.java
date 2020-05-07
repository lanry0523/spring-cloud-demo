package com.order.dao;

import com.order.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserInfoDao extends Mapper<UserInfo> {

}
