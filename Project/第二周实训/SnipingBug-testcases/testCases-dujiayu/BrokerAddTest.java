package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.logging.Level;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;
//后台-会员管理-经纪人
public class BrokerAddTest extends BaseTest {
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
	//连续增加合法的数据(4条)
	@Test(priority=1,description = "经纪人增加",dataProvider="broker",dataProviderClass=NSDataProvider.class)
	public void test_add_success(String password,String select,String show,String mname,String indep,String phone) throws InterruptedException, IOException {	
		webtest.click("xpath=//a[contains(text(),'经纪人')]");
		webtest.enterFrame("adf_main");
		webtest.click("id=inmem_add");
		webtest.type("id=fm[upass]",password);
		webtest.click("id=fm[grade]");
		webtest.click("xpath=//*[text()='"+select+"']");
		webtest.click("id=fm[show]");
		webtest.click("xpath=//*[text()='"+show+"']");
		webtest.type("id=fm[mname]",mname);
		webtest.click("xpath=//*[text()='"+indep+"']");
		webtest.type("id=fm[mtel]",phone);
		webtest.click("xpath=//input[@value='提交']");
		String a=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("增加成功！", a);
	}
	//增加不合法数据(密码不合法)
	@Test(priority=2,description = "经纪人增加",dataProvider="brokerfail",dataProviderClass=NSDataProvider.class)
	public void test_add_fail(String password,String mname,String phone) {
		webtest.click("xpath=//a[contains(text(),'经纪人')]");
		webtest.enterFrame("adf_main");
		webtest.click("id=inmem_add");
		webtest.type("id=fm[upass]",password);
		webtest.click("id=fm[grade]");
		webtest.click("xpath=//*[text()='超级会员']");
		webtest.click("id=fm[show]");
		webtest.click("xpath=//*[text()='显示']");
		webtest.type("id=fm[mname]",mname);
		webtest.click("xpath=//*[text()='管理部']");
		webtest.type("id=fm[mtel]", phone);
		webtest.click("xpath=//input[@value='提交']");
		String a=webtest.getAlertTest();
		boolean b=a.contains("请检查表单的规范性与完整性：");
		webtest.alertAccept();
		webtest.leaveFrame();
		assertTrue(b);
	}
	//增加不合法数据（用户名不合法）
	@Test(priority=3,description = "经纪人增加",dataProvider="brokerfailname",dataProviderClass=NSDataProvider.class)
	public void test_add_failname(String password,String mname,String phone) {
		webtest.click("xpath=//a[contains(text(),'经纪人')]");
		webtest.enterFrame("adf_main");
		webtest.click("id=inmem_add");
		webtest.type("id=fm[upass]",password);
		webtest.click("id=fm[grade]");
		webtest.click("xpath=//*[text()='超级会员']");
		webtest.click("id=fm[show]");
		webtest.click("xpath=//*[text()='显示']");
		webtest.type("id=fm[mname]",mname);
		webtest.click("xpath=//*[text()='管理部']");
		webtest.type("id=fm[mtel]", phone);
		webtest.click("xpath=//input[@value='提交']");
		String a=webtest.getAlertTest();
		boolean b=a.contains("请检查表单的规范性与完整性：");
		webtest.alertAccept();
		webtest.leaveFrame();
		assertTrue(b);
	}
	@Test(priority=4,description = "经纪人增加",dataProvider="brokerfailphone",dataProviderClass=NSDataProvider.class)//手机号不合法
	public void test_add_failphone(String password,String mname,String phone) {
		webtest.click("xpath=//a[contains(text(),'经纪人')]");
		webtest.enterFrame("adf_main");
		webtest.click("id=inmem_add");
		webtest.type("id=fm[upass]",password);
		webtest.click("id=fm[grade]");
		webtest.click("xpath=//*[text()='超级会员']");
		webtest.click("id=fm[show]");
		webtest.click("xpath=//*[text()='显示']");
		webtest.type("id=fm[mname]",mname);
		webtest.click("xpath=//*[text()='管理部']");
		webtest.type("id=fm[mtel]", phone);
		webtest.click("xpath=//input[@value='提交']");
		String a=webtest.getAlertTest();
		boolean b=a.contains("请检查表单的规范性与完整性：");
		webtest.alertAccept();
		webtest.leaveFrame();
		assertTrue(b);
	}
}
