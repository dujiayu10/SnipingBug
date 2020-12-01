package com.webtest.testCases;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * 互动-网站留言管理-搜索
 * 
 * 
 * */
public class MManagementSearchTest extends LoginTest{
	@Test(priority = 1,dataProvider = "mmsearchtit",dataProviderClass = NSDataProvider.class)
	public void test_search_by_title(String title) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击网站留言管理
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='网站留言管理']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击标题
		webtest.selectByVisibleText("name=sfid","标题");
		Thread.sleep(1000);
		//输入已存在的留言标题
		webtest.typeAndClear("name=sfkw",title);
		//点击搜索
		webtest.click("name=sch_gbook");
		Thread.sleep(1000);
	}
	@Test(priority = 2,dataProvider = "mmsearchtype",dataProviderClass = NSDataProvider.class)
	public void test_search_by_type(String type) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击网站留言管理
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='网站留言管理']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击昵称
		webtest.selectByVisibleText("name=sfid","类型");
		Thread.sleep(1000);
		//输入已存在的留言类型
		webtest.typeAndClear("name=sfkw",type);
		//点击搜索
		webtest.click("name=sch_gbook");
		Thread.sleep(1000);
	}
	@Test(priority = 3,dataProvider = "mmsearchmname",dataProviderClass = NSDataProvider.class)
	public void test_search_by_mname(String mname) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击问答回复
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='网站留言管理']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击昵称
		webtest.selectByVisibleText("name=sfid","昵称");
		Thread.sleep(1000);
		//输入已存在的问答回复昵称
		webtest.typeAndClear("name=sfkw",mname);
		//点击搜索
		webtest.click("name=sch_gbook");
		Thread.sleep(1000);
	}
	@Test(priority = 4,dataProvider = "searchshow",dataProviderClass = NSDataProvider.class)
	public void test_search_by_show(String show) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击网站留言管理
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='网站留言管理']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击显示
		webtest.selectByVisibleText("name=show",show);
		//点击搜索
		webtest.click("name=sch_gbook");
		Thread.sleep(1000);
	}
	@Test(priority = 5,dataProvider = "searchorder",dataProviderClass = NSDataProvider.class)
	public void test_search_by_order(String order) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击问答回复
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='问答回复']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击排序
		webtest.selectByVisibleText("name=order",order);
		//点击搜索
		webtest.click("name=sch_gbook");
		Thread.sleep(1000);
	}
}
