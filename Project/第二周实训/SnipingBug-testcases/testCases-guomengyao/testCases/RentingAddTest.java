package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;

public class RentingAddTest extends LoginTest{
	@Test(dataProvider = "rentaddfa",dataProviderClass = NSDataProvider.class)
	public void test_rentingadd_fail(String catid,String show,String title,String refname,String homenum) throws InterruptedException {
		//�����Ӫ
		webtest.click("class=atm_m1main");
		Thread.sleep(1000);
		//����������
		webtest.click("xpath=//*[text()='�������']");
		Thread.sleep(1000);
		//�����������
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='��������>>']");
		Thread.sleep(1000);
		//������Ŀ
		webtest.click("id=fm[catid]");
		webtest.click(catid);
		//��ʾ
		webtest.click("name=fm[show]");
		webtest.click(show);
		//����С��
		webtest.type("id=fm_lpid_refname", refname);
		//��Դ����
		webtest.type("id=fm[title]",title);
		//����
		webtest.type("fm[fyno]", homenum);
		//�ύ
		webtest.click("name=bsend");
		Thread.sleep(1000);
		//���ӳɹ�
		String addsuccess=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("������Ĺ淶���������ԣ�", addsuccess);
		Thread.sleep(3000);
	}
	@Test(dataProvider = "rentaddsuc",dataProviderClass = NSDataProvider.class)
	public void test_rentingadd_success(String catid,String show,String title,String refname,String homenum) throws InterruptedException {
		//�����Ӫ
		webtest.click("class=atm_m1main");
		Thread.sleep(1000);
		//����������
		webtest.click("xpath=//*[text()='�������']");
		Thread.sleep(1000);
		//�����������
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='��������>>']");
		Thread.sleep(1000);
		//������Ŀ
		webtest.click("id=fm[catid]");
		webtest.click(catid);
		Thread.sleep(1000);
		//��ʾ
		webtest.click("name=fm[show]");
		webtest.click(show);
		Thread.sleep(1000);
		//����С��
		webtest.click("name=fm[lpid_refname]");
		webtest.type("name=fm[lpid_refname]", refname);
		Thread.sleep(1000);
		//��Դ����
		webtest.type("id=fm[title]",title);
		Thread.sleep(1000);
		//����
		webtest.type("name=fm[fyno]", homenum);
		Thread.sleep(1000);
		//�ύ
		webtest.click("name=bsend");
		Thread.sleep(1000);
		//���ӳɹ�
		String addsuccess=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("���ӳɹ���", addsuccess);
		Thread.sleep(3000);
	}
}
