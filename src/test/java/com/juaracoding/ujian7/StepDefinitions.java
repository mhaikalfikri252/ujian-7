package com.juaracoding.ujian7;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class StepDefinitions extends BaseTestClass {

	@Test(priority = 1, description = "User menambahkan pengeluaran")
	public void testAddPengeluaran() {
		logger = reports.startTest("Aplikasi Finansial Record");
		pengeluaranPage.inputPengeluaran("50000", "Beli Pulsa");
		tunggu(1);
		assertEquals(pengeluaranPage.getPengeluaran(), "50.000");
	}

	@Test(priority = 2, description = "User menambahkan pemasukan")
	public void testAddPemasukan() {
		pemasukanPage.inputPemasukan("100000", "Investasi Saham");
		tunggu(1);
		assertEquals(pemasukanPage.getPemasukan(), "100.000");
	}

}
