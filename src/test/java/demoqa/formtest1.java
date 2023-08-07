package demoqa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class formtest1 {
    @Test
    void fillformtest() {
        open("https://demoqa.com/text-box");
    }
}
