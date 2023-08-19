package pages;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationForm {
    private final String titleText = "Student Registration Form";

    public void openPage() {
        Configuration.pageLoadStrategy = "eager";
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(titleText));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

    }

    public void setFirstName(String value) {
        $("#firstName").setValue(value);
    }
    public void setLastName(String value) {
        $("#lastName").setValue(value);
    }

    public void setEmail(String value) {
        $("#userEmail").setValue(value);
    }

    public void setGender(String value) {
        $("[for='gender-radio-" + value + "']").click();
    }
    public void setNumber(String value) {
        $("#userNumber").setValue(value);
    }

    public void setAddress(String value) {
        $("#currentAddress").setValue(value);
    }

    public void setCalendarDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day +
                ":not(.react-datepicker__day--outside-month)").click();
    }

    public void setSubjects(String value) {
        $("#subjectsInput").setValue(value).pressEnter();
    }

    public void setHobbie(String value) {
        $("[for='hobbies-checkbox-" + value + "']").click();
    }

    public void uploadFrom(String fileName) {
        $("#uploadPicture").uploadFromClasspath(fileName);
    }

    public void setLocation(String state, String city) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(state)).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText(city)).click();
    }

    public void verifyResult(Integer index, String value) {
        //$("tbody tr").$(byText(key)).ancestor("tr").shouldHave(text(value));
        $("tbody tr", index).shouldHave(text(value));
    }

}
