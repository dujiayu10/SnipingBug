package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ColumnManagementTest extends BaseTest{
	@Test(priority = 0)
	public void openurl() {
		//�򿪼���
		webtest.click("xpath=/html/body/div[2]/a[6]");
		//����Ŀ����
		webtest.click("xpath=/html/body/div[3]/div[6]/ul[1]/li[4]/a[1]");
		//����frame
		webtest.enterFrame("adf_main");
		System.out.println("����ɹ�");
	}
	@Test(priority = 1)
	public void test_group1() {
		//���ѡ����Ŀ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//��������
		webtest.typeAndClear("xpath=/html/body/form/div/table/tbody/tr[2]/td[3]/input", "jjq16");
		//ѡ���������
		webtest.selectByValue("xpath=//select[@name='fs_do']", "upd");
		//���ִ��
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "���óɹ���");
	}
	@Test(priority = 2)
	public void test_group2() {
		//���ѡ����Ŀ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//ѡ�����ɾ��
		webtest.selectByValue("xpath=//select[@name='fs_do']", "del");
		//���ִ��
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "ɾ���ɹ���");
	}
	@Test(priority = 3)
	public void test_group3() {
		//���ѡ����Ŀ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//ѡ���������
		webtest.selectByValue("xpath=//select[@name='fs_do']", "show");
		//���ִ��
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "���óɹ���");
	}
	@Test(priority = 4)
	public void test_group4() {
		//���ѡ����Ŀ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//ѡ���������
		webtest.selectByValue("xpath=//select[@name='fs_do']", "stop");
		//���ִ��
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "���óɹ���");
	}
	@Test(priority = 5)
	public void test_group5() {
		//���ѡ����Ŀ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//ѡ������ṹ
		webtest.selectByValue("xpath=//select[@name='fs_do']", "frame");
		//���ִ��
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "���óɹ���");
	}
	@Test(priority = 6)
	public void test_group6() {
		//���ѡ����Ŀ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//ѡ������ǽṹ
		webtest.selectByValue("xpath=//select[@name='fs_do']", "nofrm");
		//���ִ��
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "���óɹ���");
	}
	@Test(priority = 7)
	public void test_add() {
		//������
		webtest.click("xpath=/html/body/table/tbody/tr/th/a");
		//����frame
		webtest.enterFrame("layui-layer-iframe1");
		//����
		webtest.type("xpath=//input[@name='fm[title]']", "j123");
		//�������鱸ע
		webtest.type("xpath=/html/body/form/div/table/tbody/tr[3]/td[2]/textarea", "a=123");
		webtest.type("xpath=/html/body/form/div/table/tbody/tr[4]/td[2]/textarea","��");	
		//�ύ
		webtest.click("xpath=//input[@name='bsend']");
//		assertEquals(webtest.getText("xpath=/html/body/div/table/tbody/tr/th"), "��ӳɹ�����");
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		//�ر�
		webtest.click("xpath=//a[@class='layui-layer-ico layui-layer-close layui-layer-close1']");
	}
}
