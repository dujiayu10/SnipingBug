package com.webtest.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class InformationNewsTakeTest extends BaseTest {
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
	@Test(priority=1,description="站点介绍的批量操作删除")
	public void test_news_delete() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'站点介绍')]");
		webtest.enterFrame("adf_main");
		webtest.clicks("class=rdcb",1);
		webtest.selectByVisibleText("name=fs_do","删除");
		webtest.click("name=bsend");
		assertTrue(webtest.isTextPresent("成功"));
	}
	@Test(priority=2,description="站点介绍的批量操作显示")
	public void test_news_see() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'站点介绍')]");
		webtest.enterFrame("adf_main");
		webtest.clicks("class=rdcb",1);
		webtest.clicks("class=rdcb",2);
		webtest.clicks("class=rdcb",3);
		webtest.selectByVisibleText("name=fs_do", "显示");
		webtest.click("name=bsend");
		assertTrue(webtest.isTextPresent("成功"));
	}
	@Test(priority=3,description="站点介绍的批量操作隐藏")
	public void test_news_hide() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'站点介绍')]");
		webtest.enterFrame("adf_main");
		webtest.clicks("class=rdcb",1);
		webtest.clicks("class=rdcb",2);
		webtest.clicks("class=rdcb",3);
		webtest.selectByVisibleText("name=fs_do", "隐藏");
		webtest.click("name=bsend");
		assertTrue(webtest.isTextPresent("成功"));
	}
	@Test(priority=4)
	public void test_select_column() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
//		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'新闻动态')]");
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=stype", "精品美文");
		webtest.click("name=sch_news");
		assertTrue(webtest.isTextPresent("精品美文")||webtest.isTextPresent("无资料"));
	}
	@Test(priority=5)
	public void test_select_class() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
//		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'新闻动态')]");
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=sfid", "标题");
		webtest.selectByVisibleText("name=sfop", "like%");
		webtest.type("name=sfkw", "新闻");
		webtest.click("name=sch_news");
		assertTrue(webtest.isTextPresent("新闻")||webtest.isTextPresent("无资料"));
	}
	@Test(priority=6)
	public void test_select_show() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
//		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'新闻动态')]");
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=show","显示");
		webtest.click("name=sch_news");
		assertTrue(webtest.isTextPresent("显示")||webtest.isTextPresent("无资料"));
	}
	@Test(priority=7)
	public void test_select_order() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
//		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'新闻动态')]");
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=order", "添加时间");
		webtest.click("name=sch_news");
		assertTrue(webtest.isTextPresent("添加时间"));
	}
}
