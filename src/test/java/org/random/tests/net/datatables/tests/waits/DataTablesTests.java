package org.random.tests.net.datatables.tests.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class DataTablesTests {

  @Test
  public void implisityWaitTest() {
    System.setProperty("webdriver.chrome.driver", "libs/chrome/chromedriver.exe");

    ChromeOptions options = new ChromeOptions();
    options.setHeadless(false);

    WebDriver driver = new ChromeDriver(options);

    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

    driver.get("https://datatables.net/examples/server_side/row_details.html");

    WebElement tableExamples = driver.findElement(By.id("example"));

    List<WebElement> tableRows = tableExamples.findElements(By.cssSelector("tbody > tr[role='row']"));

    assertEquals(tableRows.size(), 10);

    Select select = new Select(driver.findElement(By.name("example_length")));
    select.selectByValue("25");

    tableRows = new WebDriverWait(driver, 10, 1000).until(
            ExpectedConditions.numberOfElementsToBe(By.cssSelector("#example tbody > tr[role='row']"), 25));

    assertEquals(tableRows.size(), 25);

  }
}
