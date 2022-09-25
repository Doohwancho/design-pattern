package static_factory;

public class Main {
	public static void main(String[] args) {
		
		//case1) 커스텀 생성자 
		User user = User.createWithDefaultCountry("John", "john@domain.com");
		
		//case) 생성자 안에 로직 생성 
		User user2 = User.createWithLoggedInstantiationTime("John", "john@domain.com", "Argentina");
		
		//case3) singleton
		User user3 = User.getSingletonInstance("John", "john@domain.com", "Argentina");
	}
}
