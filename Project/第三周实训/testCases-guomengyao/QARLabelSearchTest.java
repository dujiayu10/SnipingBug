package com.webtest.testCases;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * 互动-问答回复-标签-搜索
 * 
 * 
 * */
public class QARLabelSearchTest extends LoginTest{
	@Test(priority = 1,dataProvider = "qarlsearchtit",dataProviderClass = NSDataProvider.class)
	public void test_search_by_title(String title) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击标签
		webtest.click("xpath=//*[text()='标签']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击标题
		webtest.selectByVisibleText("name=sfid","标签");
		Thread.sleep(1000);
		//输入已存在的标签标题
		webtest.typeAndClear("name=sfkw",title);
		//点击搜索
		webtest.click("name=sch_qatag");
		Thread.sleep(1000);
		webtest.leaveFrame();
	}
	@Test(priority = 2,dataProvider = "searchshow",dataProviderClass = NSDataProvider.class)
	public void test_search_by_show(String show) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击标签
		webtest.click("xpath=//*[text()='标签']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击显示
		webtest.selectByVisibleText("name=show",show);
		//点击搜索
		webtest.click("name=sch_qatag");
		Thread.sleep(1000);
		webtest.leaveFrame();
	}
	@Test(priority = 3,dataProvider = "searchorder",dataProviderClass = NSDataProvider.class)
	public void test_search_by_order(String order) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击标签
		webtest.click("xpath=//*[text()='标签']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击排序
		webtest.selectByVisibleText("name=order",order);
		//点击搜索
		webtest.click("name=sch_qatag");
		Thread.sleep(1000);
		webtest.leaveFrame();
	}
}
