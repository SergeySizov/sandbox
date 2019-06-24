package ua.stqa.pft.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteGroupe {
  private WebDriver wd;

  @BeforeMethod(alwaysRun = true)
  public void setUp(){
    wd = new FirefoxDriver();
      wd.get("http://localhost/addressbook/");
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys("admin");
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys("secret");
      wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testDeleteGroupe(){
 wd.findElement(By.linkText("groups")).click();
    wd.findElement(By.name("selected[]")).click();
    wd.findElement(By.name("delete")).click();
    wd.findElement(By.linkText("group page")).click();

  }

  @AfterMethod(alwaysRun = true)
  public void tearDown(){
    wd.quit();
    }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}

