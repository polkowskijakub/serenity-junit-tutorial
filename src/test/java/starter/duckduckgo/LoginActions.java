package starter.duckduckgo;

import net.serenitybdd.core.steps.UIInteractions;

public class LoginActions extends UIInteractions {
    public void byKeyword(String keyword) {
        $("//input[@name='login']").sendKeys(keyword);
        $("//button[@type='submit']").click();
    }
}