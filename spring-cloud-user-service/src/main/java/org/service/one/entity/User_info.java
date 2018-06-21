package org.service.one.entity;
import java.io.Serializable;


/**
 * 
 * 用户表
 * 
 **/
@SuppressWarnings("serial")
public class User_info implements Serializable {

	/**用户id**/
	
	private Integer id;

	/**用户名称**/
	private String userName;

	/**性别**/
	private String sex;

	/**地址**/
	private String address;

	/**手机号**/
	private String mobile;

	/**邮箱**/
	private String mail;

	/**身份证号**/
	private String idNo;
	
	/**密码**/
	private String password;
	
	/**openid**/
	private String openid;
	
	/**access_token**/
	private String access_token;
	
	/**refresh_token**/
	private String refresh_token;
	
	private String headimgurl;
	
	private String status;
	
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public String getSex(){
		return this.sex;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return this.address;
	}

	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	public String getMobile(){
		return this.mobile;
	}

	public void setMail(String mail){
		this.mail = mail;
	}

	public String getMail(){
		return this.mail;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	
	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User_info [id=" + id + ", userName=" + userName + ", sex="
				+ sex + ", address=" + address + ", mobile=" + mobile
				+ ", mail=" + mail + ", idNo=" + idNo + ", password="
				+ password + ", openid=" + openid + ", access_token="
				+ access_token + ", refresh_token=" + refresh_token
				+ ", headimgurl=" + headimgurl + ", status=" + status + "]";
	}


}
