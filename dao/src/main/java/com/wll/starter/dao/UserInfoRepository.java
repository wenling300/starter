package com.wll.starter.dao;

import org.springframework.data.repository.CrudRepository;
import com.wll.starter.dao.model.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, Long>{

}
