package com.webtest.testCases;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
/**前台-楼盘-我要按钮--gmy
 */
public class IWantTest extends Front_Login{
	@Test
	public void test_iwant() throws InterruptedException, IOException{	
		//点击楼盘
		webtest.click("xpath=//*[text()='楼盘']");
		Thread.sleep(1000);
		//点击第n个房产信息
		webtest.sclick("class=img-thumbnail", "4");
		Thread.sleep(1000);
		//点击我要
		webtest.click("xpath=//*[@onclick='omodal()']");
		Thread.sleep(1000);
		//选择需求意向(选择m个,m不为0)
		webtest.clicks("class=rdcb", "3");
		//填写电话称呼
		Thread.sleep(1000);
		webtest.type("name=fm[mtel]", "123456");
		webtest.type("name=fm[mname]", "名字");
		Thread.sleep(1000);
		//填写认证码
		webtest.type("xpath=//*[@placeholder='认证码']", "11111");
		Thread.sleep(2000);
		//点击提交
		webtest.click("xpath=//*[text()='提交']");
		//判断是否添加意向成功
		assertTrue(webtest.isTextPresent("ok:提交成功!"));
		Thread.sleep(2000);
	}
}
