//package com.demo.controller;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.demo.service.*;
//import com.demo.Encryption.Encryption;
//import com.demo.Encryption.ResponseMessage;
//import com.demo.entity.MerchantRegister;
//import com.demo.repository.MerchantProfileRepository;
//import com.demo.request.MerchantRegistertRequest;
//
//@RestController
//@CrossOrigin(origins = "*", allowedHeaders = "*")
//@RequestMapping("/merchantOnboarding")
//public class MerchantOnbordingController {
//
//	@Autowired
//	private MerchantProfileService merchantProfileService;
//	
//	@Autowired
//	private MerchantProfileRepository merchantProfileRepository;
//
//	@PostMapping("/merchantRegister")
//	public Map<String, Object> merchantRegister(@Valid @RequestBody MerchantRegistertRequest merchantRegisterRequest) {
//		Map<String, Object> map = new HashMap<>();
//		try {
//			if (merchantProfileRepository
//					.existsByMerchantEmail(Encryption.encString(merchantRegisterRequest.getMerchantEmail().toLowerCase()))) {
//				map.put(ResponseMessage.CODE, ResponseMessage.STATUS);
//				map.put(ResponseMessage.DESCRIPTION, "Merchant Email Id Already Registered");
//				map.put(ResponseMessage.STATUS, ResponseMessage.STATUS_FAILED);
//				return map;
//			}
//
//			if (merchantProfileRepository.existsByMerchantPhone(Encryption.encString(merchantRegisterRequest.getMerchantPhone()))) {
//				map.put(ResponseMessage.CODE, ResponseMessage.STATUS);
//				map.put(ResponseMessage.DESCRIPTION, "Merchant Mobile Number Already Registered");
//				map.put(ResponseMessage.STATUS, ResponseMessage.STATUS_FAILED);
//				return map;
//			}
//
//			return merchantProfileService.merchantRegister(merchantRegisterRequest, 1, '1');
//
//		} catch (Exception e) {
//			return map;
//		}
//	}
//
//}
