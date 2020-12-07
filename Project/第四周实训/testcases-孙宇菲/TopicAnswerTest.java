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
		webtest.click("xpath=//a[text()='�����ƽ��']");
		webtest.click("class=fa fa-gift");
		webtest.type("id=word", "�����ƽ�밡������");
		webtest.click("id=submit");
	}

	@Test(priority = 2)
	public void test_commemorate2() {
    	webtest.click("class=dropdown-toggle");
    	webtest.click("xpath=//a[text()='ר��']");
		webtest.click("xpath=//a[text()='�����������']");
		webtest.click("class=fa fa-gift");
		webtest.type("id=word", "���������������");
		webtest.typeAndClear("xpath=//input[@value='����']", "syf");
		webtest.click("id=submit");
	}
	
	@Test(priority=3)
	public void test_demo() {
		webtest.click("class=dropdown-toggle");
    	webtest.click("xpath=//a[text()='ר��']");
		webtest.click("xpath=//a[text()='ͼ���б�-ר����ʾ']");
		webtest.click("xpath=//a[text()='�⼮����']");
		webtest.click("xpath=//a[text()='�񽱼α�']");
		webtest.click("xpath=//a[text()='����ҵ']");
		webtest.click("xpath=//a[contains(text(),'Topic')]");
	}
	
	@Test(priority=4)
	public void test_ask_answer() {
		webtest.click("xpath=//a[text()='�ʴ�']");
		webtest.click("xpath=//a[text()='����']");
		webtest.click("class=c90F");
		webtest.click("xpath=//a[text()='����']");
		webtest.click("xpath=//a[text()='����']");
		webtest.click("xpath=//a[text()='��ǩ']");
	}
}
