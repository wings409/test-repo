package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author 作者：bobo
* @version 创建时间：2019年10月29日 上午10:03:33
* @description 描述 商品
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	private Integer id;
	private String name;
	private Integer number;
}

