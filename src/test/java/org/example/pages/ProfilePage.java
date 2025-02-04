package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.example.base.BasePage;
import org.openqa.selenium.By;

public class ProfilePage extends BasePage {

    private By searchPageButton = By.xpath("//android.widget.FrameLayout[@content-desc='Search']/android.widget.FrameLayout/android.widget.ImageView");
    private By libraryPageButton = By.xpath("//android.widget.FrameLayout[@content-desc='Library']/android.widget.FrameLayout/android.widget.ImageView");
    private By explorePageButton = By.xpath("//android.widget.FrameLayout[@content-desc='Explore']/android.widget.FrameLayout/android.widget.ImageView");

    public ProfilePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public boolean isProfileVisible() {
        return driver.findElementByAccessibilityId("Profile Header to implement").isDisplayed();
    }

    public LibraryPage goToLibraryPage(){
        doClick(libraryPageButton);
        return new LibraryPage(driver);
    }
    public SearchPage goToSearchPage(){
        doClick(searchPageButton);
        return new SearchPage(driver);
    }
    public ExplorePage goToExplorePage(){
        doClick(explorePageButton);
        return new ExplorePage(driver);
    }
}
