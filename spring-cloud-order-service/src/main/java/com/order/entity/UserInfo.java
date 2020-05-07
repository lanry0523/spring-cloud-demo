package com.order.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@Table(name="user_info")
public class UserInfo  implements Serializable  {
    @Id
    private String id; // 
    private String userName; // 
    private String sex; // 
    private String address; // 
    private String mobile; // 
    private String mail; // 
    private String idNo; // 
    private String password; // 
    private String openid; // 
    private String accessToken; // 
    private String refreshToken; // 
    private String headimgurl; // 
    private String rongcloudToken; // 
    private String status; // 


}