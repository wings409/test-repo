package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

/**
* @author 作者：bobo
* @version 创建时间：2019年10月29日 上午10:17:21
* @description 描述：商品业务层接口
*/
public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}

