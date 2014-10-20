package test.rotate.device;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
import java.net.URL;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.Augmenter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MobileRotate {
 
  public static final String USERNAME = "zaqwsx1";
  public static final String AUTOMATE_KEY = "Fs54nwmULt7BaSTosZxi";
  public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
 
  public static void main(String[] args) throws Exception {
    
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browserName", "android");
    caps.setCapability("platform", "ANDROID");
    caps.setCapability("device", "HTC One X");
    caps.setCapability("browserstack.debug", "true");
    caps.setCapability("rotatable", true);
 
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    
    WebDriver augmentedDriver = new Augmenter().augment(driver);
    ((Rotatable)augmentedDriver).rotate(ScreenOrientation.LANDSCAPE);
    
    driver.get("http://www.google.com/ncr");
    WebElement element = driver.findElement(By.name("q"));
 
    element.sendKeys("BrowserStack");
    element.submit();
 
    System.out.println(driver.getTitle());
    driver.quit();
 
  }
}