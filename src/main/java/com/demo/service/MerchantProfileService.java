package com.demo.service;

import java.util.Map;

import javax.validation.Valid;

import com.demo.request.MerchantRegistertRequest;

public interface MerchantProfileService {

	public Map<String, Object> merchantRegister(@Valid MerchantRegistertRequest merchantRegisterRequest, int i, char c);
	
}