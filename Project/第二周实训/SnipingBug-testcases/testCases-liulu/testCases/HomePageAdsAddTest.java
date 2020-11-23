package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class HomePageAdsAddTest extends BaseTest{
	//广告-增加
	@Test(priority = 1)
	public  void test_login() throws InterruptedException, IOException {	
		//登录
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		Thread.sleep(2000);
				
		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("usname"));
		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("upasswd"));
		webtest.type("xpath=//input[@placeholder='认证码']",ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
			
	}
	@Test(priority = 2,dataProvider="data4",dataProviderClass=NSDataProvider.class)
	public void add_success(String pid,int index,String title,String detail) throws InterruptedException {
		Thread.sleep(2000);
		webtest.click("class=atm_m1adv");
		webtest.click("xpath=//a[text()='首页广告']");
		webtest.enterFrame("adf_main");
		webtest.click("id=adblock_add");
		webtest.type("id=fm[pid]", pid);
		webtest.selectByIndex("id=fm[pmod]", index);
		webtest.type("id=fm[title]", title);
		webtest.type("id=fm[detail]", detail);
		webtest.click("name=bsend");
		String a = webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("增加成功！", a);	
	}
//	@Test(priority = 2,dataProvider="data3",dataProviderClass=NSDataProvider.class)
	public void add_fail(String pid,int index,String title,String detail) throws InterruptedException {
		Thread.sleep(2000);
		webtest.click("class=atm_m1adv");
		webtest.click("xpath=//a[text()='首页广告']");
		webtest.enterFrame("adf_main");
		webtest.click("id=adblock_add");
		webtest.type("id=fm[pid]", pid);
		webtest.selectByIndex("id=fm[pmod]", index);
		webtest.type("id=fm[title]", title);
		webtest.type("id=fm[detail]", detail);
		webtest.click("name=bsend");
		String aString = webtest.getAlertTest();
		webtest.alertAccept();
		assertEquals(aString, "请检查表单的规范性与完整性：\r\n" + 
				"\r\n" + 
				"0. 2-24字符");
//		webtest.leaveFrame();	
	}
	
}
