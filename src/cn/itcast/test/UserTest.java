package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.GuessNumberBean;
import cn.itcast.pojo.User;

/**
 * 
 * 用户测试类
 * 
 * @author dingguanyi
 * @version v1.0
 * 
 *
 */
public class UserTest {
	public static void main(String[] args) {

		while (true) {
			System.out.println("-------------欢迎光临-------------");
			System.out.println("1 登录");
			System.out.println("2 注册");
			System.out.println("3 退出");
			System.out.println("请输入您的选择：");

			// 键盘录入选择
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();

			// 多个地方要使用
			UserDao ud = new UserDaoImpl();

			switch (choiceString) {
			case "1":
				// 登录界面
				System.out.println("-------------登录界面-------------");
				System.out.println("请输入您的用户名：");
				String username = sc.nextLine();
				System.out.println("请输入您的 密码：");
				String password = sc.nextLine();

				// 多态使用
				// UserDao ud = new UserDaoImpl();

				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("登录成功:可以玩猜数字游戏");

					System.out.println("你玩吗?y/n");

					while (true) {
						String result = sc.nextLine();
						if (result.equalsIgnoreCase("y")) {
							GuessNumberBean.start();
							System.out.println("你还玩吗y/n");
						} else {
							break;
						}
					}

					System.out.println("谢谢使用,欢迎下次光临!");
					System.exit(0);

				} else {
					System.out.println("用户名或者密码失败！");
				}

				break;
			case "2":
				// 注册界面
				System.out.println("-------------注册界面-------------");
				System.out.println("请输入您的用户名：");
				String newUsername = sc.nextLine();
				System.out.println("请输入您的 密码：");
				String newPassword = sc.nextLine();

				// 把用户名和密码封装到一个对象中
				User u = new User();
				u.setUsername(newUsername);
				u.setPassword(newPassword);

				// 多态使用
				// UserDao ud = new UserDaoImpl();
				ud.regist(u);

				System.out.println("注册成功");
				break;
			case "3":
			default:
				System.out.println("谢谢使用,欢迎下次再来");
				System.exit(0);
				break;
			}
		}

	}
}
