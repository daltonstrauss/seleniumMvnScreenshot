package com.github.yev.mocks;

import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 3/6/16.
 */
public class NoInheritancePublicMethod {
    public WebDriver getWebDriver(){
        return new MockWebDriver();
    }
}
