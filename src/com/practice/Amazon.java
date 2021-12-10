package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Basic_automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inamazon&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Forder%2Fstatic-display%2Fget-legal-invoice.html%3Fie%3DUTF8%26orderId%3D406-2242439-1318708%26ref_%3Dpe_24967711_487029281_pe_194751_29698841_inv&showRmrMe=1");
        Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("poojabanka6@gmail.com" + Keys.ENTER);
		Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("Latha@04" + Keys.ENTER);
	}

}
