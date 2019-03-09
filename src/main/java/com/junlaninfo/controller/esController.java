package com.junlaninfo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junlaninfo.dao.ElasticsearchDao;
import com.junlaninfo.entity.UserEntity;

/** 

* @author 作者 xuexionghui: 
   @emil:41366915@qq.com
* @version 创建时间：2019年3月9日 上午11:35:37 

* 类说明 

*/ 
@RestController
public class esController {
	
	@Autowired
	private  ElasticsearchDao   esDao;
	
	@RequestMapping(value="/saveUser")
	public  UserEntity  saveUser(@RequestBody   UserEntity  user) {
		UserEntity entity = esDao.save(user);
		return entity;
	}
	
	@RequestMapping(value="/getUser")
     public Optional<UserEntity>   getUser(String id) {
		Optional<UserEntity> optional = esDao.findById(id);
		return optional;
	}
}
