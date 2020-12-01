package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AdministratorsTest extends BaseTest{
	@Test(priority = 0)
	public void test_openurl() {
		//�򿪼���
		webtest.click("xpath=/html/body/div[2]/a[6]");
		//�򿪹���Ա
		webtest.click("xpath=//*[@id=\"left_m3auser\"]/a[1]");
		//����frame
		webtest.enterFrame("adf_main");
		System.out.println("����ɹ�");
	}
	@Test(priority = 1)
	public void test_group1() {
		//��ȡѡ����Ŀ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//ѡ��ɾ��
		webtest.selectByValue("xpath=//select[@name='fs_do']", "del");
		//���ִ��
		webtest.click("xpath=//input[@name='bsend']");
	}
	@Test(priority = 2)
	public void test_group2() throws InterruptedException {
		Thread.sleep(2000);
		//��ȡѡ����Ŀ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//ѡ����ʾ
		webtest.selectByValue("xpath=//select[@name='fs_do']", "show");
		//���ִ��
		webtest.click("xpath=//input[@name='bsend']");
	}
	@Test(priority = 3)
	public void test_group3() throws InterruptedException {
		Thread.sleep(2000);
		//��ȡѡ����Ŀ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//ѡ������
		webtest.selectByValue("xpath=//select[@name='fs_do']", "hidden");
		//���ִ��
		webtest.click("xpath=//input[@name='bsend']");
	}
	@Test(priority = 4)
	public void test_search() {
		webtest.selectByValue("xpath=//select[@name='stype']", "supper");
		webtest.selectByValue("xpath=//select[@name='sfid']", "miuid");
		webtest.selectByValue("xpath=//select[@name='sfop']", "eq");
		webtest.type("xpath=//input[@name='sfkw']", "80893510126");
		webtest.selectByValue("xpath=//select[@name='show']", "s1");
		webtest.selectByValue("xpath=//select[@name='order']", "atime");
		webtest.click("xpath=//input[@name='sch_adminer']");
		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[2]/a"), "jjq_16");
	}
	@Test(priority = 5)
	public void test_add1() throws InterruptedException {
		webtest.click("xpath=//*[@id=\"adminer_add\"]");
		webtest.type("xpath=//input[@id='fm[upass]']", "1234567");
		webtest.selectByValue("xpath=//select[@id='fm[grade]']", "ainfo");
		webtest.selectByValue("xpath=//select[@id='fm[show]']", "1");
	}
	@Test(priority = 6)
	public void test_add2() {
		//��ϸ����
		webtest.type("xpath=//*[@id=\"fm[mname]\"]", "jjq");
		webtest.selectByValue("xpath=//*[@id=\"fm[indep]\"]", "inadm");
		webtest.type("xpath=//*[@id=\"fm[miuid]\"]", "1031409663");
		webtest.type("xpath=//*[@id=\"fm[mtel]\"]", "13932838892");
		webtest.type("xpath=//*[@id=\"fm[memail]\"]", "1031409663@qq.com");
		webtest.type("xpath=//*[@id=\"fm[maddr]\"]", "�ӱ�ʦ����ѧ");
		webtest.click("xpath=//input[@name='bsend']");
		webtest.alertAccept();
		assertEquals(webtest.getAlertTest(), "���ӳɹ���");
		
	}
}
