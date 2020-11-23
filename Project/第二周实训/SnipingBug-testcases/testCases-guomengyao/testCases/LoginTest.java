package com.webtest.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;
//@Listeners(com.webtest.freemarker.GenerateReporter.class)
public class LoginTest extends BaseTest{
	@Test(dataProvider = "login",dataProviderClass = NSDataProvider.class)
//	@Test
	public void test_login(String uname,String upass,String ucode) throws InterruptedException, IOException{	
		//登录
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		webtest.type("id=fm[uname]",uname);
		webtest.type("id=fm[upass]",upass);
		webtest.type("xpath=//*[@placeholder='认证码']",ucode);
		Thread.sleep(2000);
		webtest.click("name=submit");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("主营"));
	}
}
