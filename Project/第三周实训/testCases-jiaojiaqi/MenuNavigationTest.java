package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class MenuNavigationTest extends BaseTest{
	@Test(priority = 0)
	public void openurl() {
		//�򿪼���
		webtest.click("xpath=/html/body/div[2]/a[6]");
		//�򿪲˵�����
		webtest.click("xpath=/html/body/div[3]/div[6]/ul[1]/li[6]/a");
		//����frame
		webtest.enterFrame("adf_main");
		System.out.println("����ɹ�");
	}
	@Test(priority = 1)
	public void test_add() throws InterruptedException {
		//������
		webtest.click("xpath=/html/body/table/tbody/tr/th/a[2]");
		//����frame
		webtest.enterFrame("layui-layer-iframe1");
		//����
		webtest.type("xpath=//input[@name='fm[title]']", "jjq16");
		webtest.type("xpath=//input[@name='fm[icon]']", "1234");
		webtest.type("xpath=//textarea[@name='fm[cfgs]']", "<a href=\"?admin-types\">������</a> - <a href=\"#\" target=\"_blank\">{admin.set}</a>;");
		webtest.type("xpath=//textarea[@name='fm[note]']", "��");
		//����ύ
		webtest.click("xpath=//input[@name='bsend']");
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void test_update() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/table/tbody/tr/th/a[1]");
		webtest.click("xpath=//a[@class='layui-layer-ico layui-layer-close layui-layer-close1']");
	}
}
