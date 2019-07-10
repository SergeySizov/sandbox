package ua.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ua.stqa.pft.addressbook.model.GroupData;
import ua.stqa.pft.addressbook.tests.fillCreateform;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private WebDriver wd;

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    public void login(String username, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void save(String s) {
        wd.findElement(By.xpath(s)).click();
    }

    public void fillTestData(fillCreateform fillCreateform) {
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

    public void gotoContactPage(String s) {
        wd.findElement(By.linkText(s)).click();
    }

    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void rturntoGroupPage(By groups) {
        wd.findElement(groups).click();
    }

    public void submitGroupCreation(String submit) {
        wd.findElement(By.name(submit)).click();
    }

    public void fillGroupForm(GroupData groupData) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void initGroupCreation(String s) {
        wd.findElement(By.name(s)).click();
    }

    public void gotoGrouppage(By groups) {
        wd.findElement(groups).click();
    }

    public void stop() {
        wd.quit();
    }

    public boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void deleteSelectedGroups() {
        wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
