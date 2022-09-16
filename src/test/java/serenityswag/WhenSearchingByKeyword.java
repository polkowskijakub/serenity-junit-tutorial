package serenityswag;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenSearchingByKeyword {

    @Managed(driver = "chrome", options = "headless")
    WebDriver driver;

    NavigateActions navigate;
    SearchActions search;
    SearchResultSidebar searchResultSidebar;

    @Test
    public void theKeywordShouldAppearInTheResultsSidebar()
    {
        navigate.toTheDuckDuckGoSearchPage();
        search.byKeyword("Cucumber");
        assertThat(searchResultSidebar.heading()).isEqualTo("Cucumber");
    }
}
