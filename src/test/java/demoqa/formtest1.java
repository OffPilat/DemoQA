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
import pages.RegistrationForm;

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
        String FirstName = "Ivan";
        String LastName = "Ivanov";
        String Email = "ivan@mail.ru";
        String Number = "1231231231";
        String Subject1 = "Maths";
        String Subject2 = "Chemistry";
        String Adress = "Backker Str. 139";
        String Day = "30";
        String Month = "June";
        String Year = "2000";
        String FileName = "chrome_f5jD7YwmMn.png";
        String State = "NCR";
        String City = "Noida";
        String Hobbie = "1";

        new RegistrationForm().openPage();
        new RegistrationForm().setFirstName(FirstName);
        new RegistrationForm().setLastName(LastName);
        new RegistrationForm().setEmail(Email);
        new RegistrationForm().setGender("1");
        new RegistrationForm().setNumber(Number);
        new RegistrationForm().setCalendarDate(Day, Month, Year);
        new RegistrationForm().setSubjects(Subject1);
        new RegistrationForm().setSubjects(Subject2);
        new RegistrationForm().setHobbie(Hobbie);
        new RegistrationForm().uploadFrom(FileName);
        new RegistrationForm().setAddress(Adress);
        new RegistrationForm().setLocation(State, City);
        $("#submit").click();

        new RegistrationForm().verifyResult(0, FirstName);
        new RegistrationForm().verifyResult(0, LastName);
        new RegistrationForm().verifyResult(1, Email);
        new RegistrationForm().verifyResult(2, "Male");
        new RegistrationForm().verifyResult(3, Number);
        new RegistrationForm().verifyResult(4, Day + " " + Month + "," + Year);
        new RegistrationForm().verifyResult(5, Subject1 + ", " + Subject2);
        new RegistrationForm().verifyResult(6, "Sports");
        new RegistrationForm().verifyResult(7, FileName);
        new RegistrationForm().verifyResult(8, Adress);
        new RegistrationForm().verifyResult(9, State + " " + City);
    }
}
