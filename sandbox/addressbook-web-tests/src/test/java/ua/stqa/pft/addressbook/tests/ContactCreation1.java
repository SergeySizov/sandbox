package ua.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class ContactCreation1 extends TestBase {

    @Test
    public void testContactCreation1(){
        app.gotoContactPage("add new");
        app.fillTestData(new fillCreateform("TestFN", "TestMidName", "TestLast", "SSTest", "Test_Title", "QA_test1", "Kharkiv", "111", "+38099", "QA1", "testuser1@yopmail.com", "google.com", "bday", "1", "bmonth", "January", "byear", "byear", "1988"));
        app.save("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]");
    }

}
