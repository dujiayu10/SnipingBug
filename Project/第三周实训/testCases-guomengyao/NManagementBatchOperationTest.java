package com.webtest.testCases;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * ����-�ʼǹ���-��������
 * 
 * 
 * */
public class NManagementBatchOperationTest extends LoginTest{
	@Test
	public void before() throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʼǹ���
		webtest.click("xpath=//*[text()='�ʼǹ���']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
	}
	@Test(dataProvider = "batchoperation",dataProviderClass = NSDataProvider.class)
	public void test_batchoperation(String number,String fsdo) throws InterruptedException {
		webtest.clicks("class=rdcb", number);
		Thread.sleep(1000);
		//ѡ����������
		webtest.selectByValue("name=fs_do", fsdo);
		Thread.sleep(2000);
		//���ִ��
		webtest.click("name=bsend");
		Thread.sleep(2000);
	}
}
