package com.couyis.common.util;

import java.util.UUID;

public class UUIDUtil {
	public final static String get() {
		String s = UUID.randomUUID().toString();// 用来生成数据库的主键id
		s = s.replaceAll("-", "");
		return s;
	}
}
