package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class BuildingIntentionAddTest extends BaseTest{
	@Test(priority = 1)
	public  void test_login() throws InterruptedException, IOException {	
		//登录
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		Thread.sleep(2000);
//		webtest.click("id=idf_sale");
//		webtest.click("xpath=//a[text()='1室']");
//		assertTrue(webtest.isTextPresent("找到 0 条纪录"));
//		System.out.println(webtest.isTextPresent("找到 0 条纪录"));
				
		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("usname"));
		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("upasswd"));
		webtest.type("xpath=//input[@placeholder='认证码']",ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
			
	}
	//title name phone  备注
		//pass
		@Test(priority = 2,dataProvider="movie",dataProviderClass=NSDataProvider.class)
		public void test_1(String title,String name,String phone,String detail) throws InterruptedException {
			Thread.sleep(2000);
			webtest.click("xpath=//a[text()='楼盘意向']");
			Thread.sleep(2000);
			webtest.enterFrame("adf_main");
			webtest.click("id=need_add");
			Thread.sleep(1000);
			//true
			webtest.type("id=fm_lpid_refname", title);
			webtest.click("id=fm_ntype_1");
			webtest.type("id=fm[mname]", name);
			webtest.type("id=fm[mtel]", phone);
			webtest.type("id=fm[detail]", detail);
			webtest.click("name=bsend");
			String a = webtest.getAlertTest();
			webtest.alertAccept();
			webtest.leaveFrame();
			assertEquals("增加成功！", a);
		}
//		fail
//		@Test(priority = 2,dataProvider="movie",dataProviderClass=NSDataProvider.class)
		public void test_2(String title,String name,String phone,String detail) throws InterruptedException {
			Thread.sleep(2000);
			webtest.click("xpath=//a[text()='楼盘意向']");
			Thread.sleep(2000);
			webtest.enterFrame("adf_main");
			webtest.click("id=need_add");
			Thread.sleep(1000);
			//true
			webtest.type("id=fm_lpid_refname", title);
			webtest.click("id=fm_ntype_1");
//			webtest.type("id=fm[mname]", "name1");
			webtest.type("id=fm[mtel]", phone);
			webtest.type("id=fm[detail]", detail);
			webtest.click("name=bsend");
//			String a = webtest.getAlertTest();
			webtest.alertAccept();
			
			webtest.type("id=fm[mname]", name);
			webtest.alertAccept();
			webtest.leaveFrame();
		}

}
