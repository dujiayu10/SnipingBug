package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class InformationNewsUpdateTest extends BaseTest {
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
	@Test(priority=0,description="新闻动态修改",dataProvider="newsUpdate",dataProviderClass=NSDataProvider.class)
	public void test_news_update1(String Index,String column,String see,String title,String recommend,String text,String row) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'新闻动态')]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr["+Integer.parseInt(Index)+"]/td[8]/a");
//		webtest.selectByVisibleText("id=fm[catid]",column);
//		webtest.selectByVisibleText("name=fm[show]",see);
//		webtest.click("xpath=//*[text()='"+see+"']");
		webtest.typeAndClear("id=fm[title]",title);
		webtest.click("xpath=//*[text()='"+recommend+"']");
//		webtest.enterFrame1("xpath=//div[@class='ke-edit']/iframe");
//		webtest.type("class=ke-content", text);
//		webtest.leaveFrame();
//		webtest.click("xpath=//input[@value='资料选取']");
//		webtest.clicks("class=rdcb",Integer.parseInt(row));
//		webtest.click("id=sel_msg");
		webtest.click("name=bsend");
		String a=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("修改成功！", a);
	}
	@Test(priority=1,description="专题新闻修改",dataProvider="newsUpdate2",dataProviderClass=NSDataProvider.class)
	public void test_news_update2(String Index,String column,String see,String title) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'专题新闻')]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr["+Integer.parseInt(Index)+"]/td[8]/a");
//		webtest.selectByVisibleText("id=fm[catid]",column);
//		webtest.selectByVisibleText("name=fm[show]",see);
//		webtest.click("xpath=//*[text()='"+see+"']");
		webtest.typeAndClear("id=fm[title]",title);
		webtest.click("name=bsend");
		String a=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("修改成功！", a);
	}
	@Test(priority=2,description="站点介绍修改",dataProvider="newsUpdate2",dataProviderClass=NSDataProvider.class)
	public void test_news_update3(String Index,String column,String see,String title) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'站点介绍')]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr["+Integer.parseInt(Index)+"]/td[8]/a");
//		webtest.selectByVisibleText("id=fm[catid]",column);
		webtest.selectByVisibleText("name=fm[show]",see);
		webtest.click("xpath=//*[text()='"+see+"']");
		webtest.typeAndClear("id=fm[title]",title);
		webtest.click("name=bsend");
		String a=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("修改成功！", a);
	}
	@Test(priority=3,description="新闻评论1修改",dataProvider="newsUpdate2",dataProviderClass=NSDataProvider.class)
	public void test_news_update4(String Index,String column,String see,String title) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'新闻评论')]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr["+Integer.parseInt(Index)+"]/td[7]/a");
//		webtest.selectByVisibleText("id=fm[catid]",column);
		webtest.selectByVisibleText("name=fm[show]",see);
		webtest.click("xpath=//*[text()='"+see+"']");
		webtest.typeAndClear("id=fm[title]",title);
		webtest.click("name=bsend");
		String a=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("修改成功！", a);
	}
	@Test(priority=4,description="新闻评论2修改",dataProvider="newsUpdate2",dataProviderClass=NSDataProvider.class)
	public void test_news_update5(String Index,String column,String see,String title) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=/html/body/div[3]/div[2]/ul[2]/li[3]/a[1]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr["+Integer.parseInt(Index)+"]/td[7]/a");
//		webtest.selectByVisibleText("id=fm[catid]",column);
		webtest.selectByVisibleText("name=fm[show]",see);
		webtest.click("xpath=//*[text()='"+see+"']");
		webtest.typeAndClear("id=fm[title]",title);
		webtest.click("name=bsend");
		String a=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("修改成功！", a);
	}
}
