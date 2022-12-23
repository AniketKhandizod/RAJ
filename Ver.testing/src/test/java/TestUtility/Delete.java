package TestUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete {
	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Map<String, Integer> ls = new HashMap<String, Integer>();
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='product']/p"));
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='product']/h4"));
		for (int i = 0; i < price.size(); i++) {

			String foodprice = price.get(i).getText().replaceAll("[^0-9]", "").trim();
			String foodname = name.get(i).getText().replaceAll("[0-9]", "").trim();
			ls.put(foodname, Integer.parseInt(foodprice));

		}

		System.out.println(ls);
		List<Integer> ls1 = new ArrayList<Integer>();
		for (Map.Entry<String, Integer> en : ls.entrySet()) {
			ls1.add(en.getValue());

		}

		Collections.sort(ls1);
		System.out.println(ls1);

		ls.entrySet().stream().filter(s -> s.getValue().equals(ls1.get(ls.size() - 1)))
				.forEach(s -> System.out.println(s.getKey()));

		driver.close();
	}

}
