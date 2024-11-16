package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.request.LoginRequest;

@RestController
public class MerchantController {

	@PostMapping("/login")
	public Map<String, Object> loginMerchant(@RequestBody @Valid LoginRequest loginRequest,BindingResult result) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {

			if (!loginRequest.getPassword().equalsIgnoreCase("Fail")) {
				map.put("bussinessName", "HP Gas");
				map.put("status", "Success");
				map.put("date", "12-11-2024 22:39:13");
				map.put("merchantUserName", "HP Gas");
				map.put("loggedIn", true);
				map.put("firstName", "Vishvajeet");
				map.put("code", "0x0200");
				map.put("description", "Login Successfully");
			} else {
				map.put("status", "Failure");
				map.put("loggedIn", false);
				map.put("code", "0x0202");
				map.put("description", "Invalid user email or password");
			}

		} catch (Exception e) {
			System.out.println(result.getFieldError().getDefaultMessage());
			e.printStackTrace();
			map.put("status", "Failure");
			map.put("loggedIn", false);
			map.put("code", "0x0202");
			map.put("description", "Invalid user email or password");
		}
		return map;
	}

}
