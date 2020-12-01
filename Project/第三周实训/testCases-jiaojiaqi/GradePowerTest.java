package com.webtest.testCases;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class GradePowerTest extends BaseTest{
	@Test(priority = 0)
	public void openurl() {
		//打开架设
		webtest.click("xpath=/html/body/div[2]/a[6]");
		//打开等级权限
		webtest.click("xpath=/html/body/div[3]/div[6]/ul[1]/li[7]/a");
		//进入frame
		webtest.enterFrame("adf_main");
		System.out.println("进入成功");
	}
	@Test(priority = 1)
	public void test_add() {
		//打开增加资料
		webtest.click("xpath=/html/body/table/tbody/tr/th/a");
		//进入frame
		webtest.enterFrame("layui-layer-iframe1");
		//输入
		webtest.type("xpath=//input[@name='fm[title]']", "j管理员");
		webtest.selectByValue("xpath=//select[@name='fm[impid]']", "supper");
		webtest.selectByValue("xpath=//select[@name='fm[defmu]']", "m1main");
		webtest.type("xpath=//textarea[@name='fm[cfgs]']","a=1");
		webtest.type("xpath=//textarea[@name='fm[note]']", "无");
		//点击提交
		webtest.click("xpath=//input[@name='bsend']");
	}
}
