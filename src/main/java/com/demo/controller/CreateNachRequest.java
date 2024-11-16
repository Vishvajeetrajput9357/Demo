package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Encryption.Encryption;
import com.demo.Encryption.ResponseMessage;
import com.demo.request.MerchantRegistertRequest;
import com.demo.service.CreateNachService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/NachRequest")
public class CreateNachRequest {
	
	@Autowired private CreateNachService createNachService;
	
	@PostMapping("/merchantRegister")
	public Map<String, Object> merchantRegister() {
		Map<String, Object> map = new HashMap<>();
		try {
			
			return createNachService.createNach();

		} catch (Exception e) {
			return map;
		}
	}
	
}
