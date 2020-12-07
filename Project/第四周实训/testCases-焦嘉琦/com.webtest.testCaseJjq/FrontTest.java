package com.webtest.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FrontTest extends BaseTest{
	@Test(priority = 0)
	public void openurl() {
		webtest.open("http://localhost:88/home.php");
		webtest.click("xpath=//*[@id=\"idf_rent\"]");
		assertTrue(webtest.isTextPresent("爱窝房产"));
	}
	@Test(priority = 1)
	public void test1() {
		//系统房源搜索
		webtest.click("xpath=//input[@id='sobtn']");
		assertTrue(webtest.isTextPresent("寿福"));
	}
	@Test(priority = 2)
	public void test2() {
		webtest.click("xpath=/html/body/div/div[3]/div[1]/ul/li[1]/div[3]/p[1]/a");
		webtest.click("xpath=/html/body/div/div[3]/div[2]/div[2]/ul/li[10]/button");
		webtest.click("xpath=//*[@id=\"fm_ntype_5\"]");
		webtest.type("xpath=/html/body/div[1]/div[6]/div/div/div[2]/form/table/tbody/tr[3]/td[2]/label[1]/input", "13932838899");
		webtest.type("xpath=/html/body/div[1]/div[6]/div/div/div[2]/form/table/tbody/tr[3]/td[2]/label[2]/input", "哈哈");
		webtest.type("xpath=//*[@id=\"fmneed_9a736eeaee60c643\"]", "11111");
		webtest.click("xpath=/html/body/div[1]/div[6]/div/div/div[3]/button[2]");
	}
	@Test(priority = 3)
	public void test3() {
		webtest.click("xpath=/html/body/div/nav/div/div[2]/ul[1]/li[3]/a");
		//冷水
		webtest.click("xpath=/html/body/div/div[3]/div[1]/div[1]/p[1]/span/a[1]");
	}
	
}
 