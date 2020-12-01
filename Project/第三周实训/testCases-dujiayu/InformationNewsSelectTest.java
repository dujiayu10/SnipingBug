package com.webtest.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class InformationNewsSelectTest extends BaseTest {
	@BeforeClass
	public  void login() throws InterruptedException, IOException {	
		//登录
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("usname"));
		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("upasswd"));
		webtest.type("xpath=//*[@placeholder='认证码']",ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
		assertTrue(webtest.isTextPresent("主营"));
	}
	@Test(priority=0,dataProvider="columnS",dataProviderClass=NSDataProvider.class)
	public void test_select_column(String column) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
//		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'新闻动态')]");
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=stype", column);
		webtest.click("name=sch_news");
		assertTrue(webtest.isTextPresent(column)||webtest.isTextPresent("无资料"));
	}
	@Test(priority=1,dataProvider="classS",dataProviderClass=NSDataProvider.class)
	public void test_select_class(String title,String Screening,String word) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
//		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'新闻动态')]");
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=sfid", title);
		webtest.selectByVisibleText("name=sfop", Screening);
		webtest.type("name=sfkw", word);
		webtest.click("name=sch_news");
		assertTrue(webtest.isTextPresent(word)||webtest.isTextPresent("无资料"));
	}
	@Test(priority=0,dataProvider="showS",dataProviderClass=NSDataProvider.class)
	public void test_select_show(String show) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
//		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'新闻动态')]");
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=show", show);
		webtest.click("name=sch_news");
		assertTrue(webtest.isTextPresent(show)||webtest.isTextPresent("无资料"));
	}
	@Test(priority=0,dataProvider="orderS",dataProviderClass=NSDataProvider.class)
	public void test_select_order(String order) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
//		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'新闻动态')]");
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=order", order);
		webtest.click("name=sch_news");
		assertTrue(webtest.isTextPresent(order));
	}
}
