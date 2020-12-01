package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * ����-�ʴ����-��������
 * 
 * 
 * */
public class QAManagementAddTest extends LoginTest{
	@Test(priority = 1,dataProvider = "qamaddfa",dataProviderClass = NSDataProvider.class)
	public void test_qamanagementadd_fail(String catid,String show,String title,String essence,String details) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʴ����
		webtest.click("xpath=//*[text()='�ʴ����']");
		Thread.sleep(1000);
		//�����������
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='��������>>']");
		Thread.sleep(1000);
		//ѡ��������Ŀ
		webtest.selectByVisibleText("name=fm[catid]", catid);
		Thread.sleep(1000);
		//ѡ����ʾ
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//��д����
		webtest.type("name=fm[title]",title);
		Thread.sleep(1000);
		//�Ƿ�Ӿ�
		webtest.click(essence);
		Thread.sleep(1000);
		//��������
		webtest.type("name=fm[detail]", details);
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
	@Test(priority = 2,dataProvider = "qamaddsuc",dataProviderClass = NSDataProvider.class)
	public void test_qamanagementadd_success(String catid,String show,String title,String essence,String details) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʴ����
		webtest.click("xpath=//*[text()='�ʴ����']");
		Thread.sleep(1000);
		//�����������
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='��������>>']");
		Thread.sleep(1000);
		//ѡ��������Ŀ
		webtest.selectByValue("name=fm[catid]", catid);
		Thread.sleep(1000);
		//ѡ����ʾ
		webtest.selectByValue("name=fm[show]", show);
		Thread.sleep(1000);
		//��д����
		webtest.type("name=fm[title]",title);
		Thread.sleep(1000);
		//�Ƿ�Ӿ�
		webtest.click(essence);
		Thread.sleep(1000);
		//��������
		webtest.type("name=fm[detail]", details);
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
