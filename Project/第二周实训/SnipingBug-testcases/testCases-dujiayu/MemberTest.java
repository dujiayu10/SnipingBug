package com.webtest.testCases;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

//后台——会员管理-个人会员
public class MemberTest extends BaseTest {
//	@BeforeClass
//	public  void login() throws InterruptedException, IOException {	
//		//登录
//		webtest.open(ReadProperties.getPropertyValue("base_url1"));
//		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("usname"));
//		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("upasswd"));
//		webtest.type("xpath=//*[@placeholder='认证码']",ReadProperties.getPropertyValue("ucode"));
//		webtest.click("xpath=//input[@value='提交']");
//		assertTrue(webtest.isTextPresent("主营"));
//	}
	@Test(priority=0,description = "个人会员列表增加",dataProvider="memberAdd",dataProviderClass=NSDataProvider.class)
	public void test_add(String password,String level,String see,String name,String phone) {
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'添加')]");
		webtest.enterFrame("adf_main");
		webtest.type("id=fm[upass]", password);
		webtest.selectByVisibleText("id=fm[grade]",level);
		webtest.selectByVisibleText("name=fm[show]",see);
		webtest.type("id=fm[mname]", name);
		webtest.type("id=fm[mtel]", phone);
		webtest.click("name=bsend");
		String aString=webtest.getAlertTest();
		webtest.alertAccept();
		assertEquals("增加成功！", aString);
	}
	@Test(priority=1,description="个人会员搜索框",dataProvider="memberselect",dataProviderClass=NSDataProvider.class)
	public void test_select(String level,String name,String type,String need,String see,String order) {
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'个人会员')]");
		webtest.enterFrame("adf_main");
		webtest.click("name=stype");
		webtest.click("xpath=//*[text()='"+level+"']");
		webtest.click("name=sfid");
		webtest.click("xpath=//*[text()='"+name+"']");
		webtest.click("name=sfop");
		webtest.click("xpath=//*[text()='"+type+"']");
		webtest.type("name=sfkw", need);
		webtest.click("name=show");
		webtest.click("xpath=//*[text()='"+see+"']");
		webtest.click("name=order");
		webtest.click("xpath=//*[text()='"+order+"']");
		webtest.click("name=sch_person");
		assertTrue(webtest.isTextPresent(need)||webtest.isTextPresent("无资料！"));
	}
	
}
