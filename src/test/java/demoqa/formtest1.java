package demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class formtest1 {

    @Test
    void fillformtest() {
        Configuration.pageLoadStrategy = "eager";
        open("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm#");
        $("[name='firstname']").setValue("Ivan");
        $("[name='lastname']").setValue("Ivanov");
        $(("[value='Male']")).click();
        $("[value='3']").click();
        $("[type='text']", 2).setValue("13.06.1994");
        $(("[value='Automation Tester']")).click();
        $("[name='continents']").selectOption("Antartica");
        $("[name='tool']").click();
        $(("[value='Selenium IDE']")).click();
        $("[name='selenium_commands']").selectOption("WebElement Commands");
        $("[type='file']").uploadFromClasspath("ExpertVizit.xls");
       }

    @Test
    void fillformDemoQa() {
        Configuration.pageLoadStrategy = "eager";
        open("https://demoqa.com/automation-practice-form");
        $("[#firstName]").setValue("Ivan");
        $("[#lastName]").setValue("Ivanov");
        $("[#userEmail]").setValue("ivan@mail.ru");
        $("[for='gender-radio-1']").click();
        $("[#userNumber]").setValue("1231231231");
        $("[#dateOfBirthInput]").click();
        $("[aria-label='Choose Tuesday, May 9th, 2000']");
        $(".subjects-auto-complete__value-container").setValue("Math").pressEnter();
        $("[#hobbies-checkbox-1]").click();
        $("[#hobbies-checkbox-2]").click();
        $("[#uploadPicture]").uploadFromClasspath("chrome_SwvA8yCwnk.png");
        $("[#currentAddress]").setValue("Backker Str. 139");
        $("[#state]").setValue("NCR").pressEnter();
        $("[#city]").setValue("Noida").pressEnter();
        $("tbody tr", 0).shouldHave(Condition.text("Ivan Ivanov"));
        $("tbody tr", 1).shouldHave(Condition.text("ivan@mail.ru"));
        $("tbody tr", 2).shouldHave(Condition.text("Male"));
        $("tbody tr", 3).shouldHave(Condition.text("1231231231"));
        $("tbody tr", 4).shouldHave(Condition.text("9 May,2000"));
        $("tbody tr", 5).shouldHave(Condition.text("Maths"));
        $("tbody tr", 6).shouldHave(Condition.text("Reading, Music"));
        $("tbody tr", 7).shouldHave(Condition.text("chrome_f5jD7YwmMn.png"));
        $("tbody tr", 8).shouldHave(Condition.text("Backker Str. 139"));
        $("tbody tr", 9).shouldHave(Condition.text("NCR Noida"));
    }
}
