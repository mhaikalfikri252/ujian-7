package com.juaracoding.ujian7.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class PemasukanPage {
	AndroidDriver<MobileElement> driver;

	public PemasukanPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}

	By btnAdd = By.id("com.chad.financialrecord:id/fabMenu");
	By btnIncome = By.id("com.chad.financialrecord:id/btnIncome");
	By btnDate = By.id("com.chad.financialrecord:id/tvDate");
	// By accessibility id
	// 09 April 2022
	By btnOkDate = By.id("android:id/button1");
	By BtnCategory = By.id("com.chad.financialrecord:id/spCategory");
	By addCategory = By.xpath("//android.widget.TextView[contains(@text, 'Investasi')]");
	By addAmount = By.id("com.chad.financialrecord:id/etAmount");
	By addNote = By.id("com.chad.financialrecord:id/etNote");
	By btnSave = By.id("com.chad.financialrecord:id/btSave");
	By textIncome = By.id("com.chad.financialrecord:id/tvIncome");

	public void inputPemasukan(String jumlah, String keterangan) {
		tunggu(2);
		driver.findElement(btnAdd).click();
		tunggu(1);
		driver.findElement(btnIncome).click();
		tunggu(1);
		driver.findElement(btnDate).click();
		tunggu(1);
		driver.findElementByAccessibilityId("08 April 2022").click();
		tunggu(1);
		driver.findElement(btnOkDate).click();
		tunggu(1);
		driver.findElement(BtnCategory).click();
		tunggu(1);
		driver.findElement(addCategory).click();
		tunggu(1);
		driver.findElement(addAmount).sendKeys(jumlah);
		tunggu(1);
		driver.findElement(addNote).sendKeys(keterangan);
		tunggu(1);
		driver.findElement(btnSave).click();
		tunggu(1);
	}

	public String getPemasukan() {
		return driver.findElement(textIncome).getText();
	}

	public void tunggu(int detik) {
		try {
			Thread.sleep(detik * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void scroll(int startX, int startY, int endX, int endY) {
		AndroidTouchAction touchAction = new AndroidTouchAction(driver);
		touchAction.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release()
				.perform();
	}
}
