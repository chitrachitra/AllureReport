package Test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Attachment;

public class Screenshot {
	 public static WebDriver driver;
	 @Attachment(value="failure screenshot",type="image/png")
	 public static byte[] capturescreenshot() {
		 return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	 }
	

}
