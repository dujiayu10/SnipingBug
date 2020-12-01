package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * ����-�ʴ�ظ�-��ǩ-��������
 * 
 * 
 * */
public class QARLabelAddTest extends LoginTest{
	@Test(dataProvider = "qarladdfa",dataProviderClass = NSDataProvider.class)
	public void test_qarlabeladd_fail(String show,String title,String hot) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʴ�ظ�-��ǩ
		webtest.click("xpath=//*[text()='��ǩ']");
		Thread.sleep(1000);
		//�����������
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='��������>>']");
		Thread.sleep(1000);
		//ѡ����ʾ
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//��д��ǩ
		webtest.type("name=fm[title]",title);
		Thread.sleep(1000);
		//�ȶ�
		webtest.typeAndClear("name=fm[hotcnt]", hot);
		Thread.sleep(1000);
		//�ύ
		webtest.click("name=bsend");
		Thread.sleep(1000);
		//�ж��Ƿ����ӳɹ�
		String addsuccess=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("���ӳɹ���", addsuccess);
		Thread.sleep(3000);
	}
	@Test(dataProvider = "qarladdsuc",dataProviderClass = NSDataProvider.class)
	public void test_qarlabeladd_success(String show,String title,String hot) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʴ�ظ�-��ǩ
		webtest.click("xpath=//*[text()='��ǩ']");
		Thread.sleep(1000);
		//�����������
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='��������>>']");
		Thread.sleep(1000);
		//ѡ����ʾ
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//��д��ǩ
		webtest.type("name=fm[title]",title);
		Thread.sleep(1000);
		//�ȶ�
		webtest.typeAndClear("name=fm[hotcnt]", hot);
		Thread.sleep(1000);
		//�ύ
		webtest.click("name=bsend");
		Thread.sleep(1000);
		//�ж��Ƿ����ӳɹ�
		String addsuccess=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("���ӳɹ���", addsuccess);
		Thread.sleep(3000);
	}
}
