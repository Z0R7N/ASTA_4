package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    // click the link from the list of tasks
    public void clickLinkOver(String text){
        $(By.xpath("//h2[text()='" + text + "']/..")).click();
    }

    // click any link
    public void clickLink(String marker){
        $(By.xpath(marker)).click();
    }

    // switch window
    public void switchWindow(int num){
        switchTo().window(num);
    }

    // switch frame
    public void switchFrame(int num){
        switchTo().frame(num);
    }
}
