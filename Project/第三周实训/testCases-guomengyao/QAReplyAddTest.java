package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * ����-�ʴ�ظ�-��������
 * 
 * 
 * */
public class QAReplyAddTest extends LoginTest{
	@Test(priority = 1,dataProvider = "qaraddfa",dataProviderClass = NSDataProvider.class)
	public void test_qareplyadd_fail(String relation,String show,String title,String details,String mname) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʴ�ظ�
		webtest.click("xpath=//*[text()='�ʴ�ظ�']");
		Thread.sleep(1000);
		//�����������
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='��������>>']");
		Thread.sleep(1000);
		//���������Ϣ
		webtest.sclick("class=btn", "0");
		Thread.sleep(1000);
		//ѡ�������Ϣ
		webtest.enterFrame1("xpath=//iframe[@height='320']");
		webtest.sclick("class=rdcb", relation);
		Thread.sleep(2000);
		webtest.leaveFrame();
		//ѡ����ʾ
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//��д����
		webtest.typeAndClear("name=fm[title]",title);
		Thread.sleep(1000);
		//��������
		webtest.type("name=fm[detail]", details);
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
	@Test(priority = 2,dataProvider = "qaraddsuc",dataProviderClass = NSDataProvider.class)
	public void test_qareplyadd_success(String relation,String show,String title,String details,String mname) throws InterruptedException {
//		webtest.leaveFrame();
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʴ�ظ�
		webtest.click("xpath=//*[text()='�ʴ�ظ�']");
		Thread.sleep(1000);
		//�����������
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='��������>>']");
		Thread.sleep(1000);
		//���������Ϣ
		webtest.sclick("class=btn", "0");
		Thread.sleep(1000);
		//ѡ�������Ϣ
		webtest.enterFrame1("xpath=//iframe[@height='320']");
		webtest.sclick("class=rdcb", relation);
		Thread.sleep(2000);
		webtest.leaveFrame();
		//ѡ����ʾ
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//��д����
		webtest.typeAndClear("name=fm[title]",title);
		Thread.sleep(1000);
		//��������
		webtest.type("name=fm[detail]", details);
		Thread.sleep(1000);
		//�ǳ�
		webtest.type("name=fm[mname]", mname);
		Thread.sleep(1000);
		//�ύ
		webtest.click("name=bsend");
		Thread.sleep(1000);
		//�ж��Ƿ����ӳɹ�,��ʾ�Ժ�����һRetryΪ����ʧ��
		assertTrue(webtest.isTextPresent("�Ժ�����һRetry"));
		webtest.leaveFrame();
		Thread.sleep(3000);
	}
}
