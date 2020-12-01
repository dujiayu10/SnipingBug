package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DynamicManagementTest extends BaseTest{
	@Test(priority = 0)
	public void openurl() {
		//�򿪶�̬�������
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[5]/a[2]");
		//�л���frame
		webtest.enterFrame("adf_main");
		System.out.println("�򿪶�̬�������ɹ�");
	}
	@Test(priority = 1)
	public void test_delete() {
		//��ȡ���ѡȡ�ĸ���
		int rnum1=(int)(1+Math.random()*(3-1+1));
//		int all=0;
		System.out.println(rnum1);
		for(int i=0;i<rnum1;i++) {
			int rnum2=(int)(1+Math.random()*(2-1+1));
			System.out.println(rnum2);
			boolean a=webtest.isChecked("xpath=/html/body/form[2]/div/table/tbody/tr["+rnum2+"]/td[1]/input");
			if(a==false) {
				webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr["+rnum2+"]/td[1]/input");
//				all++;
			}
		}
		//��ȡ������
		webtest.selectByValue("xpath=//select[@name='fs_do']", "del");
		webtest.click("xpath=//input[@value='ִ��']");
//		assertEquals(webtest.getText("xpath=/html/body/form[1]/table/tbody/tr/th/span[1]"), all+" ����¼ɾ���ɹ���");
		System.out.println("ɾ���ɹ�");
	}
	@Test(priority = 2)
	public void test_show() {
		//��ȡ���ѡȡ�ĸ���
		int rnum1=(int)(1+Math.random()*(3-1+1));
//				int all=0;
		System.out.println(rnum1);
		for(int i=0;i<rnum1;i++) {
			int rnum2=(int)(1+Math.random()*(2-1+1));
			System.out.println(rnum2);
			boolean a=webtest.isChecked("xpath=/html/body/form[2]/div/table/tbody/tr["+rnum2+"]/td[1]/input");
			if(a==false) {
				webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr["+rnum2+"]/td[1]/input");
//						all++;
			}
		}
		//��ȡ������
		webtest.selectByValue("xpath=//select[@name='fs_do']", "show");
		webtest.click("xpath=//input[@value='ִ��']");
//				assertEquals(webtest.getText("xpath=/html/body/form[1]/table/tbody/tr/th/span[1]"), all+" ����¼��ʾ�ɹ���");
		System.out.println("��ʾ�ɹ�");
	}
	@Test(priority = 3)
	public void test_hidden() {
		//��ȡ���ѡȡ�ĸ���
		int rnum1=(int)(1+Math.random()*(5-1+1));
//				int all=0;
		System.out.println(rnum1);
		for(int i=0;i<rnum1;i++) {
			int rnum2=(int)(1+Math.random()*(10-1+1));
			System.out.println(rnum2);
			boolean a=webtest.isChecked("xpath=/html/body/form[2]/div/table/tbody/tr["+rnum2+"]/td[1]/input");
			if(a==false) {
				webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr["+rnum2+"]/td[1]/input");
//						all++;
			}
		}
		//��ȡ������
		webtest.selectByValue("xpath=//select[@name='fs_do']", "hidden");
		webtest.click("xpath=//input[@value='ִ��']");
//				assertEquals(webtest.getText("xpath=/html/body/form[1]/table/tbody/tr/th/span[1]"), all+" ����¼���سɹ���");
		System.out.println("���سɹ�");
	}
	@Test(priority = 4)
	public void test_clickadd() {
		webtest.click("xpath=//*[@id=\"hnews_add\"]");
		assertEquals(webtest.getText("xpath=/html/body/form/div/table/tbody/tr[1]/td[1]"),"������Ŀ");
	}
}
