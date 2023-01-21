package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.timeutils;

public class baseamazonclass {

	
public static Properties prop= new Properties();	
	public static WebDriver driver;
	
	public baseamazonclass() {
	try {
	FileInputStream file= new FileInputStream("C:\Users\sin12\eclipse-workspace\amazon\src\test\java\enviornmentVariable\cofig.Properties");
		prop.load(file);
		
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException a) {
	a.printStackTrace();
	}}
	

@SuppressWarnings("deprecation")
public static void initiate () {
	String browsername= prop.getProperty("browser");
	if (browsername.equals("chrome")) {
		System.setProperty("WebDriver.chrome.driver", "chrome.exe");
	driver = new ChromeDriver();
	}
	else if (browsername.equals("firefox")){
		System.setProperty("WebDriver.gecko.driver","geckodriver");
	driver = new FirefoxDriver();}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(timeutils.timepage,TimeUnit.SECONDS);
	}	
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
