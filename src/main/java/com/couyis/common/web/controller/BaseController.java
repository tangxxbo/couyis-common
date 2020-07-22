package com.couyis.common.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

	public String getAccount(HttpServletRequest request) {
		String account = (String) request.getHeader("X-ACCOUNT");
		return account;
	}

	public String getAccessToken(HttpServletRequest request) {
		String accessToken = (String) request.getHeader("X-ACCESS-TOKEN");
		return accessToken;
	}

	public Date getNow() {
		return new Date();
	}
}
