package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CategoryManagementTest extends BaseTest{
	@Test(priority = 0)
	public void openurl() {
		//打开架设
		webtest.click("xpath=/html/body/div[2]/a[6]");
		//打开类别管理
		webtest.click("xpath=/html/body/div[3]/div[6]/ul[1]/li[5]/a[1]");
		//进入frame
		webtest.enterFrame("adf_main");
		System.out.println("进入成功");
	}
	@Test(priority = 1)
	public void test_group1() {
		//选中条目
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//选择更新字母
		webtest.selectByValue("xpath=//select[@name='fs_do']", "chupd");
		//点击执行
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "设置成功！");
	}
	@Test(priority = 2)
	public void test_group2() {
		//选中条目
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//选择字母排序
		webtest.selectByValue("xpath=//select[@name='fs_do']", "chord");
		//点击执行
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "排序成功！");
	}
}
