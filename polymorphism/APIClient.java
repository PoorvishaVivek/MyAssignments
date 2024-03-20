package week2.day4.polymorphism;

public class APIClient {
	String endpoint = "Hello";
	String requestbody = "Ploymorphism concept";
	String requeststatus = "successfully created";
	String test = "Testing";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient api = new APIClient();
		api.sendRequest(api.endpoint);
		api.sendRequest(api.endpoint,api.requestbody,api.requeststatus);
	}
	
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);	
	}
	
	public void sendRequest(String endpoint, String requestbody, String requeststatus) {
		System.out.println(requestbody);
		System.out.println(requeststatus);
		
		
	}
	
	

}
