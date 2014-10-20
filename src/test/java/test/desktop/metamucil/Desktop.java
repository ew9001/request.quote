package test.desktop.metamucil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Desktop {
	private static WebDriver driver;
	 
	 public static final String USERNAME = "zaqwsx1";
	  public static final String AUTOMATE_KEY = "Fs54nwmULt7BaSTosZxi";
	  public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	 
	 
	  public String browser_type;
	  public String fail,error,url,rotate;
	  public String baseUrl = "http://stage.coffee-mate.com";
		
		static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	    int counter=1;
		String local=(new java.io.File("").getAbsolutePath());
		String data="" + local + "/" + "metawellness.csv";	
		String data2="" + local + "/" + "metawellness.csv";	
		String myTitle;
		String csvFileToRead;
	    String safe = "http://10.10.10.34:8080/job/TESTNG3/ws/PageLoads";
	  @Test(groups = {"create"})
		@Parameters({"browser"})
	  @BeforeClass
	  public void beforeClass(String browser) throws IOException, InterruptedException
	  {	   
		  
		  
		  if (browser.equals("mobileGalaxyS3")) {
			  driver=mobileGalaxyS3();
			  csvFileToRead = data;
			  
			}
		  

		  else if (browser.equals("mobileLGnexus4")) {
			  driver=mobileLGNexus4();
			  csvFileToRead = data2;
			  System.out.println("Data is  " +data2);
			}
		  else if (browser.equals("tabletKindleFire2")) {
			  driver=  tabletKindleFire2();
			  csvFileToRead = data2;
			  System.out.println("Data is  " +data2);
			}
		  
		  else if (browser.equals("tabletKindleFireHD")) {
			  driver=  tabletKindleFireHD();
			  csvFileToRead = data2;
			  System.out.println("Data is  " +data2);
			}
		  
		  else if (browser.equals("tabletGoogleNexus")) {
			  driver=  tabletGoogleNexus();
			  csvFileToRead = data2;
			  System.out.println("Data is  " +data2);
			}
		  
		
		  
		  else if (browser.equals("mobileRazor")) {
			  driver=mobileRazor();
			  csvFileToRead = data2;
			  System.out.println("Data is  " +data2);
			}
		  
		  else if (browser.equals("tabletSamsungGalaxyNote")) {
			  driver=tabletSamsungGalaxyNote();
			  csvFileToRead = data;
			  System.out.println("Data is  " +data);
			}
		  
		  else if (browser.equals("mobileRazorHD")) {
			  driver=mobileRazorHD();
			  csvFileToRead = data2;
			  System.out.println("Data is  " +data2);
			}
		  
		  else if (browser.equals("mobileXperia")) {
			  driver=mobileXperia();
			  csvFileToRead = data2;
			  System.out.println("Data is  " +data2);
			}
		  
		  else if (browser.equals("mobileiPhone5S")) {
			  driver=mobileiPhone5S();
			   csvFileToRead = data;
			}
		  
		  else if (browser.equals("mobileiPhone5")) {
			  driver=mobileiPhone5();
			   csvFileToRead = data;
			}
		  
		  else if (browser.equals("mobileiPhone5C")) {
			  driver=mobileiPhone5C();
			   csvFileToRead = data;
			}
		  
		  else if (browser.equals("mobileHTCOneX")) {
			  driver=mobileHTCOneX();
			   csvFileToRead = data;
			}
		  
		  else if (browser.equals("mobileiPhone4S")) {
			  driver=mobileiPhone4S();
			  csvFileToRead = data;
			}
		  
		  else if (browser.equals("mobileHTCEveo3d")) {
			  driver=mobileHTCEveo3d();
			  csvFileToRead = data;
			}
		  
		  else if (browser.equals("mobileGalaxyNote2")) {
			  driver=mobileGalaxyNote2();
			  csvFileToRead = data;
			}
		  
		  else if (browser.equals("mobileGalaxyNexus")) {
			  driver=mobileGalaxyNexus();
			  csvFileToRead = data;
			}
		  else if (browser.equals("mobileAtrixHD")) {
			  driver=mobileAtrixHD();
			  csvFileToRead = data;
			}
		  
		  else if (browser.equals("safari")) {
			  driver=browserSafari();
			  csvFileToRead = data2;
			}
		  
		  else if (browser.equals("browserIE9")) {
			  driver=browserIE9();
			   csvFileToRead = data2;
			}
		  
		  else if (browser.equals("browserIE7")) {
			  driver=browserIE7();
			   csvFileToRead = data2;
			}
		  
		  else if (browser.equals("browserie10")) {
			  driver=browserie10();
			   csvFileToRead = data2;
			}
		  else if (browser.equals("browserie8")) {
			  driver=browserie8();
			   csvFileToRead = data2;
			}
		  

		  else if (browser.equals("iPad")) {
			  driver=browserIpad();
			}
		  else if (browser.equals("browserFirefox")) {
			  driver=browserFirefox();
			  csvFileToRead = data2;
			}
		  
		  else if (browser.equals("Android")) {
			  driver=browserAndroid();
			}
		  
		  else if (browser.equals(" tabletIpadRetina")) {
			  driver= tabletIpadRetina();
			}
		  
		  else if (browser.equals("tabletIpadAir")) {
			  driver=tabletIpadAir();
			}
		  
		  else if (browser.equals("tabletIpad4thGen7")) {
			  driver=tabletIpad4thGen7();
			}
		  
		  String name=""+ browser+"/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture.png";
		 
			  System.out.println("Let me see which one get tested " +browser);
			  System.out.println("Image Name " +name);

			  
		 
		  System.out.println("Let me run get driver "+driver);
		  fail=""+ browser+"/Failed/" + timeStamp + "_" + "contact_us.png";
			 
		  
		  
		 
		    BufferedReader br =null;
		    String line="";
		    String ext = "png";
		    File dir = new File("/users/agolubev1/Desktop/RondAndroid");
		
		    int lineNumber = 0;

		    br = new BufferedReader(new FileReader(csvFileToRead));  
		    
		    while ((line = br.readLine()) != null) {
		  	  
		        System.out.println("The URL is " + counter);
		        String [] nextLine = line.split(",");
		        // nextLine[] is an array of values from the line
		        System.out.println(nextLine[lineNumber]);
		        url=nextLine[lineNumber];
		        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		        System.out.println("The URL is " + url);	
		        System.out.println("Image Name " +name);
		        driver.get(url);
		       // for (int second = 0;; second++) {
			    //	if (second >= 60);
			    	//try { if ("© 2014 Procter & Gamble".equals(driver.findElement(By.cssSelector("div.copyRights > div.text.mode1 > div")).getText())) break; } catch (Exception e) {}
			    	//Thread.sleep(1000);
			    //} changed
		        
		       

		        name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture-portrait.png";
		        takeScreenPortrait(name);
		        System.out.println("Image Name " +name);
		       
		        takeScreenPortrait(name);
		        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		       
		        
		        if (browser.equals("mobileiPhone5S")||browser.equals("mobileiPhone4S")||browser.equals("mobileiPhone5")||browser.equals("mobileiPhone5C")||browser.equals("tabletKindleFire2")||browser.equals("tabletKindleFireHD"))
		        {
		        	JavascriptExecutor jse = (JavascriptExecutor)driver;
		        jse.executeScript("scroll(0, 14700)"); //y value '250' can be altered
		        	   driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		        	 name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "Successful-Scrolled-Capture.png";
				        System.out.println("Image Name " +name);
				        takeScreenPortrait(name);
		        }
		        counter+=1;
		    

		      }
	
		 
	    	 driver.quit();   
		
	  }
	  @BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("Let me run beforeTest");
	  }  
	  @Test
	  public void f()
	  {
	       //your test code here
		  System.out.println("I'm out here print f");
	  }
	 @AfterTest
	 public void afterTest()
	 {
	 }
	 @AfterClass
	 public void afterClass()
	 {
	     driver.quit();
	 }

	 public WebDriver mobileGalaxyS3() throws MalformedURLException  
	 {  
	  
		 System.out.println("Let me run mobileGalaxyS3");
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Samsung Galaxy S III");
		 caps.setCapability("browserstack.debug", "true");
		 caps.setCapability("browserstack.local", "true");
		 caps.setCapability("rotatable", true);
		 caps.setCapability("deviceOrientation", "landscape");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run mobileGalaxyS3");
	      browser_type="mobileGalaxyS3";
	      System.out.println("Let me see which one get tested" +browser_type);
	      System.out.println("Let me see which one get tested" +driver);
	      driver.get("http://m.crest.com");
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      System.out.println(data);
	      return driver;
	   
	    
	      
	 }  
	


	 public WebDriver mobileXperia() throws MalformedURLException  
	 {  
	  
		 browser_type="mobileXperia";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Sony Xperia Tipo");
		 caps.setCapability("browserstack.debug", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run Chrome");
	      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
	      
	      return driver;
	 }
	 
	 public WebDriver  mobileHTCOneX() throws MalformedURLException  
	 {  
	  
		 browser_type=" mobileHTCOneX";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "HTC One X");
		 caps.setCapability("browserstack.debug", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run mobileHTCOneX");
	      driver.get("http://google.com");
	      
	      return driver;
	 }
	 
	 public WebDriver mobileRazor() throws MalformedURLException  
	 {  
	  
		 browser_type="mobileRazor";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Motorola Razr Maxx HD");
		 caps.setCapability("browserstack.debug", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run mobileRazor");
	      driver.get("http://m.yahoo.com");
	      
	      return driver;
	 }
	 
	 public WebDriver tabletKindleFire2() throws MalformedURLException  
	 {  
	  
		 browser_type="tabletKindleFire2";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Amazon Kindle Fire 2");
		 caps.setCapability("browserstack.debug", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run tabletKindleFire2");
	      driver.get("http://m.yahoo.com");
	      
	      return driver;
	 }
	 
	 public WebDriver tabletGoogleNexus() throws MalformedURLException  
	 {  
	  
		 browser_type="tabletGoogleNexus";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Google Nexus 7");
		 caps.setCapability("browserstack.debug", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run tabletGoogleNexus");
	      driver.get("http://m.yahoo.com");
	      
	      return driver;
	 }
	 
	 public WebDriver tabletIpadAir() throws MalformedURLException  
	 {  
	  
		 browser_type="tabletIpadAir";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "iPad");
		 caps.setCapability("platform", "MAC");
		 caps.setCapability("device", "iPad Air");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run tabletIpadAir");
	    
	      
	      return driver;
	 }
	 
	 public WebDriver tabletIpadRetina() throws MalformedURLException  
	 {  
	  
		 browser_type="tabletGoogleNexus";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "iPad");
		 caps.setCapability("platform", "MAC");
		 caps.setCapability("device", "iPad mini Retina");
		 caps.setCapability("browserstack.debug", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run tabletIpadRetina");
	   
	      return driver;
	 }
	 
	 public WebDriver tabletIpad4thGen7() throws MalformedURLException  
	 {  
	  
		 browser_type="tabletIpad4thGen7";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "iPad");
		 caps.setCapability("platform", "MAC");
		 caps.setCapability("device", "iPad 4th Gen");
		 caps.setCapability("browserstack.debug", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run in tablet Ipad4thGen7");
	     
	      
	      
	      return driver;
	 }
	 public WebDriver tabletKindleFireHD() throws MalformedURLException  
	 {  
	  
		 browser_type="tabletKindleFireHD";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Amazon Kindle Fire HD 8.9");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run tabletKindleFireHD");
	      driver.get("http://m.yahoo.com");
	      
	      return driver;
	 }
	 
	 public WebDriver tabletSamsungGalaxyNote() throws MalformedURLException  
	 {  
	  
		 browser_type="tabletSamsungGalaxyNote10";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Samsung Galaxy Note 10.1");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run tabletKindleFireHD");
	     
	      
	      return driver;
	 }
	 
	 public WebDriver mobileAtrixHD() throws MalformedURLException  
	 {  
	  
		 browser_type="mobileAtrixHD";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Motorola Atrix HD");
		 caps.setCapability("browserstack.debug", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run mobile AtrixHD");
	     
	      return driver;
	 }
	 
	 public WebDriver mobileRazorHD() throws MalformedURLException  
	 {  
	  
		 browser_type="mobileRazor";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Motorola Razr Maxx HD");
		 caps.setCapability("browserstack.debug", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run mobileRazorHD");
	     
	      
	      return driver;
	 }
	 
	 public WebDriver mobileGalaxyNote2() throws MalformedURLException  
	 {  
	  
		 browser_type="GalaxyNote2";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Samsung Galaxy Note II");
		 caps.setCapability("browserstack.debug", "true");
		 caps.setCapability("browserstack.local", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run GalaxyNote 2");
	     
	      
	      return driver;
	 }
	 
	 public WebDriver browserFirefox() throws MalformedURLException  
	 {  
	  
		 browser_type="firefox";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "Firefox");
		 caps.setCapability("browser_version", "30.0");
		 caps.setCapability("os", "OS X");
		 caps.setCapability("os_version", "Mountain Lion");
		 caps.setCapability("resolution", "1024x768");
		 caps.setCapability("browserstack.local", "true");
		 caps.setCapability("acceptSslCerts", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run Firefox");
	      driver.get("http://google.com");
	      
	      return driver;
	 }
	 public WebDriver mobileiPhone4S() throws MalformedURLException  
	 {  
	  
		 browser_type="iPhone4S";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities  iPhoneCaps = new DesiredCapabilities();
		
		
		 
		 iPhoneCaps.setCapability("browserName", "iPhone");
		 iPhoneCaps.setCapability("platform", "MAC");
		 iPhoneCaps.setCapability("device", "iPhone 4S");
		 iPhoneCaps.setCapability("browserstack.debug", "true");
		// iPhoneCaps.setCapability("rotatable", true);
		 iPhoneCaps.setCapability("deviceOrientation","landscape");
		 


		 
		    driver = new RemoteWebDriver(new URL(URL),  iPhoneCaps);
		    
	      System.out.println("Let me run iPhone 4S");
	     

	      driver.get("http://yandex.com");
	      
	      
	      return driver;
	 }
	 public WebDriver mobileiPhone5S() throws MalformedURLException  
	 {  
	  
		 browser_type="iPhone5S";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities iPhoneCaps = DesiredCapabilities.iphone();
		 iPhoneCaps.setCapability("browserName", "iPhone");
		 iPhoneCaps.setCapability("platform", "MAC");
		 iPhoneCaps.setCapability("device", "iPhone 5S");
		 iPhoneCaps.setCapability("browserstack.debug", "true");
		 iPhoneCaps.setCapability("rotatable", true);
		 iPhoneCaps.setCapability("deviceOrientation","landscape");
		
		    driver = new RemoteWebDriver(new URL(URL), iPhoneCaps);
		    
	      System.out.println("Let me run iPhone 5S");
	    
	      
	      
	      return driver;
	 }
	 public WebDriver mobileiPhone5() throws MalformedURLException  
	 {  
	  
		 browser_type="iPhone5";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities iPhoneCaps = DesiredCapabilities.iphone();
		 iPhoneCaps.setCapability("browserName", "iPhone");
		 iPhoneCaps.setCapability("platform", "MAC");
		 iPhoneCaps.setCapability("device", "iPhone 5");
		 iPhoneCaps.setCapability("browserstack.debug", "true");
		 iPhoneCaps.setCapability("rotatable", true);
		 iPhoneCaps.setCapability("deviceOrientation","landscape");
		
		    driver = new RemoteWebDriver(new URL(URL), iPhoneCaps);
		    
	      System.out.println("Let me run iPhone 5");
	      
	      
	      
	      return driver;
	 }
	 
	 public WebDriver mobileiPhone5C() throws MalformedURLException  
	 {  
	  
		 browser_type="mobileiPhone5C";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities iPhoneCaps = DesiredCapabilities.iphone();
		 iPhoneCaps.setCapability("browserName", "iPhone");
		 iPhoneCaps.setCapability("platform", "MAC");
		 iPhoneCaps.setCapability("device", "iPhone 5C");
		 iPhoneCaps.setCapability("browserstack.debug", "true");
		 iPhoneCaps.setCapability("rotatable", true);
		 iPhoneCaps.setCapability("deviceOrientation","landscape");
		
		    driver = new RemoteWebDriver(new URL(URL), iPhoneCaps);
		    
	      System.out.println("Let me run iPhone 5C");
	    
	      
	      return driver;
	 }
	 
	 public WebDriver mobileLGNexus4() throws MalformedURLException  
	 {  
	  
		 browser_type="LG Nexus 4";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities iPhoneCaps = DesiredCapabilities.iphone();
		 iPhoneCaps.setCapability("browserName", "android");
		 iPhoneCaps.setCapability("platform", "ANDROID");
		 iPhoneCaps.setCapability("device", "LG Nexus 4");
		 iPhoneCaps.setCapability("deviceOrientation","landscape");
		 iPhoneCaps.setCapability("browserstack.debug", "true");
		 iPhoneCaps.setCapability("browserstack.local", "true");
		    driver = new RemoteWebDriver(new URL(URL), iPhoneCaps);
		    
	      System.out.println("Let me run LG Nexus 4");
	      driver.get("http://m.uat.metawellness.pgsitecore.com");

	      
	      
	      
	      return driver;
	 }
	 
	 public WebDriver mobileGalaxyNexus() throws MalformedURLException  
	 {  
	  
		 browser_type="LG Nexus 4";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = DesiredCapabilities.iphone();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Samsung Galaxy Nexus");
		 caps.setCapability("browserstack.debug", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
		    
	      System.out.println("Let me run mobileGalaxyNexus");
	 

	      driver.get("http://m.espn.com");
	      
	      
	      return driver;
	 }
	 
	 public WebDriver mobileHTCEveo3d() throws MalformedURLException  
	 {  
	  
		 browser_type="mobileHTCEveo3d";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = DesiredCapabilities.iphone();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "HTC Evo 3D");
		 caps.setCapability("browserstack.debug", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
		    
	      System.out.println("Let me run HTC Eveo 3D");
	      driver.get("http://m.crest.com");

	      driver.get("http://yandex.com");
	      
	      
	      return driver;
	 }
	 
	 public WebDriver browserSafari() throws MalformedURLException  
	 {  
	  
		 browser_type="safari";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "Safari");
		 caps.setCapability("browser_version", "6.0");
		 caps.setCapability("os", "OS X");
		 caps.setCapability("os_version", "Lion");
		 caps.setCapability("resolution", "1024x768");
		 caps.setCapability("acceptSslCerts", "true");
		 
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run Safari");
	      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
	      
	      return driver;
	   
	    
	 }
	 
	 
	    
	    

	 
	 public WebDriver browserIE9() throws MalformedURLException  
	 {  
	  
		
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "IE");
		 caps.setCapability("browser_version", "9.0");
		 caps.setCapability("os", "Windows");
		 caps.setCapability("os_version", "7");
		 caps.setCapability("resolution", "1024x768");
		 caps.setCapability("browserstack.local", "true");
		 caps.setCapability("acceptSslCerts", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run IE9");
	      driver.get("http://google.com");
	      
	      return driver;
	   
	    
	 }
	 
	 public WebDriver browserIE7() throws MalformedURLException  
	 {  
	  
		
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "IE");
		 caps.setCapability("browser_version", "7.0");
		 caps.setCapability("os", "Windows");
		 caps.setCapability("os_version", "XP");
		 caps.setCapability("resolution", "1024x768");
		 caps.setCapability("browserstack.local", "true");
		 caps.setCapability("acceptSslCerts", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run IE7");
	      driver.get("http://google.com");
	      
	      return driver;
	   
	    
	 }
	 
	 public WebDriver browserie10() throws MalformedURLException  
	 {  
	  
		
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "IE");
		 caps.setCapability("browser_version", "10.0");
		 caps.setCapability("os", "Windows");
		 caps.setCapability("os_version", "7");
		 caps.setCapability("resolution", "1024x768");
		 caps.setCapability("browserstack.local", "true");
		 caps.setCapability("acceptSslCerts", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run IE10");
	      driver.get("http://google.com");
	      
	      return driver;
	   
	    
	 }
	 
	 public WebDriver browserie8() throws MalformedURLException  
	 {  
	  
		
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "IE");
		 caps.setCapability("browser_version", "8.0");
		 caps.setCapability("os", "Windows");
		 caps.setCapability("os_version", "7");
		 caps.setCapability("resolution", "1024x768");  
		 caps.setCapability("browserstack.local", "true");
		 caps.setCapability("acceptSslCerts", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run IE8");
	      driver.get("http://google.com");
	      
	      return driver;
	   
	    
	 }
	 
	 public WebDriver browserIpad() throws MalformedURLException  
	 {  
	  

		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "iPad");
		 caps.setCapability("platform", "MAC");
		 caps.setCapability("device", "iPad 3rd (7.0)");

		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run Ipad");
	      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
	      
	      return driver;
	   
	    
	 }
	 
	 public WebDriver browserAndroid() throws MalformedURLException  
	 {  
	  
		
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Samsung Galaxy Note 10.1");

		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run Android");
	      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
	      
	      return driver;
	   
	    
	 }

	 
	 public WebDriver takeScreenLandscape(String name) throws IOException
	 {
		
		 WebDriver augmentedDriver = new Augmenter().augment(driver);
		  System.out.println("Let me Rotate ");
		((Rotatable)augmentedDriver).rotate(ScreenOrientation.LANDSCAPE);
	     System.out.println("Let me take a screenshot " +name);
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     System.out.println("I want to rotate");
	    
		    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		  
		    myTitle = driver.getTitle();
		    
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    FileUtils.copyFile(screenshot, new File(name));
		    
		    return driver;
	 }
	 public WebDriver takeScreenPortrait(String name) throws IOException
	 {
		
		 WebDriver augmentedDriver = new Augmenter().augment(driver);
		 // System.out.println("Let me Rotate ");
		//((Rotatable)augmentedDriver).rotate(ScreenOrientation.PORTRAIT);
	     System.out.println("Let me take a screenshot " +name);
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   //  System.out.println("I want to rotate");
	    
		    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		  
		    myTitle = driver.getTitle();
		    
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    FileUtils.copyFile(screenshot, new File(name));
		    
		    return driver;
	 }
	
	 
	 
	 @AfterMethod(alwaysRun = true, description = "take screenshot on fails") 
	 public void afterMethod_takeScreenshot(ITestResult result) throws Exception { 
	 if (!result.isSuccess()) { 
		 

		 WebDriver augmentedDriver = new Augmenter().augment(driver);
	     System.out.println("I found a bug placed a screen shot @ ContactUS");
		  
		    	
		    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);

		   
		    FileUtils.copyFile(screenshot, new File(fail));
	
	 } 
	 }

}
