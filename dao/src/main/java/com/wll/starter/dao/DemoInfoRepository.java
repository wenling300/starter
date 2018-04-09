package com.wll.starter.dao;

import com.wll.starter.dao.model.DemoInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * spring的CrudRepository接口默认实现了一套增删查改的功能，自己不再需要些
 */
public interface DemoInfoRepository extends CrudRepository<DemoInfo, Long> {

}
