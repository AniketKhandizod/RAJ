package Resources;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class AbstractComponents {

	WebDriver driver;
	
	public AbstractComponents(WebDriver driver) {
		this.driver=driver;
	}

	public void jsScript() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	}
	public void SS(WebElement E,String fileName)  {
		try {
		File file =E.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File(System.getProperty("user.dir")+"\\src\\test\\java\\ScreenShot\\"+fileName+".png"));
		}
		catch(Exception D) {
			D.getStackTrace();
		}
	}
}