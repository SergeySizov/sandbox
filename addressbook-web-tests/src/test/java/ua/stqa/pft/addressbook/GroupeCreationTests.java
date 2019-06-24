package ua.stqa.pft.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupeCreationTests {
    private WebDriver wd;


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
    public void testGroupeCreation(){
        gotoGrouppage(By.linkText("groups"));
        initGroupCreation("new");
        fillGroupForm(new GroupData("test 1", "test 2", "test 3"));
        submitGroupCreation("submit");
        rturntoGroupPage(By.linkText("groups"));

    }

    private void rturntoGroupPage(By groups) {
        wd.findElement(groups).click();
    }

    private void submitGroupCreation(String submit) {
        wd.findElement(By.name(submit)).click();
    }

    private void fillGroupForm(GroupData groupData) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    private void initGroupCreation(String s) {
        wd.findElement(By.name(s)).click();
    }

    private void gotoGrouppage(By groups) {
        wd.findElement(groups).click();
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
