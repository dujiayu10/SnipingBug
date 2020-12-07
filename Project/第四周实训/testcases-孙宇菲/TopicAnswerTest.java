package com.webtest.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class TopicAnswerTest extends BaseTest{
	
	@Test(priority = 0)
	public void test_news() throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		webtest.click("id=idf_topic");
	}
	
	@Test(priority = 1)
	public void test_commemorate1() {
		webtest.click("xpath=//a[text()='纪念和平鸽']");
		webtest.click("class=fa fa-gift");
		webtest.type("id=word", "纪念和平鸽啊啊啊！");
		webtest.click("id=submit");
	}

	@Test(priority = 2)
	public void test_commemorate2() {
    	webtest.click("class=dropdown-toggle");
    	webtest.click("xpath=//a[text()='专题']");
		webtest.click("xpath=//a[text()='纪念刘和珍君']");
		webtest.click("class=fa fa-gift");
		webtest.type("id=word", "纪念刘和珍君啊！");
		webtest.typeAndClear("xpath=//input[@value='匿名']", "syf");
		webtest.click("id=submit");
	}
	
	@Test(priority=3)
	public void test_demo() {
		webtest.click("class=dropdown-toggle");
    	webtest.click("xpath=//a[text()='专题']");
		webtest.click("xpath=//a[text()='图文列表-专题演示']");
		webtest.click("xpath=//a[text()='外籍串客']");
		webtest.click("xpath=//a[text()='获奖嘉宾']");
		webtest.click("xpath=//a[text()='获奖企业']");
		webtest.click("xpath=//a[contains(text(),'Topic')]");
	}
	
	@Test(priority=4)
	public void test_ask_answer() {
		webtest.click("xpath=//a[text()='问答']");
		webtest.click("xpath=//a[text()='测试']");
		webtest.click("class=c90F");
		webtest.click("xpath=//a[text()='精华']");
		webtest.click("xpath=//a[text()='热门']");
		webtest.click("xpath=//a[text()='标签']");
	}
}
