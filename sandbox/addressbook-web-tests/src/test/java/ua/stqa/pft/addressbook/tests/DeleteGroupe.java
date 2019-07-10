package ua.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroupe extends TestBase {

    @Test
    public void testDeleteGroupe() {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.gotoGroupPage();

    }
}

