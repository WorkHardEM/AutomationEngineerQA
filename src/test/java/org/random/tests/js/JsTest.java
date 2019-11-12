package org.random.tests.js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JsTest {

  @Test
  public void jsTest() {

    System.setProperty("webdriver.chrome.driver", "libs/chrome/chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.get("https://www.yahoo.com");

    JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;

    WebElement mailLink =
            (WebElement) jsExecuter.executeScript("return document.getElementById('mega-bottombar-mail')");

    WebElement logo = (WebElement) jsExecuter.executeScript("document.getElementById('uh-logo').setAttribute('class', 'display:none'); return document.getElementById('uh-logo');");

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      Thread.interrupted();
    }

    logo.click();

    driver.quit();

  }

}
