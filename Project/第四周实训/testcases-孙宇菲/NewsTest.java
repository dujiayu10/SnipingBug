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
		//未登录发布评论
		webtest.selectByVisibleText("xpath=//div[@class='panel-body']/form/select", "系统新闻");
		webtest.click("id=sobtn");
		webtest.click("xpath=//dl[@class='news-list']/dt/a");
		webtest.click("xpath=//a[contains(text(),'评论')]");
		webtest.click("xpath=//a[contains(text(),'发布')]");
		webtest.leaveFrame();
		webtest.isTextPresent("请先登录");
	}

	@Test(priority = 5)
	public void test_news_comment2() throws IOException {
		//不填写信息提交评论
//		webtest.click("xpath=//span[@class=layui-layer-setwin/a[3]");
//		webtest.leaveFrame();
		webtest.goBack();
		webtest.pause(3000);
		webtest.clicks("class=dropdown-toggle", 1);
		webtest.click("id=idf_login");
		webtest.click("xpath=//a[text()='点击我登录']");
		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("front_name"));
		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("front_pwd"));
		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
		webtest.click("xpath=//a[text()='新闻']");
		webtest.selectByVisibleText("xpath=//div[@class='panel-body']/form/select", "系统新闻");
		webtest.click("id=sobtn");
		webtest.click("xpath=//dl[@class='news-list']/dt/a");
		webtest.click("xpath=//a[contains(text(),'发布')]");
		webtest.enterFrame1("xpath=//div[@class='layui-layer-content']/iframe");
		webtest.click("xpath=//input[@value='提交']");
		webtest.alertAccept();

	}
	
	@Test(priority=6)
	public void test_news_comment3() throws IOException {
		webtest.type("id=fm[title]", "评论0");
		webtest.type("id=fm[detail]", "评论内容detail");
		webtest.type("id=fm[mname]", "syf1");
		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
	}
	
	@Test(priority=7)
	public void test_news_comment4() throws IOException {
		//标题不符规范
		webtest.click("xpath=//a[contains(text(),'发布')]");
		webtest.type("id=fm[title]", "2");
		webtest.type("id=fm[detail]", "评论内容detail");
		webtest.type("id=fm[mname]", "syf2");
		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
	}
	
	@Test(priority=8)
	public void test_news_comment5() throws IOException {
		//会员名非注册会员
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'发布')]");
		webtest.type("id=fm[title]", "评论3");
		webtest.type("id=fm[detail]", "评论内容detail");
		webtest.type("id=fm[mname]", "huiyuan00");
		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
	}
	
	
}
