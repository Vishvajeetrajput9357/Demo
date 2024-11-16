package com.demo.Encryption;


public class ResponseMessage {

	public final static String REGISTERED = "Registered";
	public final static String INITIATED = "Initiated";

	// Response Code
	public final static String SUCCESS = "0x0200";
	public final static String UNAUTHORISED = "0x0201";
	public final static String FAILED = "0x0202";
	public final static String MISSING_PARAMETER = "0x0203";
	public final static String CONNECTION_TIMEOUT = "0x0204";
	public final static String SOMETHING_WENT_WRONG = "0x0205";

	// Response Key
	public final static String CODE = "code";
	public final static String DESCRIPTION = "description";
	public final static String FIELD = "field";
	public final static String STATUS = "status";

	// Response Field
	public final static String FIELD_I = "Client-Id, Client-Secret";

	public final static String HEADERS_CANT_EMPTY = "Client-Id and Client-Secret can't be empty";
	// Response Description
	public final static String UNAUTHORISED_DESCRIPTION = "Unauthorized Access to FidyPay Platform";
	public final static String DEBIT_AMOUNT_NOT_AVAILABLE = "Debit Amount not available";
	public final static String MERCHANTTRXNREFID_ALREADY_EXIST = "merchantTrxnRefId already exist please try unique id";
	public final static String MISSING_PARAMETER_DESCRIPTION = "Some Parameter are missing ";
	public final static String CONNECTION_TIMEOUT_DESCRIPTION = "Connection Timeout";
	public final static String SOMETHING_WENT_WRONG_DESCRIPTION = "Something Went Wrong, please try again";
	public final static String BAD_REQUEST = "0x0202";
	public final static String INVALID_JSON_FORMATE = "Invalid Request";
	public final static String HEADERS_MISSING = "Missing Required Headers";
	public final static String SERVER_DOWN = "Server down, Please try again after some time";

	public static final String MERCHANT_SERVICE_IS_ACTIVE_MESSAGE = "Merchant service is active successfully";
	public static final String MERCHANT_SERVICE_IS_DEACTIVE_MESSAGE = "Merchant service is deactive successfully";
	public static final String PARTNER_SERVICE_IS_ACTIVE_MESSAGE = "Partner active successfully";
	public static final String PARTNER_SERVICE_IS_DEACTIVE_MESSAGE = "Partner deactive successfully";;
	public static final String ACTIVE_DEACTVIE_ELSE = "Please pass Y and N in isActive parameter";
	public static final String MERCHANT_SERVICE_NOT_EXIST = "Merchant service not exist";

	public static final Character Y = 'Y';
	
	public static final String MOBILE_NUMBER_NOT_REGISTERED = "Mobile number is not registered";

	public final static String STATUS_REFUND = "Refunded";
	public final static String STATUS_SUCCESS = "Success";
	public final static String STATUS_PENDING = "Pending";
	public final static String STATUS_FAILED = "Fail";
	public final static String STATUS_REVERSED = "Reversed";
	public final static String TRANSACTION_NOT_FOUND = "Transaction Not Found";

	public final static String API_BAD_REQUEST = "BAD_REQUEST";
	public final static String API_STATUS_SUCCESS = "Success";
	public final static String API_STATUS_PENDING = "Pending";
	public final static String API_STATUS_FAILED = "Failed";
	public final static String API_STATUS_REFUND = "REFUND";

	public static final String MOBILE_NUMBER_ALREADY_REGISTERED = "Mobile number is already registered";
	public final static String DATA = "data";
	public final static String AUTH_USER_TYPE = "Auth user type added successfully";
	public final static String AUTH_USER_TYPE_NAME_ALREADY_EXIST = "user role name already exist";
	public final static String AUTH_USER_TYPE_DETAIL_ALREADY_EXIST = "user role detail already exist";

	public final static String EMAIL_NOT_ACTIVATED = "Email id is not registered";
	public final static String PHONE_NOT_ACTIVATED = "Phone Number is not registered";
	public final static String EMAIL_ALREADY_ACTIVATED = "Email id is already registered";
	public final static String PHONE_ALREADY_ACTIVATED = "Phone Number is already registered";
	public final static String DATA_NOT_FOUND = "Data Not Found";


}
