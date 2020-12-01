package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ModuleErectionTest extends BaseTest{
	@Test(priority = 0)
	public void test_url() {
		//���������
		webtest.click("xpath=/html/body/div[2]/a[6]");
		//����ģ�����ҳ��
		webtest.click("xpath=/html/body/div[3]/div[6]/ul[1]/li[2]/a[1]");
		//����frame
		webtest.enterFrame("adf_main");
		System.out.println("����ɹ�");
	}
	@Test(priority = 1)
	public void test_group1() {
		//��ȡѡ����Ŀ
			webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
			webtest.type("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input", "123");
		//ѡ�����
		webtest.selectByValue("xpath=//select[@name='fs_do']", "upd");
		//���ִ��
		webtest.click("xpath=//input[@type='submit']");
		assertEquals(webtest.getAlertTest(), "���óɹ���");
		webtest.alertAccept();
	}
	@Test(priority = 2)
	public void test_group2() throws InterruptedException {
		Thread.sleep(2000);
		//��ȡѡ����Ŀ
			webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//ѡ��ɾ��
		webtest.selectByValue("xpath=//select[@name='fs_do']", "del");
		//���ִ��
		webtest.click("xpath=//input[@type='submit']");
		assertEquals(webtest.getAlertTest(), "ɾ���ɹ�");
		webtest.alertAccept();
	}
	@Test(priority = 3)
	public void test_group3() throws InterruptedException {
		Thread.sleep(2000);
		//��ȡѡ����Ŀ
			webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//ѡ������
		webtest.selectByValue("xpath=//select[@name='fs_do']", "show");
		//���ִ��
		webtest.click("xpath=//input[@type='submit']");
		assertEquals(webtest.getAlertTest(), "���óɹ���");
		webtest.alertAccept();
	}
	@Test(priority = 4)
	public void test_group4() throws InterruptedException {
		Thread.sleep(2000);
		//��ȡѡ����Ŀ
//			boolean a=webtest.isChecked("xpath=/html/body/form/div/table/tbody/tr["+rnum2+"]/td[1]/input");
//			
//			if(a==false) {
				webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
//			}
		//ѡ�����
		webtest.selectByValue("xpath=//select[@name='fs_do']", "stop");
		//���ִ��
		webtest.click("xpath=//input[@type='submit']");
		assertEquals(webtest.getAlertTest(), "���óɹ���");
		webtest.alertAccept();
	}
//	@Test(priority = 5)
//	public void test_add() {
//		//���������Ŀ
//		webtest.click("xpath=/html/body/table/tbody/tr/th/a");
//	}
}
