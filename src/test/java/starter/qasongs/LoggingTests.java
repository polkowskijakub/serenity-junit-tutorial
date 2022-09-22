package starter.qasongs;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class LoggingTests {

    @Managed(driver = "chrome")
    WebDriver driver;

    NavigateActions navigate;
    LoginActions login;
    LoginResults loginResults;

    @Test
    void theLoginHasWrongValue() {
        navigate.toTheDuckDuckGoSearchPage();
        login.byKeyword("aaa@wp.pl");
        assertThat(loginResults.errorMsg()).isEqualTo("Login incorrect.");
    }
}