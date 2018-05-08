package com.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.utilities.TestBase;
import com.utilities.ascendingCheck;



public class SummerDressesPage extends TestBase {

	
	ascendingCheck asc = new ascendingCheck();
	
	@FindBy(id="selectProductSort")
	WebElement SortByPrices;
	
	public SummerDressesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SummerDressesSortByPrices() throws InterruptedException {	
	Select sortBy = new Select(SortByPrices);
	sortBy.selectByVisibleText("Price: Lowest first");
	Thread.sleep(3000);
}
	
	public void sortCheckPrices() {
	List<WebElement> price = driver.findElements(By.xpath("//span[@class='price product-price']"));
	List<String> prices = new ArrayList<String>();
	for (WebElement e : price) {
		prices.add(e.getText());
	}
	prices.removeAll(Arrays.asList(null, ""));
	List<String> sortedPrices = new ArrayList<String>(prices);
	sortedPrices.removeAll(Arrays.asList(null, ""));
	// sort the list
	Collections.sort(sortedPrices);
	System.out.println(prices);
	System.out.println(sortedPrices);
	asc.setFlag(sortedPrices.equals(prices));
	}
	
	public void verifyProductGrid() {
	
	boolean flag = asc.isFlag();
	System.out.println(flag);
	Assert.assertEquals(true, flag);
}
}

