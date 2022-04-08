package com.juaracoding.ujian7.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class PengeluaranPage {
	AndroidDriver<MobileElement> driver;

	public PengeluaranPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}

	By btnAllow = By.id("com.android.permissioncontroller:id/permission_allow_button");
	By btnBackup = By.id("android:id/button2");
	By btnAdd = By.id("com.chad.financialrecord:id/fabMenu");
	By AddDate = By.id("com.chad.financialrecord:id/tvDate");
	By BtnCategory = By.id("com.chad.financialrecord:id/spCategory");
	By addCategory = By.xpath("//android.widget.TextView[contains(@text, 'Pulsa')]");
	By AddAmount = By.id("com.chad.financialrecord:id/etAmount");
	By AddNote = By.id("com.chad.financialrecord:id/etNote");
	By btnSave = By.id("com.chad.financialrecord:id/btSave");
	By textExpense = By.id("com.chad.financialrecord:id/tvExpense");

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
