package ua.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ua.stqa.pft.addressbook.tests.fillCreateform;

public class TestData {
    private FirefoxDriver wd;

    public TestData(FirefoxDriver wd) {
        this.wd = wd;
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
}