package com.shine.automotive.dao;

import com.shine.automotive.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/app_*.xml")
public class CarLoverDaoTest {

	@Resource
	private UserDao userDao;


	// 添加用户
	@Test
	public void testAddUser() {
		try {
			User user = new User();
			user.setUserId("2014");
			user.setUsername("fuzhaohui");
			user.setPassword("123456");
			user.setPhone("18516292510");
			user.setEmail("autonavi@autonavi.com");
			System.out.println(userDao.save("saveUser", user));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 修改用户
	@Test
	public void testUpdateUser() {
		try {
			User user = new User();
			user.setUserId("2014");
			user.setUsername("fuzhaohui");
			user.setPassword("1234561");
			user.setPhone("18516292510");
			user.setEmail("autonavi@autonavi.com");
			System.out.println(userDao.save("updateUser", user));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
