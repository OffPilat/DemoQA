package demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class formtest1 {

    @BeforeAll
    static void Config() {
        Configuration.browserSize = "1920x1080";
    }

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
        executeJavaScript("$('footer').remove()");
        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("ivan@mail.ru");
        $("[for='gender-radio-1']").click();
        $("#userNumber").setValue("1231231231");
        $("#dateOfBirthInput").click();
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").$(byText("June")).click();
        $(".react-datepicker__year-select").$(byText("2000")).click();
        $(".react-datepicker__day.react-datepicker__day--013:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("Math").pressEnter();
        $("[for='hobbies-checkbox-1']").click();
        $("[for='hobbies-checkbox-2']").click();
        $("#uploadPicture").uploadFromClasspath("chrome_f5jD7YwmMn.png");
        $("#currentAddress").setValue("Backker Str. 139");
        $("#state").click();
        $("#react-select-3-option-0").click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Noida")).click();
        $("#submit").click();
        $("tbody tr", 0).shouldHave(text("Ivan Ivanov"));
        $("tbody tr", 1).shouldHave(text("ivan@mail.ru"));
        $("tbody tr", 2).shouldHave(text("Male"));
        $("tbody tr", 3).shouldHave(text("1231231231"));
        $("tbody tr", 4).shouldHave(text("13 June,2000"));
        $("tbody tr", 5).shouldHave(text("Maths"));
        $("tbody tr", 6).shouldHave(text("Sports, Reading"));
        $("tbody tr", 7).shouldHave(text("chrome_f5jD7YwmMn.png"));
        $("tbody tr", 8).shouldHave(text("Backker Str. 139"));
        $("tbody tr", 9).shouldHave(text("NCR Noida"));
    }
}
