package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * ����-�ʼǹ���-��������
 * 
 * 
 * */
public class NManagementAddTest extends LoginTest{
	@Test(priority = 1,dataProvider = "nmaddfa",dataProviderClass = NSDataProvider.class)
	public void test_nmanagementadd_fail(String show,String title,String type,String details,String additional,String mname) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʼǹ���
		webtest.click("xpath=//*[text()='�ʼǹ���']");
		Thread.sleep(1000);
		//�����������
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='��������>>']");
		Thread.sleep(1000);
		//ѡ����ʾ
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//��д����
		webtest.type("name=fm[title]",title);
		Thread.sleep(1000);
		//����
		webtest.click(type);
		Thread.sleep(1000);
		//��������
		webtest.type("name=fm[detail]", details);
		Thread.sleep(1000);
		//��������
		webtest.type("name=fm[reply]", additional);
		Thread.sleep(1000);
		//�ǳ�
		webtest.type("name=fm[mname]", mname);
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
	@Test(priority = 2,dataProvider = "nmaddsuc",dataProviderClass = NSDataProvider.class)
	public void test_nmanagementadd_success(String show,String title,String type,String details,String additional,String mname) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʼǹ���
		webtest.click("xpath=//*[text()='�ʼǹ���']");
		Thread.sleep(1000);
		//�����������
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='��������>>']");
		Thread.sleep(1000);
		//ѡ����ʾ
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//��д����
		webtest.type("name=fm[title]",title);
		Thread.sleep(1000);
		//����
		webtest.click(type);
		Thread.sleep(1000);
		//��������
		webtest.type("name=fm[detail]", details);
		Thread.sleep(1000);
		//��������
		webtest.type("name=fm[reply]", additional);
		Thread.sleep(1000);
		//�ǳ�
		webtest.type("name=fm[mname]", mname);
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
