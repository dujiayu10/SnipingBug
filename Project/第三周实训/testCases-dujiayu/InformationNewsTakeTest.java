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
	@Test(priority=1,description="站点介绍的批量操作删除",dataProvider="newsTake",dataProviderClass=NSDataProvider.class)
	public void test_news_delete(String row1,String row2,String row3) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'站点介绍')]");
		webtest.enterFrame("adf_main");
		webtest.clicks("class=rdcb",Integer.parseInt(row1));
//		webtest.clicks("class=rdcb",Integer.parseInt(row2));
//		webtest.clicks("class=rdcb",Integer.parseInt(row3));
		webtest.selectByVisibleText("name=fs_do","删除");
		webtest.click("name=bsend");
		assertTrue(webtest.isTextPresent("成功"));
	}
	@Test(priority=2,description="站点介绍的批量操作显示",dataProvider="newsTake",dataProviderClass=NSDataProvider.class)
	public void test_news_see(String row1,String row2,String row3) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'站点介绍')]");
		webtest.enterFrame("adf_main");
		webtest.clicks("class=rdcb",Integer.parseInt(row1));
		webtest.clicks("class=rdcb",Integer.parseInt(row2));
		webtest.clicks("class=rdcb",Integer.parseInt(row3));
		webtest.selectByVisibleText("name=fs_do", "显示");
		webtest.click("name=bsend");
		assertTrue(webtest.isTextPresent("成功"));
	}
	@Test(priority=3,description="站点介绍的批量操作隐藏",dataProvider="newsTake",dataProviderClass=NSDataProvider.class)
	public void test_news_hide(String row1,String row2,String row3) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'站点介绍')]");
		webtest.enterFrame("adf_main");
		webtest.clicks("class=rdcb",Integer.parseInt(row1));
		webtest.clicks("class=rdcb",Integer.parseInt(row2));
		webtest.clicks("class=rdcb",Integer.parseInt(row3));
		webtest.selectByVisibleText("name=fs_do", "隐藏");
		webtest.click("name=bsend");
		assertTrue(webtest.isTextPresent("成功"));
	}
}
