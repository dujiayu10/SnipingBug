package com.webtest.testCases;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * 互动-网站留言管理-批量操作
 * 
 * 
 * */
public class MManagementBatchOperationTest extends LoginTest{
	@Test
	public void before() throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击网站留言管理
		webtest.click("xpath=//*[text()='网站留言管理']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
	}
	@Test(dataProvider = "batchoperation",dataProviderClass = NSDataProvider.class)
	public void test_batchoperation(String number,String fsdo) throws InterruptedException {
		webtest.clicks("class=rdcb", number);
		Thread.sleep(1000);
		//选择批量操作
		webtest.selectByValue("name=fs_do", fsdo);
		Thread.sleep(2000);
		//点击执行
		webtest.click("name=bsend");
		Thread.sleep(2000);
	}
}
