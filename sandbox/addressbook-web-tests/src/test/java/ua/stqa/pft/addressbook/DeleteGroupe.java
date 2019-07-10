package ua.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class DeleteGroupe extends TestBase {

    @Test
    public void testDeleteGroupe() {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroups();
        gotoGroupPage();

    }
}

