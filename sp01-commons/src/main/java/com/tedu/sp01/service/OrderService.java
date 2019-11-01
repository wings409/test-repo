package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

/**
* @author 作者：bobo
* @version 创建时间：2019年10月29日 上午10:04:13
* @description 描述：订单
*/
public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);
}

