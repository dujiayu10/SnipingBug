package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class BrokerTakeTest extends BaseTest {
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
	//搜索功能（会员等级）
		@Test(priority=5)
		public void test_add_successselect1() {
			webtest.click("xpath=//a[contains(text(),'经纪人')]");
			webtest.enterFrame("adf_main");
			webtest.click("name=stype");
			webtest.click("xpath=//*[text()='超级会员']");
			webtest.click("name=sch_inmem");
			assertTrue(webtest.isTextPresent("超级会员")||webtest.isTextPresent("无资料！"));
		}
//		搜索功能（显示或隐藏）
		@Test(priority=6)
		public void test_add_successselect2() {
			webtest.click("xpath=//a[contains(text(),'经纪人')]");
			webtest.enterFrame("adf_main");
			webtest.click("name=show");
			webtest.click("xpath=//*[text()='隐藏']");
			webtest.click("name=sch_inmem");
			assertTrue(webtest.isTextPresent("隐藏")||webtest.isTextPresent("无资料！"));
		}
//		搜索功能（名称筛选）
		@Test(priority=7,dataProvider="selectName",dataProviderClass=NSDataProvider.class)
		public void test_add_successselect3(String type,String name) {
//			webtest.click("xpath=//a[contains(text(),'经纪人')]");
//			webtest.enterFrame("adf_main");
			webtest.click("name=sfop");
			webtest.click("xpath=//*[text()='"+type+"']");
			webtest.type("name=sfkw", name);
			webtest.click("name=sch_inmem");
			assertTrue(webtest.isTextPresent(name)||webtest.isTextPresent("无资料！"));
		}
//		批量操作-删除
		@Test(priority=8,dataProvider="manytake",dataProviderClass=NSDataProvider.class)
		public void test_delete_many(String index,String index2) {
			webtest.leaveFrame();
			webtest.click("xpath=//a[contains(text(),'经纪人')]");
			webtest.enterFrame("adf_main");
			webtest.clicks("class=rdcb",Integer.parseInt(index));
			webtest.clicks("class=rdcb",Integer.parseInt(index2));
			webtest.click("name=fs_do");
			webtest.click("xpath=//*[text()='删除']");
			webtest.click("name=bsend");
			assertTrue(webtest.isTextPresent("删除成功！"));
		}
		//批量操作-隐藏
		@Test(priority=9,dataProvider="manytake",dataProviderClass=NSDataProvider.class)
		public void test__many(String index,String index2) {
			webtest.leaveFrame();
			webtest.click("xpath=//a[contains(text(),'经纪人')]");
			webtest.enterFrame("adf_main");
			webtest.clicks("class=rdcb",Integer.parseInt(index));
			webtest.clicks("class=rdcb",Integer.parseInt(index2));
			webtest.selectByVisibleText("name=fs_do", "隐藏");
			webtest.click("name=bsend");
			assertTrue(webtest.isTextPresent("隐藏成功！"));
		}
		//批量操作-显示
		@Test(priority=10,dataProvider="manytake",dataProviderClass=NSDataProvider.class)
		public void test__many_see(String index,String index2) {
//			webtest.leaveFrame();
//			webtest.click("xpath=//a[contains(text(),'经纪人')]");
//			webtest.enterFrame("adf_main");
			webtest.clicks("class=rdcb",Integer.parseInt(index));
			webtest.clicks("class=rdcb", Integer.parseInt(index2));
			webtest.selectByVisibleText("name=fs_do", "显示");
			webtest.click("name=bsend");
			assertTrue(webtest.isTextPresent("审核成功！"));
		}
		//修改
		@Test(priority=11)
		public void test__many_editor() {
//			webtest.leaveFrame();
//			webtest.click("xpath=//a[contains(text(),'经纪人')]");
//			webtest.enterFrame("adf_main");
			webtest.click("xpath=//a[contains(text(),'修改')]");
			webtest.type("id=fm[mname]", "-修改");
			webtest.click("xpath=//input[@value='提交']");
			String a=webtest.getAlertTest();
			webtest.alertAccept();
			webtest.leaveFrame();
			assertEquals("修改成功！",a);
		}
}
