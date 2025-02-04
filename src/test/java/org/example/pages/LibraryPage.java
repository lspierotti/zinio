package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.example.base.BasePage;
import org.openqa.selenium.By;

public class LibraryPage extends BasePage {

    private By explorePageButton = By.xpath("//android.widget.FrameLayout[@content-desc='Explore']/android.widget.FrameLayout/android.widget.ImageView");
    private By searchPageButton = By.xpath("//android.widget.FrameLayout[@content-desc='Search']/android.widget.FrameLayout/android.widget.ImageView");

    public LibraryPage(AppiumDriver<MobileElement> driver) {
        super(driver);
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
