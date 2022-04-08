package com.juaracoding.ujian7;

import org.testng.annotations.Test;

public class StepDefinitions extends BaseTestClass {

	@Test(priority = 1, description = "User menambahkan pengeluaran")
	public void testAddPengeluaran() {
		logger = reports.startTest("Aplikasi Finansial Record");
		tunggu(1);
//		assertEquals(contactPage.getContactName(), "Test 2");
	}

	@Test(priority = 2, description = "User menambahkan pemasukan")
	public void testAddPemasukan() {
		tunggu(1);
//		assertEquals(contactPage.getContactName(), "Test");		
	}

}
