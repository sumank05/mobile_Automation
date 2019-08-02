package com.qait.automation.com.mobile.automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class App 
{
   WebDriver driver;
   
   public void setup() throws MalformedURLException
   {
	   DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability("BROWSER_NAME", "Chrome");
		capabilities.setCapability("VERSION", "7.0"); 
		capabilities.setCapability("deviceName","83af475548444e57");
		capabilities.setCapability("platformName","Android");
		
		capabilities.setCapability("appPackage","com.google.android.youtube");
		
		capabilities.setCapability("appActivity","com.google.android.youtube.HomeActivity"); 
		
		 driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		 
   }
   
   public void chromeLaunching()
   {
	   DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "83af475548444e57");
		
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("noReset", true);
		
  //System.setProperty("webdriver.chrome.driver","C:\\Users\\sumankumawat\\Downloads\\chromedrivernew\\chromedriver.exe");
		
		
		AppiumDriver<MobileElement> driver = null;
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
				
		
		driver.get("http://www.google.com");
		driver.get("https://hris.qainfotech.com/login.php");
		
	}
   public String getTitle()
   {
	   String title = driver.getTitle();
	   return title;
   }
   
   
	   
   }

