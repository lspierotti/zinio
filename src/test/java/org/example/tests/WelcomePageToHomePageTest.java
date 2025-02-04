package org.example.tests;

import io.appium.java_client.android.AndroidDriver;
import org.example.pages.HomePage;
import org.example.utils.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    private AndroidDriver driver;
    private HomePage loginPage;

    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        loginPage = new HomePage(driver);
    }

    @Test
    public void testLogin() {
        loginPage.login("testuser", "password123");
        // Aquí podés agregar una aserción para verificar que se hizo login
    }

    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
