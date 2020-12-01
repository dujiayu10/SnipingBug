package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CategoryManagementTest extends BaseTest{
	@Test(priority = 0)
	public void openurl() {
		//�򿪼���
		webtest.click("xpath=/html/body/div[2]/a[6]");
		//��������
		webtest.click("xpath=/html/body/div[3]/div[6]/ul[1]/li[5]/a[1]");
		//����frame
		webtest.enterFrame("adf_main");
		System.out.println("����ɹ�");
	}
	@Test(priority = 1)
	public void test_group1() {
		//ѡ����Ŀ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//ѡ�������ĸ
		webtest.selectByValue("xpath=//select[@name='fs_do']", "chupd");
		//���ִ��
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "���óɹ���");
	}
	@Test(priority = 2)
	public void test_group2() {
		//ѡ����Ŀ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//ѡ����ĸ����
		webtest.selectByValue("xpath=//select[@name='fs_do']", "chord");
		//���ִ��
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "����ɹ���");
	}
}
