package com.webtest.testCases;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;

public class RentingBatchOperationTest extends LoginTest{
	@Test
	public void before() throws InterruptedException {
		//�����Ӫ
		webtest.click("class=atm_m1main");
		Thread.sleep(1000);
		//����������
		webtest.click("xpath=//*[text()='�������']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
	}
	@Test(dataProvider = "rentbatchoperation",dataProviderClass = NSDataProvider.class)
	public void test_batchoperation(String fsdo) throws InterruptedException {
		webtest.clicks("class=rdcb", 2);
		Thread.sleep(1000);
		//ѡ����������
		webtest.selectByValue("name=fs_do", fsdo);
		Thread.sleep(2000);
		//���ִ��
		webtest.click("name=bsend");
		Thread.sleep(2000);
	}
}
