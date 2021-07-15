package githubtest;

import com.codeborne.selenide.Configuration;
import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GithubTest {

    @Test
    void openGithubTest() {
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.version();
        if (config.remoteWebDriver()) {
            Configuration.remote = config.remoteUrl();
        }

        open("https://github.com/");





    }

}
