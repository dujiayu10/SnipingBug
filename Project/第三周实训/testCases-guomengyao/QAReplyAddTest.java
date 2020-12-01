package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * 互动-问答回复-增加资料
 * 
 * 
 * */
public class QAReplyAddTest extends LoginTest{
	@Test(priority = 1,dataProvider = "qaraddfa",dataProviderClass = NSDataProvider.class)
	public void test_qareplyadd_fail(String relation,String show,String title,String details,String mname) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击问答回复
		webtest.click("xpath=//*[text()='问答回复']");
		Thread.sleep(1000);
		//点击增加资料
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='增加资料>>']");
		Thread.sleep(1000);
		//点击关联信息
		webtest.sclick("class=btn", "0");
		Thread.sleep(1000);
		//选择关联信息
		webtest.enterFrame1("xpath=//iframe[@height='320']");
		webtest.sclick("class=rdcb", relation);
		Thread.sleep(2000);
		webtest.leaveFrame();
		//选择显示
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//填写标题
		webtest.typeAndClear("name=fm[title]",title);
		Thread.sleep(1000);
		//输入内容
		webtest.type("name=fm[detail]", details);
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
	@Test(priority = 2,dataProvider = "qaraddsuc",dataProviderClass = NSDataProvider.class)
	public void test_qareplyadd_success(String relation,String show,String title,String details,String mname) throws InterruptedException {
//		webtest.leaveFrame();
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击问答回复
		webtest.click("xpath=//*[text()='问答回复']");
		Thread.sleep(1000);
		//点击增加资料
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='增加资料>>']");
		Thread.sleep(1000);
		//点击关联信息
		webtest.sclick("class=btn", "0");
		Thread.sleep(1000);
		//选择关联信息
		webtest.enterFrame1("xpath=//iframe[@height='320']");
		webtest.sclick("class=rdcb", relation);
		Thread.sleep(2000);
		webtest.leaveFrame();
		//选择显示
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//填写标题
		webtest.typeAndClear("name=fm[title]",title);
		Thread.sleep(1000);
		//输入内容
		webtest.type("name=fm[detail]", details);
		Thread.sleep(1000);
		//昵称
		webtest.type("name=fm[mname]", mname);
		Thread.sleep(1000);
		//提交
		webtest.click("name=bsend");
		Thread.sleep(1000);
		//判断是否增加成功,显示稍后重试一Retry为增加失败
		assertTrue(webtest.isTextPresent("稍后重试一Retry"));
		webtest.leaveFrame();
		Thread.sleep(3000);
	}
}
