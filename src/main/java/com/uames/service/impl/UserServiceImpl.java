package com.uames.service.impl;

import org.springframework.stereotype.Component;

import com.uames.service.BaseService;
import com.uames.service.UserService;
import com.uames.util.CryptUtils;
import com.uames.vo.User;

/**
 * 用户服务实现类
 * 
 * @author jim
 * @version  [版本号, 2014-2-12]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Component
public class UserServiceImpl extends BaseService implements UserService {
	
	
	public User getUser(User user) {
		
		if (user.getPassword() != null) {				
			//对密码加密，然后进行匹配查询
			System.out.println(CryptUtils.encryptString(user.getPassword()));
			user.setPassword(CryptUtils.
					encryptString(user.getPassword()));
		}
		// 检索用户信息后，对密码重新解密后set
		user = userDao.getUser(user);
		if (user != null) {
			user.setPassword(CryptUtils.decryptString(user.getPassword()));			
		}
		return user;
	}

	
	public boolean updateUser(User user) {
		
		if (user.getPassword() != null) {	
			//对密码加密
			user.setPassword(CryptUtils.
					encryptString(user.getPassword()));
		}
		int result = userDao.updateUser(user);
		return result > 0;
	}
     
}
