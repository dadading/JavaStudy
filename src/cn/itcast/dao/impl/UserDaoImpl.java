package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

/**
 * 
 * 这是用户操作具体实现类
 * 
 * @author dingguanyi
 * @version v1.0
 *
 */

public class UserDaoImpl implements UserDao {
	// 把用户集合定义为成员变量
	private static ArrayList<User> arr = new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {
		// 遍历集合获取每一个用户信息,并判断传过来的用户名和密码是否匹配
		Boolean flag = false;

		for (User u : arr) {
			if (u.getUsername().equals(username)
					&& u.getPassword().equals(password)) {
				flag = true;
				break;
			}
		}

		return flag;
	}

	@Override
	public void regist(User user) {
		// 把心注册的用户信息存储起来
		arr.add(user);

	}

}
