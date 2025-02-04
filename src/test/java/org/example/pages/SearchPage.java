package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.example.base.BasePage;
import org.openqa.selenium.By;

public class SearchPage extends BasePage {

    private By libraryPageButton = By.xpath("//android.widget.FrameLayout[@content-desc='Library']/android.widget.FrameLayout/android.widget.ImageView");
    private By explorePageButton = By.xpath("//android.widget.FrameLayout[@content-desc='Explore']/android.widget.FrameLayout/android.widget.ImageView");

    public SearchPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public LibraryPage goToLibraryPage(){
        doClick(libraryPageButton);
        return new LibraryPage(driver);
    }

    public ExplorePage goToExplorePage(){
        doClick(explorePageButton);
        return new ExplorePage(driver);
    }
}
