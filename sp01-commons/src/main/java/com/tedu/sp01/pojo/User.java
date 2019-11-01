package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author 作者：bobo
* @version 创建时间：2019年10月29日 上午10:15:12
* @description 描述：用户
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Integer id;
	private String username;
	private String password;
}

