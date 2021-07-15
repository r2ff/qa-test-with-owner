package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    String browser();

    @Key("version")
    String version();

    @Key("remoteWebDriver")
    boolean remoteWebDriver();

    @Key("remoteUrl")
    String remoteUrl();
}
