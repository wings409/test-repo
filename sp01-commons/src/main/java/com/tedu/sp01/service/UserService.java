package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

/**
* @author 作者：bobo
* @version 创建时间：2019年10月29日 上午10:19:04
* @description 描述：用户业务层接口
*/
public interface UserService {
	User getUser(Integer id);
	void addScore(Integer id,Integer score);
}

