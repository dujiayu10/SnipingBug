package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ModuleErectionTest extends BaseTest{
	@Test(priority = 0)
	public void test_url() {
		//进入架设栏
		webtest.click("xpath=/html/body/div[2]/a[6]");
		//进入模块架设页面
		webtest.click("xpath=/html/body/div[3]/div[6]/ul[1]/li[2]/a[1]");
		//进入frame
		webtest.enterFrame("adf_main");
		System.out.println("进入成功");
	}
	@Test(priority = 1)
	public void test_group1() {
		//获取选中条目
			webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
			webtest.type("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input", "123");
		//选择更新
		webtest.selectByValue("xpath=//select[@name='fs_do']", "upd");
		//点击执行
		webtest.click("xpath=//input[@type='submit']");
		assertEquals(webtest.getAlertTest(), "设置成功！");
		webtest.alertAccept();
	}
	@Test(priority = 2)
	public void test_group2() throws InterruptedException {
		Thread.sleep(2000);
		//获取选中条目
			webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//选择删除
		webtest.selectByValue("xpath=//select[@name='fs_do']", "del");
		//点击执行
		webtest.click("xpath=//input[@type='submit']");
		assertEquals(webtest.getAlertTest(), "删除成功");
		webtest.alertAccept();
	}
	@Test(priority = 3)
	public void test_group3() throws InterruptedException {
		Thread.sleep(2000);
		//获取选中条目
			webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//选择启用
		webtest.selectByValue("xpath=//select[@name='fs_do']", "show");
		//点击执行
		webtest.click("xpath=//input[@type='submit']");
		assertEquals(webtest.getAlertTest(), "设置成功！");
		webtest.alertAccept();
	}
	@Test(priority = 4)
	public void test_group4() throws InterruptedException {
		Thread.sleep(2000);
		//获取选中条目
//			boolean a=webtest.isChecked("xpath=/html/body/form/div/table/tbody/tr["+rnum2+"]/td[1]/input");
//			
//			if(a==false) {
				webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
//			}
		//选择禁用
		webtest.selectByValue("xpath=//select[@name='fs_do']", "stop");
		//点击执行
		webtest.click("xpath=//input[@type='submit']");
		assertEquals(webtest.getAlertTest(), "设置成功！");
		webtest.alertAccept();
	}
//	@Test(priority = 5)
//	public void test_add() {
//		//点击增加条目
//		webtest.click("xpath=/html/body/table/tbody/tr/th/a");
//	}
}
