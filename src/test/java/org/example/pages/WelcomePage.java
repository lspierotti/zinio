package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.example.base.BasePage;
import org.openqa.selenium.By;

public class WelcomePage extends BasePage {

    // Localizador del ViewPager (elemento que hace el swipe)
    private By swipeElementswipeElement = By.id("com.zinio.mobile.android.reader:id/view_pager");
    private By startButton = By.id("com.zinio.mobile.android.reader:id/btn_start");


    public WelcomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void swipeRight(int times) {
        // Obtenemos el tamaño de la pantalla
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();


        int startX = (int) (width * 0.9);  // 90% desde el borde derecho
        int endX = (int) (width * 0.1);    // 10% desde el borde izquierdo
        int startY = height / 2;           // Centro vertical de la pantalla

        for (int i = 0; i < times; i++) {
            // swipe de derecha a izquierda en la pantalla
            new TouchAction<>(driver)
                    .press(PointOption.point(startX, startY)) // Empieza desde el borde derecho
                    .moveTo(PointOption.point(endX, startY))   // Desliza hacia la izquierda
                    .release()
                    .perform();
            try {
                Thread.sleep(3000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    public HomePage clickStartButton() {
        doClick(startButton);
        PermissionPopupPage permissionPopupPage = new PermissionPopupPage(driver);
        permissionPopupPage.waitPermissionPopup();
        permissionPopupPage.acceptPermissions();
        return new HomePage(driver); // Suponiendo que la página de inicio es HomePage
    }
}
