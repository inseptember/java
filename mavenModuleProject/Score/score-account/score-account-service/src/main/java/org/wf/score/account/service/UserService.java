package org.wf.score.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.wf.core.cache.MemcachedObjectType;
import org.wf.core.cache.SpyMemcachedClient;
import org.wf.core.utils.JsonMapper;
import org.wf.score.account.dao.UserDao;
import org.wf.score.account.entity.User;

@Component
@Transactional
public class UserService {
	
	private UserDao userDao;
	
	private SpyMemcachedClient memcachedClient;

	private final JsonMapper jsonMapper = JsonMapper.nonDefaultMapper();
	
	public User getByLoginName(String name){
		User param = new User();
		param.setName(name);
		List<User> users = userDao.search(param);
		return users.get(0);
	}
	
	public User getByLoginNameInCache(Integer id){
		String key = MemcachedObjectType.USER.getPrefix() + id;
		User user = null;
		String jsonString = memcachedClient.get(key);
		if (jsonString == null) {
			user = userDao.get(id);
			if (user != null) {
				jsonString = jsonMapper.toJson(user);
				memcachedClient.set(key, MemcachedObjectType.USER.getExpiredTime(), jsonString);
			}
		} else {
			user = jsonMapper.fromJson(jsonString, User.class);
		}
		return user;
	}
	
	@Autowired(required = false)
	public void setMemcachedClient(SpyMemcachedClient memcachedClient) {
		this.memcachedClient = memcachedClient;
	}

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
