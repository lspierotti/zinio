package org.example.tests;

import io.appium.java_client.android.AndroidDriver;
import org.example.pages.*;
import org.example.utils.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WelcomePageToHomePageTest {
    private AndroidDriver driver;
    private WelcomePage welcomePage;

    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        welcomePage = new WelcomePage(driver);
    }

    @Test
    public void testToSwipeInWelcomePageAndGoToHomePage() throws InterruptedException {
        welcomePage.swipeRight(3);
        HomePage homePage = welcomePage.clickStartButton();
        boolean isTitleVisible = homePage.checkTitleInTheRightCorner();
        System.out.printf("Is Title visible: " +isTitleVisible);
    }

    @Test
    public void testGoToProfilePage() throws InterruptedException {
        welcomePage.swipeRight(3);
        HomePage homePage = welcomePage.clickStartButton();

        ProfilePage profilePage = homePage.goToProfilePage();
        profilePage.isProfileVisible();
    }

    @Test
    public void testGoToExplorePage() throws InterruptedException {
        welcomePage.swipeRight(3);
        HomePage homePage = welcomePage.clickStartButton();

        ExplorePage explorePage = homePage.goToExplorePage();
        explorePage.isExploreIconVisible();
    }


    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
