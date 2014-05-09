package org.wf.score.account.dao;

import org.wf.core.dao.api.CommonDao;
import org.wf.core.repository.MyBatisRepository;
import org.wf.score.account.entity.User;

@MyBatisRepository
public interface UserDao extends CommonDao<User> {

}
