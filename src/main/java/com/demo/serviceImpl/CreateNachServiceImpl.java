package com.demo.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.demo.service.CreateNachService;



@Service
public class CreateNachServiceImpl implements CreateNachService {

	@Override
	public Map<String, Object> createNach() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		
		 map.put("Sucess","http://localhost:8090/admin/redirect/paymentLink");
		 return map;
		
		
		
	}

	
}
