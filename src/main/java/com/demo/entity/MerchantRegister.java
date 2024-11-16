//package com.demo.entity;
//
//import java.sql.Timestamp;
//
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.persistence.Column;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//
//@Table(name = "MERCHANTS")
//public class MerchantRegister {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "MERCHANT_ID")
//	private long merchantId;
//
//	@Column(name = "MERCHANT_EMAIL", nullable = false, length = 200)
//	private String merchantEmail;
//
//	@Column(name = "MERCHANT_PHONE", nullable = false, length = 100)
//	private String merchantPhone;
//
//	@Column(name = "MERCHANT_PASSWORD", nullable = false, length = 200)
//	private String merchantPassword;
//
//	@Column(name = "MERCHANT_FIRSTNAME", length = 100)
//	private String merchantFirstname;
//
//	@Column(name = "MERCHANT_LASTNAME", length = 100)
//	private String merchantLastname;
//
//	@Column(name = "MERCHANT_ADDRESS1", length = 200)
//	private String merchantAddress1;
//
//	@Column(name = "MERCHANT_ADDRESS2", length = 200)
//	private String merchantAddress2;
//
//	@Column(name = "MERCHANT_CITY", length = 100)
//	private String merchantCity;
//
//	@Column(name = "MERCHANT_STATE", length = 100)
//	private String merchantState;
//
//	@Column(name = "MERCHANT_COUNTRY", length = 100)
//	private String merchantCountry;
//
//	@Column(name = "MERCHANT_ZIPCODE", length = 50)
//	private String merchantZipcode;
//
//	@Column(name = "IS_MERCHANT_ACTIVE", length = 1)
//	private Character isMerchantActive;
//
//	@Column(name = "MERCHANT_BUSINESS_NAME", length = 300)
//	private String merchantBusinessName;
//
//	@Column(name = "IS_MERCHANT_EMAIL_VERIFIED", length = 1)
//	private Character isMerchantEmailVerified;
//
//	@Column(name = "IS_MERCHANT_PHONE_VERIFIED", length = 1)
//	private Character isMerchantPhoneVerified;
//
//	@Column(name = "GENDER", length = 1)
//	private Character gender;
//
//	@Column(name = "MERCHANT_NATIONALITY", length = 200)
//	private String merchantNationality;
//
//	@Column(name = "MERCHANT_REGISTRATION_DATE")
//	private Timestamp merchantRegistrationDate;
//
//	public long getMerchantId() {
//		return merchantId;
//	}
//
//	public void setMerchantId(long merchantId) {
//		this.merchantId = merchantId;
//	}
//
//	public String getMerchantEmail() {
//		return merchantEmail;
//	}
//
//	public void setMerchantEmail(String merchantEmail) {
//		this.merchantEmail = merchantEmail;
//	}
//
//	public String getMerchantPhone() {
//		return merchantPhone;
//	}
//
//	public void setMerchantPhone(String merchantPhone) {
//		this.merchantPhone = merchantPhone;
//	}
//
//	public String getMerchantPassword() {
//		return merchantPassword;
//	}
//
//	public void setMerchantPassword(String merchantPassword) {
//		this.merchantPassword = merchantPassword;
//	}
//
//	public String getMerchantFirstname() {
//		return merchantFirstname;
//	}
//
//	public void setMerchantFirstname(String merchantFirstname) {
//		this.merchantFirstname = merchantFirstname;
//	}
//
//	public String getMerchantLastname() {
//		return merchantLastname;
//	}
//
//	public void setMerchantLastname(String merchantLastname) {
//		this.merchantLastname = merchantLastname;
//	}
//
//	public String getMerchantAddress1() {
//		return merchantAddress1;
//	}
//
//	public void setMerchantAddress1(String merchantAddress1) {
//		this.merchantAddress1 = merchantAddress1;
//	}
//
//	public String getMerchantAddress2() {
//		return merchantAddress2;
//	}
//
//	public void setMerchantAddress2(String merchantAddress2) {
//		this.merchantAddress2 = merchantAddress2;
//	}
//
//	public String getMerchantCity() {
//		return merchantCity;
//	}
//
//	public void setMerchantCity(String merchantCity) {
//		this.merchantCity = merchantCity;
//	}
//
//	public String getMerchantState() {
//		return merchantState;
//	}
//
//	public void setMerchantState(String merchantState) {
//		this.merchantState = merchantState;
//	}
//
//	public String getMerchantCountry() {
//		return merchantCountry;
//	}
//
//	public void setMerchantCountry(String merchantCountry) {
//		this.merchantCountry = merchantCountry;
//	}
//
//	public String getMerchantZipcode() {
//		return merchantZipcode;
//	}
//
//	public void setMerchantZipcode(String merchantZipcode) {
//		this.merchantZipcode = merchantZipcode;
//	}
//
//	public Character getIsMerchantActive() {
//		return isMerchantActive;
//	}
//
//	public void setIsMerchantActive(Character isMerchantActive) {
//		this.isMerchantActive = isMerchantActive;
//	}
//
//	public String getMerchantBusinessName() {
//		return merchantBusinessName;
//	}
//
//	public void setMerchantBusinessName(String merchantBusinessName) {
//		this.merchantBusinessName = merchantBusinessName;
//	}
//
//	public Character getIsMerchantEmailVerified() {
//		return isMerchantEmailVerified;
//	}
//
//	public void setIsMerchantEmailVerified(Character isMerchantEmailVerified) {
//		this.isMerchantEmailVerified = isMerchantEmailVerified;
//	}
//
//	public Character getIsMerchantPhoneVerified() {
//		return isMerchantPhoneVerified;
//	}
//
//	public void setIsMerchantPhoneVerified(Character isMerchantPhoneVerified) {
//		this.isMerchantPhoneVerified = isMerchantPhoneVerified;
//	}
//
//	public Character getGender() {
//		return gender;
//	}
//
//	public void setGender(Character gender) {
//		this.gender = gender;
//	}
//
//	public String getMerchantNationality() {
//		return merchantNationality;
//	}
//
//	public void setMerchantNationality(String merchantNationality) {
//		this.merchantNationality = merchantNationality;
//	}
//
//	public Timestamp getMerchantRegistrationDate() {
//		return merchantRegistrationDate;
//	}
//
//	public void setMerchantRegistrationDate(Timestamp merchantRegistrationDate) {
//		this.merchantRegistrationDate = merchantRegistrationDate;
//	}
//
//	
//}
