package ua.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.stqa.pft.addressbook.model.GroupData;

public class GroupsHelper extends HelperBase {

    public GroupsHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returntoGroupPage() {
        click(By.name("group_name"));

    }

    public void submitGroupCreation(By locator) {
        wd.findElement(locator).click();
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

}
