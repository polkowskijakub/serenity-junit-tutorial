package starter.qasongs;

import net.serenitybdd.core.pages.PageComponent;

public class LoginResults extends PageComponent {
    public String errorMsg() {
        return find(".small").getText();
    }
}