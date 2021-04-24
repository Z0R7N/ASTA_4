package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.FormPage;

public class FormPageDef {

    FormPage formPage = new FormPage();

    @Then("Enter name and family")
    public void enterNameAndFamily() {
        formPage.enterText("nazwisk", UserConfig.name);
    }

    @Then("Enter email")
    public void enterEmail() {
        formPage.enterText("Email", UserConfig.email);
    }

    @Then("Enter phone")
    public void enterPhone() {
        formPage.enterText("Nr telefonu", UserConfig.phone);
    }

    @Then("Click button Save")
    public void clickButtonSave() {
        formPage.clickButton("save-btn");
    }
}
