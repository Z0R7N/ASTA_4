package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FormPage {

    // enter text in field
    public void enterText(String marker, String text){
        $(By.xpath("//label[contains(text(),'" + marker + "')]/following-sibling::div/input")).setValue(text);
        // for better visualization
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // click button by ID
    public void clickButton(String marker){
        $(By.id(marker)).click();
    }
}
