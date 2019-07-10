package ua.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroupe extends TestBase {

    @Test
    public void testDeleteGroupe() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupsHelper().selectGroup();
        app.getGroupsHelper().deleteSelectedGroups();
        app.getNavigationHelper().gotoGroupPage();

    }
}

