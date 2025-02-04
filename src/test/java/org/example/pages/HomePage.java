package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private By zinioTitle = By.xpath("//android.widget.ImageView[@content-desc='ZINIO']");
    private By profilePageButton = By.xpath("//android.widget.FrameLayout[@content-desc='Profile']/android.widget.FrameLayout/android.widget.ImageView");
    private By searchPageButton = By.xpath("//android.widget.FrameLayout[@content-desc='Search']/android.widget.FrameLayout/android.widget.ImageView");
    private By libraryPageButton = By.xpath("//android.widget.FrameLayout[@content-desc='Library']/android.widget.FrameLayout/android.widget.ImageView");
    private By explorePageButton = By.xpath("//android.widget.FrameLayout[@content-desc='Explore']/android.widget.FrameLayout/android.widget.ImageView");

    public HomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean checkTitleInTheRightCorner(){
        try{
            return driver.findElement(zinioTitle).isDisplayed();
        } catch (Exception e){
            return false;
        }
    }
    public void peerrru() {
        System.out.println("LALALALLA");
    }

    public ProfilePage goToProfilePage() {
       doClick(profilePageButton);
        return new ProfilePage(driver); // Retorna la instancia de ProfilePage
    }

    public ExplorePage goToExplorePage() {
        doClick(explorePageButton);
        return new ExplorePage(driver); // Retorna la instancia de ProfilePage
    }
}
