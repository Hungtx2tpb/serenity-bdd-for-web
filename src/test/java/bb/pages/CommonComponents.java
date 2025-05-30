package bb.pages;

import bb.common.BasePage;
import bb.utils.DataUtils;
import bb.utils.LoggerUtil;

public class CommonComponents extends BasePage {

    public void openBrowser(String name) {
        String url;
        System.out.println("name: " + name);
        switch (name) {
            case "ALTINV":
                url = DataUtils.getValueConf("webdriver.base.url");
                break;
            case "Google":
                url = DataUtils.getValueConf("urls.gmail");
                break;
            default:
                LoggerUtil.logError("Invalid browser configuration name: " + name);
                throw new IllegalArgumentException("Invalid browser configuration name: " + name);
        }

        if (url == null || url.trim().isEmpty()) {
            LoggerUtil.logError("URL is null or empty for configuration: " + name);
            throw new RuntimeException("Failed to retrieve a valid URL for configuration: " + name);
        }
        System.out.println("url: " + url);

        try {
            openUrl(url);
//            getDriver().get(url);
            waitForAllLoadingCompleted();
            System.out.println("Opened with browser: " + DataUtils.getValueConf("webdriver.driver") + " at URL: " + url);
        } catch (Exception e) {
            LoggerUtil.logError("Failed to open browser for configuration: " + name + ". Error: " + e.getMessage());
            throw new RuntimeException("Failed to open browser: " + e.getMessage(), e);
        }
    }
}
