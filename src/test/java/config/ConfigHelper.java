package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {
    public static String getWebRemoteDriver() {
        return System.getProperty("web.remote.driver");
    }

    public static boolean isRemoteWebDriver() {
        return System.getProperty("web.remote.driver") != null;
    }

    public static String getWebUrl() {
        return getWebConfig().webUrl();
    }

    public static String getWebBrowser() {
        return getWebConfig().webBrowser();
    }

    private static WebConfig getWebConfig() {
        return ConfigFactory.create(WebConfig.class, System.getProperties());
    }
}
