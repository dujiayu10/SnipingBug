package com.webtest.testCases;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;

public class RentingBatchOperationTest extends LoginTest{
	@Test
	public void before() throws InterruptedException {
		//点击主营
		webtest.click("class=atm_m1main");
		Thread.sleep(1000);
		//点击出租管理
		webtest.click("xpath=//*[text()='出租管理']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
	}
	@Test(dataProvider = "rentbatchoperation",dataProviderClass = NSDataProvider.class)
	public void test_batchoperation(String fsdo) throws InterruptedException {
		webtest.clicks("class=rdcb", 2);
		Thread.sleep(1000);
		//选择批量操作
		webtest.selectByValue("name=fs_do", fsdo);
		Thread.sleep(2000);
		//点击执行
		webtest.click("name=bsend");
		Thread.sleep(2000);
	}
}
