package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ColumnManagementTest extends BaseTest{
	@Test(priority = 0)
	public void openurl() {
		//打开架设
		webtest.click("xpath=/html/body/div[2]/a[6]");
		//打开栏目管理
		webtest.click("xpath=/html/body/div[3]/div[6]/ul[1]/li[4]/a[1]");
		//进入frame
		webtest.enterFrame("adf_main");
		System.out.println("进入成功");
	}
	@Test(priority = 1)
	public void test_group1() {
		//获得选中条目
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//更改名称
		webtest.typeAndClear("xpath=/html/body/form/div/table/tbody/tr[2]/td[3]/input", "jjq16");
		//选择操作更新
		webtest.selectByValue("xpath=//select[@name='fs_do']", "upd");
		//点击执行
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "设置成功！");
	}
	@Test(priority = 2)
	public void test_group2() {
		//获得选中条目
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//选择操作删除
		webtest.selectByValue("xpath=//select[@name='fs_do']", "del");
		//点击执行
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "删除成功！");
	}
	@Test(priority = 3)
	public void test_group3() {
		//获得选中条目
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//选择操作启用
		webtest.selectByValue("xpath=//select[@name='fs_do']", "show");
		//点击执行
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "设置成功！");
	}
	@Test(priority = 4)
	public void test_group4() {
		//获得选中条目
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//选择操作禁用
		webtest.selectByValue("xpath=//select[@name='fs_do']", "stop");
		//点击执行
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "设置成功！");
	}
	@Test(priority = 5)
	public void test_group5() {
		//获得选中条目
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//选择操作结构
		webtest.selectByValue("xpath=//select[@name='fs_do']", "frame");
		//点击执行
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "设置成功！");
	}
	@Test(priority = 6)
	public void test_group6() {
		//获得选中条目
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//选择操作非结构
		webtest.selectByValue("xpath=//select[@name='fs_do']", "nofrm");
		//点击执行
		webtest.click("xpath=//input[@name='bsend']");
		assertEquals(webtest.getText("xpath=//span[@class='cF00 left']"), "设置成功！");
	}
	@Test(priority = 7)
	public void test_add() {
		//打开增加
		webtest.click("xpath=/html/body/table/tbody/tr/th/a");
		//进入frame
		webtest.enterFrame("layui-layer-iframe1");
		//名称
		webtest.type("xpath=//input[@name='fm[title]']", "j123");
		//配置数组备注
		webtest.type("xpath=/html/body/form/div/table/tbody/tr[3]/td[2]/textarea", "a=123");
		webtest.type("xpath=/html/body/form/div/table/tbody/tr[4]/td[2]/textarea","无");	
		//提交
		webtest.click("xpath=//input[@name='bsend']");
//		assertEquals(webtest.getText("xpath=/html/body/div/table/tbody/tr/th"), "添加成功！！");
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		//关闭
		webtest.click("xpath=//a[@class='layui-layer-ico layui-layer-close layui-layer-close1']");
	}
}
