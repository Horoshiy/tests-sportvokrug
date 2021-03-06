package tests.ui;

import config.ConfigHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SportTrendsHomePageLinksTests extends TestBase {
    @ParameterizedTest
    @ValueSource(strings = {"фигурн", "велоспорт", "легк", "кроссфит", "художественн", "воркаут", "лыжн", "конн", "акробатическ"})
    void checkSportEventsLinks(String sport) {
        final String url = ConfigHelper.getSiteHomePage();

        step("open site", () -> {
            open(url);
            $("#logo").shouldHave(text("спорт"));
        });

        step("open link", () -> {
            $x("//div[contains(@class, 'sport-type') and descendant::p[contains(text(), " + sport + ")]]").parent().click();
            $("main div").shouldHave(text(sport));
        });
    }
}
