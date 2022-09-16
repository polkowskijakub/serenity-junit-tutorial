package starter.duckduckgo;

import net.serenitybdd.core.pages.PageComponent;

public class SearchResultSidebar extends PageComponent {
    public String heading() {
        return $("#search_form_input").getText();
    }
}