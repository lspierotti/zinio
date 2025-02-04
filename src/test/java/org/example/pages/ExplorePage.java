package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.example.base.BasePage;
import org.openqa.selenium.By;

public class ExplorePage extends BasePage {

    private By searchPageButton = By.xpath("//android.widget.FrameLayout[@content-desc='Search']/android.widget.FrameLayout/android.widget.ImageView");
    private By libraryPageButton = By.xpath("//android.widget.FrameLayout[@content-desc='Library']/android.widget.FrameLayout/android.widget.ImageView");
    public ExplorePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    public LibraryPage goToLibraryPage(){
        doClick(libraryPageButton);
        return new LibraryPage(driver);
    }
    public SearchPage goToSearchPage(){
        doClick(searchPageButton);
        return new SearchPage(driver);
    }

    public void isExploreIconVisible() {
        //toImplement
    }
}
