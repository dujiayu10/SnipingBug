package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * 互动-问答管理-增加资料
 * 
 * 
 * */
public class QAManagementAddTest extends LoginTest{
	@Test(priority = 1,dataProvider = "qamaddfa",dataProviderClass = NSDataProvider.class)
	public void test_qamanagementadd_fail(String catid,String show,String title,String essence,String details) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击问答管理
		webtest.click("xpath=//*[text()='问答管理']");
		Thread.sleep(1000);
		//点击增加资料
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='增加资料>>']");
		Thread.sleep(1000);
		//选择所在栏目
		webtest.selectByVisibleText("name=fm[catid]", catid);
		Thread.sleep(1000);
		//选择显示
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//填写标题
		webtest.type("name=fm[title]",title);
		Thread.sleep(1000);
		//是否加精
		webtest.click(essence);
		Thread.sleep(1000);
		//输入内容
		webtest.type("name=fm[detail]", details);
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
	@Test(priority = 2,dataProvider = "qamaddsuc",dataProviderClass = NSDataProvider.class)
	public void test_qamanagementadd_success(String catid,String show,String title,String essence,String details) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击问答管理
		webtest.click("xpath=//*[text()='问答管理']");
		Thread.sleep(1000);
		//点击增加资料
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='增加资料>>']");
		Thread.sleep(1000);
		//选择所在栏目
		webtest.selectByValue("name=fm[catid]", catid);
		Thread.sleep(1000);
		//选择显示
		webtest.selectByValue("name=fm[show]", show);
		Thread.sleep(1000);
		//填写标题
		webtest.type("name=fm[title]",title);
		Thread.sleep(1000);
		//是否加精
		webtest.click(essence);
		Thread.sleep(1000);
		//输入内容
		webtest.type("name=fm[detail]", details);
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
