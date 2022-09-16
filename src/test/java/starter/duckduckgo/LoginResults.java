package starter.duckduckgo;

import net.serenitybdd.core.pages.PageComponent;

public class LoginResults extends PageComponent {
    public String errorMsg() {
        return $("p.small").getText();
    }
}