package com.webtest.testcases;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;

public class TestExcel {

	@Test(dataProvider = "name_pass", dataProviderClass = NSDataProvider.class)
	public void testFromArray(String f1, String f2) {
		System.out.println(f1 + "-" + f2);

	}
	
}
