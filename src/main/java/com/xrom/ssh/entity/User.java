package com.xrom.ssh.entity;

/**
 * 用户表实体类
 * 
 * @author HP5
 *
 */
public class User {
	private int userId;
	private String email;
	private String password;
	private String sex;
	private String birthday;
	private int flag;

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password=" + password + ", sex=" + sex + ", birthday="
				+ birthday + ", flag=" + flag + "]";
	}

	public User() {

	}

	public User(int userId, String email, String password, String sex, String birthday, int flag) {
		// super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.sex = sex;
		this.birthday = birthday;
		this.flag = flag;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

}
