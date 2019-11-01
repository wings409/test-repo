package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author 作者：bobo
* @version 创建时间：2019年10月29日 上午10:16:12
* @description 描述：订单
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String id;
	private User user;
	private List<Item> items;
}

