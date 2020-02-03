package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestClass {

  static WebDriver driver;
  static WebDriverWait wait;

  @Test
  public void testJS() throws InterruptedException, IOException {
    System.setProperty("webdriver.chrome.driver", "libs/chrome/chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    driver.manage().window().maximize();

    driver.get("https://lkwteile.autodoc.de/lastkraftwagen/mercedes-benz");

    TimeUnit.SECONDS.sleep(1);

    JavascriptExecutor jse = (JavascriptExecutor) driver;

    WebElement carName = driver.findElement(By.xpath("//select[@name='maker_id']"));

    String value = carName.getText();
    System.out.println(value);


    System.out.println("======================================");
    TimeUnit.SECONDS.sleep(4);
    value = (String) jse.executeScript("return arguments[0].selectedOptions[0].innerText", carName);
    System.out.println(value);

//    String selectedMark = (String) je.executeScript("return arguments[0].selectedOptions[0].innerText",
//            hp_base.driver.findElement(SelectorLocator));


//    driver.get("https://www.google.com.ua/imghp?hl=ru&tab=wi&ogbl");
//    driver.findElement(By.cssSelector("[aria-label='Поиск по картинке']")).click();
//    driver.findElement(By.xpath("//a[text()='Загрузить файл']")).click();
//    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Screenshots\\pic.png");




//    Date dateNow = new Date();
//    SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
//    String fileName = format.format(dateNow) + ".png";
//    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//    FileUtils.copyFile(screenshot, new File("C:\\Screenshots\\" + fileName));



    driver.quit();















//    WebElement search = driver.findElement(By.xpath("//input[@class='header-search__input']"));
//    String select = Keys.chord(Keys.CONTROL, "a");
//    String cut = Keys.chord(Keys.CONTROL, "x");
//    String paste = Keys.chord(Keys.CONTROL, "v");
//    search.sendKeys(Keys.chord("test"));
//    search.sendKeys(select);
//    search.sendKeys(cut);
//    search.sendKeys(paste);
  }









}
