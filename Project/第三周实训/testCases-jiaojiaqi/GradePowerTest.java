package com.webtest.testCases;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class GradePowerTest extends BaseTest{
	@Test(priority = 0)
	public void openurl() {
		//�򿪼���
		webtest.click("xpath=/html/body/div[2]/a[6]");
		//�򿪵ȼ�Ȩ��
		webtest.click("xpath=/html/body/div[3]/div[6]/ul[1]/li[7]/a");
		//����frame
		webtest.enterFrame("adf_main");
		System.out.println("����ɹ�");
	}
	@Test(priority = 1)
	public void test_add() {
		//����������
		webtest.click("xpath=/html/body/table/tbody/tr/th/a");
		//����frame
		webtest.enterFrame("layui-layer-iframe1");
		//����
		webtest.type("xpath=//input[@name='fm[title]']", "j����Ա");
		webtest.selectByValue("xpath=//select[@name='fm[impid]']", "supper");
		webtest.selectByValue("xpath=//select[@name='fm[defmu]']", "m1main");
		webtest.type("xpath=//textarea[@name='fm[cfgs]']","a=1");
		webtest.type("xpath=//textarea[@name='fm[note]']", "��");
		//����ύ
		webtest.click("xpath=//input[@name='bsend']");
	}
}
