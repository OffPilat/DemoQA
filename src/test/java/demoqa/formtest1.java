package demoqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class formtest1 {
    @Test
    void fillformtest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("test@mail.com");
        $(byText("Male")).click();
        $("#userNumber").setValue("+1920000000");
        $("#dateOfBirthInput").setValue("11 Mar 2023");
        $(".subjects-auto-complete__value-container--is-multi").setValue("New");
        $(byText("Sports")).click();
        $("#currentAddress").setValue("My New Adrress");

    }


}
