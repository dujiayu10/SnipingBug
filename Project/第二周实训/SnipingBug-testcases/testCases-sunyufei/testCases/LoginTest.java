package com.webtest.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;


public class LoginTest extends BaseTest {

	@Test
	public void test_login() throws InterruptedException, IOException {
		// 登录
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
		webtest.type("id=fm[uname]", ReadProperties.getPropertyValue("back_name"));
		webtest.type("id=fm[upass]", ReadProperties.getPropertyValue("back_pwd"));
		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("主营"));
	}

//	@Test
//	public void test1() {
//		assertEquals(1, 1);
//	}
//
//	@Test
//	public void test2() {
//		assertEquals(1, 2);
//	}
//
//	@Test
//	public void test3() {
//		assertEquals(1, 3);
//	}
//
//	@Test
//	public void test4() {
//		assertEquals(3, 3);
//	}
}
