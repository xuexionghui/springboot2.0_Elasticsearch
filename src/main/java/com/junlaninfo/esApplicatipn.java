package com.junlaninfo;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/** 

* @author 作者 xuexionghui: 
   @emil:41366915@qq.com
* @version 创建时间：2019年3月9日 上午11:22:07 

* 类说明 

*/ 
@SpringBootApplication
@EnableElasticsearchRepositories(basePackages="com.junlaninfo.dao")

public class esApplicatipn {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(esApplicatipn.class);
		application.run(args);
	}

}