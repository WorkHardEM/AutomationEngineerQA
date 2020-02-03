package selenium.waits.workingWithTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataTablesTests {

  static WebDriver driver;
  static WebDriverWait wait;

  @Test
  public void testTable() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "libs/chrome/chromedriver.exe");

    ChromeOptions options = new ChromeOptions();

    driver = new ChromeDriver(options);

//    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    driver.manage().window().maximize();

    driver.get("https://www.w3schools.com/html/html_tables.asp");

    wait = (new WebDriverWait(driver, 5));

    WebElement tableElement = driver.findElement(By.id("customers"));

    Table table = new Table(tableElement, driver);

    System.out.println("Rows numbers is: " + table.getRows().size());

//    System.out.println(table.getValueFromCell(2, 3));
//    System.out.println(table.getValueFromCell(4, 1));

    System.out.println(table.getValueFromCell(4, "Company"));

    driver.quit();


  }
}
