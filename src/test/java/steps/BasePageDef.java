package steps;

import io.cucumber.java.en.Then;
import pages.BasePage;

public class BasePageDef {

    BasePage basePage = new BasePage();

    @Then("Click link {string}")
    public void clickLink(String arg0) {
        basePage.clickLinkOver(arg0);
    }

    @Then("Click form button")
    public void clickFormButton() {
        basePage.clickLink("//button[@class='btn btn-primary btn-block js-open-window']");
    }

    @Then("Switch window {string}")
    public void switchWindow(String arg0) {
        basePage.switchWindow(Integer.parseInt(arg0));
    }


    @Then("Switch frame {string}")
    public void switchFrame(String arg0) {
        basePage.switchFrame(Integer.parseInt(arg0));
    }
}
