package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import javax.management.relation.Relation;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * 互动-问答回复-搜索
 * 
 * 
 * */
public class QAReplySearchTest extends LoginTest{
	@Test(priority = 1,dataProvider = "qarsearchtit",dataProviderClass = NSDataProvider.class)
	public void test_search_by_title(String title) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击问答回复
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='问答回复']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击标题
		webtest.selectByVisibleText("name=sfid","标题");
		Thread.sleep(1000);
		//输入已存在的问答回复标题
		webtest.typeAndClear("name=sfkw",title);
		//点击搜索
		webtest.click("name=sch_qarep");
		Thread.sleep(1000);
	}
	@Test(priority = 2,dataProvider = "qarsearchmname",dataProviderClass = NSDataProvider.class)
	public void test_search_by_mname(String mname) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击问答回复
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='问答回复']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击昵称
		webtest.selectByVisibleText("name=sfid","昵称");
		Thread.sleep(1000);
		//输入已存在的问答回复昵称
		webtest.typeAndClear("name=sfkw",mname);
		//点击搜索
		webtest.click("name=sch_qarep");
		Thread.sleep(1000);
	}
	@Test(priority = 3,dataProvider = "searchshow",dataProviderClass = NSDataProvider.class)
	public void test_search_by_show(String show) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击问答回复
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='问答回复']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//点击显示
		webtest.selectByVisibleText("name=show",show);
		//点击搜索
		webtest.click("name=sch_qarep");
		Thread.sleep(1000);
	}
	@Test(priority = 4,dataProvider = "searchorder",dataProviderClass = NSDataProvider.class)
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
		webtest.click("name=sch_qarep");
		Thread.sleep(1000);
	}
}
