package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

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
		dr.findElement(By.id("dateofmanufacture")).sendKeys("02/13/2020");

		Select seat = new Select(dr.findElement(By.id("numberofseats")));
		seat.selectByValue("4");

		Select fuel = new Select(dr.findElement(By.id("fuel")));
		fuel.selectByValue("Petrol");

		dr.findElement(By.id("listprice")).sendKeys("23000");

		dr.findElement(By.id("licenseplatenumber")).sendKeys("FRA34");

		dr.findElement(By.id("annualmileage")).sendKeys("5000");

		dr.findElement(By.id("nextenterinsurantdata")).click();

		dr.findElement(By.id("firstname")).sendKeys("Apoorva");

		dr.findElement(By.id("lastname")).sendKeys("Nagaria");

		dr.findElement(By.id("birthdate")).sendKeys("09/08/1988");

		// dr.findElement(By.xpath(("//span[@class='ideal-radio'])[1]")));//this is the
		// occurance one

		System.out.println(dr.findElement(By.xpath("//label[text()='Female']/input")).isSelected());

		// Street Address
		dr.findElement(By.id("streetaddress")).sendKeys("viman nagar");

		// Country
		Select cnt = new Select(dr.findElement(By.id("country")));
		cnt.selectByValue("India");

		// ZipCode
		dr.findElement(By.id("zipcode")).sendKeys("97006");

		// City
		dr.findElement(By.id("city")).sendKeys("Pune");

		// Occupation
		Select oc = new Select(dr.findElement(By.id("occupation")));
		oc.selectByIndex(1);
		
		dr.findElement(By.id("website")).sendKeys("motorbike.com");

		// by using 2 element method
		dr.findElement(By.xpath("//label[text()='Female']/span")).click();
		System.out.println(dr.findElement(By.xpath("//label[text()='Female']/input")).isSelected());

		dr.findElement(By.xpath("//label[contains(.,'Bungee')]/span")).click();

	}

}
