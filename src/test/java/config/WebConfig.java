package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${environment}.properties"
})
public interface WebConfig extends Config {
    @Key("webdriver.remote")
    String webdriverRemote();

    @Key("webdriver.video")
    String webdriverVideo();

    @Key("site.home")
    String siteHomePage();

    @Key("site.user")
    String siteUser();

    @Key("site.password")
    String sitePassword();

    @Key("api.sid")
    String apiSid();

    @Key("api.uid")
    String apiUid();

    @Key("api.url")
    String apiURL();
}
