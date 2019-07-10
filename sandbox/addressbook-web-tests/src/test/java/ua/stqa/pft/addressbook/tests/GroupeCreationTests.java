package ua.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ua.stqa.pft.addressbook.model.GroupData;

public class GroupeCreationTests extends TestBase {

    @Test
    public void testGroupeCreation(){
        app.getNavigationHelper().gotoGrouppage(By.linkText("groups"));
        app.getGroupsHelper().initGroupCreation("new");
        app.getGroupsHelper().fillGroupForm(new GroupData("test 1", "test 2", "test 3"));
        app.getGroupsHelper().submitGroupCreation("submit");
        app.getGroupsHelper().rturntoGroupPage(By.linkText("groups"));

    }
}
