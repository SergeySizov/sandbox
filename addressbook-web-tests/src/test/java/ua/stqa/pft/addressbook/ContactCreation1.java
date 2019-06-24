package ua.stqa.pft.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactCreation1 {
    private WebDriver wd;
    // test 7


    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        wd = new FirefoxDriver();
        wd.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @Test
    public void testContactCreation1(){
        gotoContactPage("add new");
        fillTestData(new fillCreateform("TestFN", "TestMidName", "TestLast", "SSTest", "Test_Title", "QA_test1", "Kharkiv", "111", "+38099", "QA1", "testuser1@yopmail.com", "google.com", "bday", "1", "bmonth", "January", "byear", "byear", "1988"));
        save("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]");
    }

    private void save(String s) {
        wd.findElement(By.xpath(s)).click();
    }

    private void fillTestData(fillCreateform fillCreateform) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(fillCreateform.getField1());
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(fillCreateform.getField2());
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(fillCreateform.getField3());
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(fillCreateform.getField4());
        wd.findElement(By.name("title")).clear();
        wd.findElement(By.name("title")).sendKeys(fillCreateform.getField5());
        wd.findElement(By.name("company")).clear();
        wd.findElement(By.name("company")).sendKeys(fillCreateform.getField6());
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(fillCreateform.getField7());
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(fillCreateform.getField8());
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(fillCreateform.getField9());
        wd.findElement(By.name("work")).clear();
        wd.findElement(By.name("work")).sendKeys(fillCreateform.getField10());
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(fillCreateform.getField11());
        wd.findElement(By.name("homepage")).clear();
        wd.findElement(By.name("homepage")).sendKeys(fillCreateform.getField12());
        new Select(wd.findElement(By.name(fillCreateform.getField13()))).selectByVisibleText(fillCreateform.getField14());
        new Select(wd.findElement(By.name(fillCreateform.getField15()))).selectByVisibleText(fillCreateform.getField16());
        wd.findElement(By.name(fillCreateform.getField17())).clear();
        wd.findElement(By.name(fillCreateform.getField18())).sendKeys(fillCreateform.getField19());
    }

    private void gotoContactPage(String s) {
        wd.findElement(By.linkText(s)).click();
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
