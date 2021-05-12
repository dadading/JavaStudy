package cn.itcast.pojo;

/**
 * 这是用户基本描述类
 * 
 * @author dingguanyi
 * @version v1.0
 */

public class User {
	// 用户名
	private String username;
	// 用户密码
	private String password;

	public User() {
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
