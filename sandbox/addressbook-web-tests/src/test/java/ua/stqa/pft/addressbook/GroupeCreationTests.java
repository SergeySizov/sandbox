package ua.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupeCreationTests extends TestBase{

    @Test
    public void testGroupeCreation(){
        gotoGrouppage(By.linkText("groups"));
        initGroupCreation("new");
        fillGroupForm(new GroupData("test 1", "test 2", "test 3"));
        submitGroupCreation("submit");
        rturntoGroupPage(By.linkText("groups"));

    }
}
