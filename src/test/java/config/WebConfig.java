package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/web.properties")
@Config.LoadPolicy(Config.LoadType.MERGE)
public interface WebConfig extends Config {
    @Key("web.url")
    String webUrl();

    @Key("web.browser")
    String webBrowser();
}
