package com.demo.repository;

public interface MerchantProfileRepository {

	public boolean existsByMerchantEmail(String encString) ;

	public boolean existsByMerchantPhone(String encString);

}
