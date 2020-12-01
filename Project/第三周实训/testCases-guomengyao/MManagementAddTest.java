package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * 互动-网站留言管理-增加资料
 * 
 * 
 * */
public class MManagementAddTest extends LoginTest{
	@Test(priority = 1,dataProvider = "mmaddfa",dataProviderClass = NSDataProvider.class)
	public void test_mmanagementadd_fail(String show,String title,String type,String details,String reply,String mname) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击网站留言管理
		webtest.click("xpath=//*[text()='网站留言管理']");
		Thread.sleep(1000);
		//点击增加资料
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='增加资料>>']");
		Thread.sleep(1000);
		//选择显示
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//填写标题
		webtest.type("name=fm[title]",title);
		Thread.sleep(1000);
		//类型
		webtest.click(type);
		Thread.sleep(1000);
		//输入内容
		webtest.type("name=fm[detail]", details);
		Thread.sleep(1000);
		//回复
		webtest.type("name=fm[reply]", reply);
		Thread.sleep(1000);
		//昵称
		webtest.type("name=fm[mname]", mname);
		Thread.sleep(1000);
		//提交
		webtest.click("name=bsend");
		Thread.sleep(1000);
		//判断是否增加成功
		String addsuccess=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("增加成功！", addsuccess);
		Thread.sleep(3000);
	}
	@Test(priority = 2,dataProvider = "mmaddsuc",dataProviderClass = NSDataProvider.class)
	public void test_mmanagementadd_success(String show,String title,String type,String details,String reply,String mname) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击网站留言管理
		webtest.click("xpath=//*[text()='网站留言管理']");
		Thread.sleep(1000);
		//点击增加资料
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='增加资料>>']");
		Thread.sleep(1000);
		//选择显示
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//填写标题
		webtest.type("name=fm[title]",title);
		Thread.sleep(1000);
		//类型
		webtest.click(type);
		Thread.sleep(1000);
		//输入内容
		webtest.type("name=fm[detail]", details);
		Thread.sleep(1000);
		//回复
		webtest.type("name=fm[reply]", reply);
		Thread.sleep(1000);
		//昵称
		webtest.type("name=fm[mname]", mname);
		Thread.sleep(1000);
		//提交
		webtest.click("name=bsend");
		Thread.sleep(1000);
		//判断是否增加成功
		String addsuccess=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("增加成功！", addsuccess);
		Thread.sleep(3000);
	}
}
