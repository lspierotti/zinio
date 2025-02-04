package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.*;

public class PermissionPopupPage extends BasePage {

    // Usamos el ID de los botones para localizarlos en el popup
    private By allowButton = By.id("com.android.permissioncontroller:id/permission_allow_button");
    private By denyButton = By.id("com.android.permissioncontroller:id/permission_deny_button");

    public PermissionPopupPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void waitPermissionPopup() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(allowButton));  // Espera hasta que el botón de "Allow" sea visible
    }

    // Método para aceptar el popup de permisos
    public void acceptPermissions() {
        // Hacemos click en el botón "Allow"
        driver.findElement(allowButton).click();
    }

    // Método para denegar el popup de permisos
    public void denyPermissions() {
        // Hacemos click en el botón "Deny"
        driver.findElement(denyButton).click();
    }
}
