package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.request.LoginRequest;

@RestController
public class MerchantController {

	@PostMapping("/login")
	public Map<String, Object> loginMerchant(@RequestBody @Valid LoginRequest loginRequest) {

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("bussinessName", "HP Gas");
		map.put("status", "Success");
		map.put("date", "12-11-2024 22:39:13");
		map.put("merchantUserName", "HP Gas");
		map.put("loggedIn", true);
		map.put("firstName", "Vishvajeet");
		map.put("code", "0x0200");
		map.put("description", "Login Successfully");
		return map;
	}

}
