package ExceptionHnadling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("E:\\Selenium\\Oops_Java\\src\\Properties_File\\Employee.Properties");
        prop.load(ip);
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("City"));
        System.out.println(prop.getProperty("Hobbies"));
	}
	

}
