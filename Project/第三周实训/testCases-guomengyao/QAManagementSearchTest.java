package com.webtest.testCases;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * 互动-问答管理-搜索
 * 
 * 
 * */
public class QAManagementSearchTest extends LoginTest{
	@Test(priority = 1)
	public void before() throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击问答管理
		webtest.click("xpath=//*[text()='问答管理']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
	}
	@Test(priority = 2,dataProvider = "qamsearchcol",dataProviderClass = NSDataProvider.class)
	public void test_search_by_column(String column) throws InterruptedException {
		//点击栏目
		webtest.selectByVisibleText("name=stype", column);
		Thread.sleep(1000);
		//点击搜索
		webtest.click("name=sch_faqs");
		Thread.sleep(1000);
	}
	@Test(priority = 3,dataProvider = "qamsearchtit",dataProviderClass = NSDataProvider.class)
	public void test_search_by_title(String title) throws InterruptedException {
		//点击问答管理
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='问答管理']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击标题
		webtest.selectByVisibleText("name=sfid","Title/标题");
		Thread.sleep(1000);
		//输入已存在的问答标题
		webtest.typeAndClear("name=sfkw",title);
		//点击搜索
		webtest.click("name=sch_faqs");
		Thread.sleep(1000);
	}
	@Test(priority = 4,dataProvider = "searchshow",dataProviderClass = NSDataProvider.class)
	public void test_search_by_show(String show) throws InterruptedException {
		//点击问答管理
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='问答管理']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击显示
		webtest.selectByVisibleText("name=show",show);
		//点击搜索
		webtest.click("name=sch_faqs");
		Thread.sleep(1000);
	}
	@Test(priority = 5,dataProvider = "searchorder",dataProviderClass = NSDataProvider.class)
	public void test_search_by_order(String order) throws InterruptedException {
		//点击问答管理
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='问答管理']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击排序
		webtest.selectByVisibleText("name=order",order);
		//点击搜索
		webtest.click("name=sch_faqs");
		Thread.sleep(1000);
	}
}
