package com.junlaninfo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;



/** 

* @author 作者 xuexionghui: 
   @emil:41366915@qq.com
* @version 创建时间：2019年3月9日 上午11:30:30 

* 类说明 

*/ 
//            在elasticsearch种的索引名    类型名
@Document(indexName = "xuexionghui", type = "user")
//@Data
public class UserEntity {
	@Id
	private String id;    //在Elasticsearch中,在Java可以不传入id,Elasticsearch可以主动生成一个Id值
	private String name;
	private int sex;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;

}