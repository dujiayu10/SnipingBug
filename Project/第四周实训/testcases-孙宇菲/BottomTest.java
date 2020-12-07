package com.webtest.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class BottomTest extends BaseTest{
	
	@Test(priority = 0)
	public void test_about() throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		webtest.click("xpath=//a[text()='关于']");
		webtest.leaveFrame();
		
	}

	@Test(priority = 1)
	public void test_about_catalog1() throws IOException {
		webtest.click("xpath=//a[text()='企业文化']");
		webtest.click("xpath=//a[text()='企业文化2']");
		webtest.leaveFrame();
	}
	
	@Test(priority = 2)
	public void test_about_catalog2() throws IOException {
		webtest.click("xpath=//a[text()='服务内容']");
		for(int i=0;i<4;i++) {
			webtest.clicks("xpath=//a[text()='详情']",i);
			webtest.goBack();
			webtest.pause(2000);
		}
		webtest.leaveFrame();
	}
	
	@Test(priority = 3)
	public void test_about_catalog3() throws IOException {
		webtest.click("xpath=//a[text()='常见问题']");
		webtest.click("xpath=//a[text()='[详情]']");
		webtest.click("xpath=//a[text()='[收起]']");	
	}
	
	@Test(priority=4)
	public void test_about_catalog4() {
		webtest.click("xpath=//a[text()='联系我们']");
		webtest.click("xpath=//a[text()='联系开发者(东莞)']");
		for(int i=0;i<5;i++) {
			webtest.click("xpath=//div[@title='放大一级']");
		}
		for(int i=0;i<5;i++) {
			webtest.click("xpath=//div[@title='缩小一级']");
		}
		webtest.click("xpath=//div[@title='显示卫星影像']");
		for(int i=0;i<3;i++) {
			webtest.click("xpath=//div[@title='放大一级']");
		}
		webtest.click("xpath=//div[@title='显示三维地图']");
		for(int i=0;i<3;i++) {
			webtest.click("xpath=//div[@title='放大一级']");
		}
	}
	
	@Test(priority=5)
	public void test_navigation1() {
		webtest.click("id=idf_info");
		webtest.click("xpath=//a[text()='留言反馈']");
		webtest.click("xpath=//a[contains(text(),'发布')]");
		webtest.enterFrame1("xpath=//div[@class='layui-layer-content']/iframe");
		webtest.click("xpath=//input[@value='提交']");
		webtest.alertAccept();
	}
	
	@Test(priority=6)
	public void test_navigation2() throws IOException {
		webtest.type("id=fm[title]", "评论0");
		webtest.clicks("class=rdcb", 2);
		webtest.type("id=fm[detail]", "投诉内容");
		webtest.type("id=fm[mname]", "m1");
		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
		webtest.alertAccept();
	}
	
	@Test(priority=7)
	public void test_navigation3() throws IOException {
		webtest.type("id=fm[title]", "评论1");
		webtest.clicks("class=rdcb", 3);
		webtest.type("id=fm[detail]", "致谢内容detaildetail");
		webtest.type("id=fm[mname]", "m");
		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
		webtest.alertAccept();
		
	}
}
