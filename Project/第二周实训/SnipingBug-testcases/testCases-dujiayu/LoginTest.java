package com.webtest.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class LoginTest extends BaseTest{
	//登录模块测试：用户名或密码错误、验证码错误、验证码为空、全部正确(4条)
	@Test(description = "用户登录",dataProvider="login",dataProviderClass=NSDataProvider.class)
	public  void test_login(String username,String password,String ucode) throws InterruptedException, IOException {	
		//登录
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		webtest.type("id=fm[uname]",username);
		webtest.type("id=fm[upass]",password);
		webtest.type("xpath=//*[@placeholder='认证码']",ucode);
		webtest.click("xpath=//input[@value='提交']");
		assertTrue(webtest.isTextPresent("主营"));
	}
}
