package com.webtest.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class MemberAddTest extends BaseTest {

	@Test(priority = 0)
	public void test_login_ad() throws InterruptedException, IOException {
		// 登录 点击广告
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
		webtest.type("id=fm[uname]", ReadProperties.getPropertyValue("back_name"));
		webtest.type("id=fm[upass]", ReadProperties.getPropertyValue("back_pwd"));
		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
		webtest.click("class=atm_m1adv");
		assertTrue(webtest.isTextPresent("网址收藏"));

	}

	@Test(priority = 1)
	public void test_member_center() {
		// 点击会员中心
		webtest.click("xpath=//a[text()='会员中心']");
		webtest.enterFrame("adf_main");
		assertTrue(webtest.isTextPresent("会员中心"));
	}
	
	@Test(priority = 2,dataProvider = "member_add", dataProviderClass = NSDataProvider.class)
	public void test_member_add(String s1,String s2,String s3) throws IOException {
		// 点击增加资料
		webtest.click("id=adfavor_add");
		webtest.selectByVisibleText("id=fm[pmod]", s1);
		webtest.typeAndClear("id=fm[title]", s2);
		webtest.click("xpath=//input[@value='检查重名']");
		assertTrue(webtest.isTextPresent("该资料未重复!"));
		webtest.type("xpath=//input[@value='上传']", ReadProperties.getPropertyValue("testphoto_path")+s3);
		webtest.click("xpath=//input[@type='submit']");
		assertEquals(webtest.getAlertTest(), "增加成功！");
		webtest.alertAccept();
		webtest.pause(3000);
		assertEquals(webtest.isTextPresent("无资料！"), false);
	}
	
}
