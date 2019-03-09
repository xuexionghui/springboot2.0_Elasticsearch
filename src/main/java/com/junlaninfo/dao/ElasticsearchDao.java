package com.junlaninfo.dao;

import org.springframework.data.repository.CrudRepository;

import com.junlaninfo.entity.UserEntity;

/** 

* @author 作者 xuexionghui: 
   @emil:41366915@qq.com
* @version 创建时间：2019年3月9日 上午11:33:39 

* 类说明 

*/ 
                                                                       //主键类型
public interface ElasticsearchDao   extends CrudRepository<UserEntity, String>{}