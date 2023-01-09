package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.app.pages.Scenario4Page;
import com.app.pages.Scenario5Page;



public class propertiesfil {

	static Properties prop =new Properties();
	public static void main(String[] args) throws IOException {
		getpropertyfile();

	}

	public static void getpropertyfile() throws IOException {
		InputStream input =new FileInputStream("C:\\Users\\Public\\reposjan2nd\\Ngtassessmentsumit2023\\src\\main\\java\\properties\\configure.properties");
		prop.load(input);
		String loginnumber =prop.getProperty("loginnum");
		String passw =prop.getProperty("pass");
		String url5=prop.getProperty("url");
		String url4=prop.getProperty("url1");
		Scenario5Page.loginnumb=loginnumber;
		Scenario5Page.password=passw;
		Scenario5Page.urlsc5=url5;
		Scenario4Page.urlsc4=url4;
		
	}
}
