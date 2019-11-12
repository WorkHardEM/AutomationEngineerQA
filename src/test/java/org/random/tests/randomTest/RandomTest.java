package org.random.tests.randomTest;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RandomTest {

  static WebDriver driver;

  @Test
  void randomNumbersAreNotRepeatedTest() {

    System.setProperty("webdriver.chrome.driver", "libs/chromedriver.exe");

    driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    driver.get("https://www.random.org/");

    wait.until(
            ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("#homepage-generator iframe")));

    ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("#homepage-generator iframe"));

    driver.findElement(By.id("true-random-integer-generator-button")).click();

    wait.until(ExpectedConditions.textMatches(By.id("true-random-integer-generator-result"),
            Pattern.compile("^(?!\\s*$).+")));

    String firstRandomNumber = driver.findElement(By.id("true-random-integer-generator-result")).getText();

    assertTrue(firstRandomNumber != null);

    driver.findElement(By.id("true-random-integer-generator-button")).click();

    wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[@id='true-random-integer-generator-result']/img")));
    wait.until(ExpectedConditions.invisibilityOfElementLocated(
            By.xpath("//*[@id='true-random-integer-generator-result']/img")));

    String secondRandomNumber = driver.findElement(By.id("true-random-integer-generator-result")).getText();

    assertNotEquals(firstRandomNumber, secondRandomNumber);

  }

  @AfterAll
  static void afterAll() {
    driver.quit();
  }
}
