package ch15.sec04.exam03;

import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();

        properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String pass = properties.getProperty("pass");
        String admin = properties.getProperty("admin");

        System.out.println(driver);
        System.out.println(url);
        System.out.println(user);
        System.out.println(pass);
        System.out.println(admin);
    }
}
