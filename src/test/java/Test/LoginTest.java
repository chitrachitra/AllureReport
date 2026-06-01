package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LoginTest {
    @Description("This login the test")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("chithu")
    @Story("valid login")
     @Feature("Login")                          
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Listeners(Mylisteners.class)
    
    public void logintest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/?utm_source=chatgpt.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

 
}

   
    }
