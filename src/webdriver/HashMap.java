package webdriver;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getData().get("Name"));
	}
	
	public static java.util.HashMap<String, String> getData() {
		java.util.HashMap<String, String> map = new java.util.HashMap<String, String>();
		map.put("Name", "Gourav:Vig");
		map.put("Admin", "ustaad:ustaad123");
		return map;
	}


}
