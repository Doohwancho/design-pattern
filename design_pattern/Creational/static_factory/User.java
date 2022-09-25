package static_factory;

import java.lang.System.Logger.Level;
import java.time.LocalTime;

public class User {
    
    private final String name;
    private final String email;
    private final String country;
    
    public User(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }
    
    //case1) default param constructor with clear name
    public static User createWithDefaultCountry(String name, String email) {
        return new User(name, email, "Argentina");
    }
    
    //case2) login inside constructor
    public static User createWithLoggedInstantiationTime(String name, String email, String country) {
    	System.out.println("Creating User instance at : " + LocalTime.now());
        return new User(name, email, country);
    }
    
    
    //case3) singleton 
    private static volatile User instance = null;
    
    public static User getSingletonInstance(String name, String email, String country) {
        if (instance == null) {
            synchronized (User.class) {
                if (instance == null) {
                    instance = new User(name, email, country);
                }
            }
        }
        return instance;
    }
}

