package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleCalendar {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");

		WebElement automobile = dr.findElement(By.cssSelector("a#nav_automobile"));

		automobile.click();

		Select sel = new Select(dr.findElement(By.id("make")));

		// sel.selectByIndex(3);

		sel.selectByValue("Nissan");

		sel.selectByVisibleText("Renault");

		dr.findElement(By.id("engineperformance")).sendKeys("1200");

		Actions act = new Actions(dr);

		act.moveToElement(dr.findElement(By.id("opendateofmanufacturecalender"))).build().perform();

		dr.findElement(By.id("opendateofmanufacturecalender")).click();

		String targetYear = "2020";
		String targetmonth = "January";
		String targetDate = "10";

		// Current month and year
		String text = dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year = dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		System.out.println(text);
		System.out.println(year);

		while (!dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().equals("January"))
			dr.findElement(By.xpath("//a[@title='Prev']")).click();

		int rows = dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr")).size();

		System.out.println("number of rows=" + rows);

		for (int r = 1; r <= rows; r++) {
			int cols = dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[" + r + "]/td"))
					.size();

			for (int c = 1; c <= cols; c++) {
				WebElement dateText = dr.findElement(
						By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[" + r + "]/td[" + c + "]"));

				if (dateText.getText().equals(targetDate)) {
					dateText.click();

				}
			}
		}

	}

}
