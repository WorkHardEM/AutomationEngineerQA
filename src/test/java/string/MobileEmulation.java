package string;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MobileEmulation {

  static WebDriver driver;

  @Test
  public void testttt() {
    System.setProperty("webdriver.chrome.driver", "libs/chrome/chromedriver.exe");

    Map<String, String> mobileEmulation = new HashMap<String, String>();
    mobileEmulation.put("deviceName", "Galaxy S5");

    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
    driver = new ChromeDriver(chromeOptions);
    driver.manage().window().maximize();

    driver.get("https://m.autodoc.de");



  }
}
