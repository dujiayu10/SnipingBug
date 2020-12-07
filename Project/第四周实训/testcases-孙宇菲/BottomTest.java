package com.webtest.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class BottomTest extends BaseTest{
	
	@Test(priority = 0)
	public void test_about() throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		webtest.click("xpath=//a[text()='����']");
		webtest.leaveFrame();
		
	}

	@Test(priority = 1)
	public void test_about_catalog1() throws IOException {
		webtest.click("xpath=//a[text()='��ҵ�Ļ�']");
		webtest.click("xpath=//a[text()='��ҵ�Ļ�2']");
		webtest.leaveFrame();
	}
	
	@Test(priority = 2)
	public void test_about_catalog2() throws IOException {
		webtest.click("xpath=//a[text()='��������']");
		for(int i=0;i<4;i++) {
			webtest.clicks("xpath=//a[text()='����']",i);
			webtest.goBack();
			webtest.pause(2000);
		}
		webtest.leaveFrame();
	}
	
	@Test(priority = 3)
	public void test_about_catalog3() throws IOException {
		webtest.click("xpath=//a[text()='��������']");
		webtest.click("xpath=//a[text()='[����]']");
		webtest.click("xpath=//a[text()='[����]']");	
	}
	
	@Test(priority=4)
	public void test_about_catalog4() {
		webtest.click("xpath=//a[text()='��ϵ����']");
		webtest.click("xpath=//a[text()='��ϵ������(��ݸ)']");
		for(int i=0;i<5;i++) {
			webtest.click("xpath=//div[@title='�Ŵ�һ��']");
		}
		for(int i=0;i<5;i++) {
			webtest.click("xpath=//div[@title='��Сһ��']");
		}
		webtest.click("xpath=//div[@title='��ʾ����Ӱ��']");
		for(int i=0;i<3;i++) {
			webtest.click("xpath=//div[@title='�Ŵ�һ��']");
		}
		webtest.click("xpath=//div[@title='��ʾ��ά��ͼ']");
		for(int i=0;i<3;i++) {
			webtest.click("xpath=//div[@title='�Ŵ�һ��']");
		}
	}
	
	@Test(priority=5)
	public void test_navigation1() {
		webtest.click("id=idf_info");
		webtest.click("xpath=//a[text()='���Է���']");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.enterFrame1("xpath=//div[@class='layui-layer-content']/iframe");
		webtest.click("xpath=//input[@value='�ύ']");
		webtest.alertAccept();
	}
	
	@Test(priority=6)
	public void test_navigation2() throws IOException {
		webtest.type("id=fm[title]", "����0");
		webtest.clicks("class=rdcb", 2);
		webtest.type("id=fm[detail]", "Ͷ������");
		webtest.type("id=fm[mname]", "m1");
		webtest.type("xpath=//input[@placeholder='��֤��']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='�ύ']");
		webtest.alertAccept();
	}
	
	@Test(priority=7)
	public void test_navigation3() throws IOException {
		webtest.type("id=fm[title]", "����1");
		webtest.clicks("class=rdcb", 3);
		webtest.type("id=fm[detail]", "��л����detaildetail");
		webtest.type("id=fm[mname]", "m");
		webtest.type("xpath=//input[@placeholder='��֤��']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='�ύ']");
		webtest.alertAccept();
		
	}
}
