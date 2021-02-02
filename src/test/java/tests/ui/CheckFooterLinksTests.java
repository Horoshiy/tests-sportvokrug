package tests.ui;

import config.ConfigHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class CheckFooterLinksTests extends TestBase {
    final String homePage = ConfigHelper.getSiteHomePage();

    @Test
    @DisplayName("check terms link")
    void checkTermsLinkTest() {
        step("open site", () -> {
            open(ConfigHelper.getSiteHomePage());
            $("#logo").shouldHave(text("спорт"));
        });

        step("click on terms link", () -> {
            $(by("href", "/terms/")).click();
            switchTo().window(1);
            $("#content").shouldHave(text("СОГЛАШЕНИЕ О ПРЕДОСТАВЛЕНИИ ДОСТУПА К САЙТУ"));
        });
    }

    @Test
    @DisplayName("check offer link")
    void checkOfferLinkTest() {
        step("open site", () -> {
            open(ConfigHelper.getSiteHomePage());
            $("#logo").shouldHave(text("спорт"));
        });

        step("click on offer link", () -> {
            $(by("href", "/offer/")).click();
            switchTo().window(1);
            $("#content").shouldHave(text("ДОГОВОР НА ОРГАНИЗАЦИЮ МЕРОПРИЯТИЯ"));
        });
    }

    @Test
    @DisplayName("contract agent link")
    void checkContractAgentLinkTest() {
        step("open site", () -> {
            open(ConfigHelper.getSiteHomePage());
            $("#logo").shouldHave(text("спорт"));
        });

        step("click on offer link", () -> {
            $(by("href", "/contract-agent/")).click();
            switchTo().window(1);
            $("#content").shouldHave(text("АГЕНТСКИЙ ДОГОВОР"));
        });
    }

    @Test
    @DisplayName("info link")
    void checkInfoLinkTest() {
        step("open site", () -> {
            open(ConfigHelper.getSiteHomePage());
            $("#logo").shouldHave(text("спорт"));
        });

        step("click on info link", () -> {
            $(by("href", "/info/")).click();
            switchTo().window(1);
            $("#content").shouldHave(text("Информация"));
        });
    }

    @Test
    @DisplayName("projects link")
    void checkProjectsLinkTest() {
        step("open site", () -> {
            open(ConfigHelper.getSiteHomePage());
            $("#logo").shouldHave(text("спорт"));
        });

        step("click on projects link", () -> {
            $(by("href", "/projects/")).click();
            switchTo().window(1);
            $("#content").shouldHave(text("Наши проекты"));
        });
    }

}
