package com.webtest.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class NewsTest extends BaseTest {

	@Test(priority = 0)
	public void test_news() throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		webtest.click("id=idf_news");
		webtest.isTextPresent("Catalog/类别");
	}

	@Test(priority=1)
	public void test_catalog() {
		for(int i=0;i<3;i++) {
			webtest.clicks("class=type",i);
		}
	}
	
	@Test(priority = 2,dataProvider = "news_search_select", dataProviderClass = NSDataProvider.class)
	public void test_search_select(String s1) {
		webtest.selectByVisibleText("xpath=//div[@class='panel-body']/form/select", s1);
		webtest.click("id=sobtn");
	}
	
	@Test(priority = 3,dataProvider = "news_search_type", dataProviderClass = NSDataProvider.class)
	public void test_search_type(String s1) {
		webtest.type("id=keywd", s1);
		webtest.click("id=sobtn");
	}

	@Test(priority = 4)
	public void test_news_comment1() {
		webtest.selectByVisibleText("xpath=//div[@class='panel-body']/form/select", "系统新闻");
		webtest.click("id=sobtn");
		webtest.click("xpath=//dl[@class='news-list']/dt/a");
		webtest.click("xpath=//a[contains(text(),'评论')]");
		webtest.click("xpath=//a[contains(text(),'发布')]");
		webtest.leaveFrame();
		webtest.isTextPresent("请先登录");
	}

//	@Test(priority = 5)
//	public void test_news_comment2() throws IOException {
//		webtest.click("xpath=//span[@class=layui-layer-setwin/a[3]");
//		webtest.leaveFrame();
//		webtest.clicks("class=dropdown-toggle", 1);
//		webtest.click("id=idf_login");
//		webtest.click("xpath=//a[text()='点击我登录']");
//		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("front_name"));
//		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("front_pass"));
//		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
//		webtest.click("xpath=//a[contains(text(),'发布')]");
//
//	}
}
