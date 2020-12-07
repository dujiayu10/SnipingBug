package com.webtest.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class NewsTest extends BaseTest {

	@Test(priority = 0)
	public void test_news() throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		webtest.click("id=idf_news");
		webtest.isTextPresent("Catalog/���");
	}

	@Test(priority=1)
	public void test_catalog() {
		for(int i=0;i<3;i++) {
			webtest.clicks("class=type",i);
		}
	}
	
	@Test(priority = 2,dataProvider = "news_search_select", dataProviderClass = NSDataProvider.class)
	public void test_search_select(String s1) {
		webtest.selectByVisibleText("xpath=//div[@class='panel-body']/form/select", s1);
		webtest.click("id=sobtn");
	} 
	
	@Test(priority = 3,dataProvider = "news_search_type", dataProviderClass = NSDataProvider.class)
	public void test_search_type(String s1) {
		webtest.type("id=keywd", s1);
		webtest.click("id=sobtn");
	}

	@Test(priority = 4)
	public void test_news_comment1() {
		//δ��¼��������
		webtest.selectByVisibleText("xpath=//div[@class='panel-body']/form/select", "ϵͳ����");
		webtest.click("id=sobtn");
		webtest.click("xpath=//dl[@class='news-list']/dt/a");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.leaveFrame();
		webtest.isTextPresent("���ȵ�¼");
	}

	@Test(priority = 5)
	public void test_news_comment2() throws IOException {
		//����д��Ϣ�ύ����
//		webtest.click("xpath=//span[@class=layui-layer-setwin/a[3]");
//		webtest.leaveFrame();
		webtest.goBack();
		webtest.pause(3000);
		webtest.clicks("class=dropdown-toggle", 1);
		webtest.click("id=idf_login");
		webtest.click("xpath=//a[text()='����ҵ�¼']");
		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("front_name"));
		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("front_pwd"));
		webtest.type("xpath=//input[@placeholder='��֤��']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='�ύ']");
		webtest.click("xpath=//a[text()='����']");
		webtest.selectByVisibleText("xpath=//div[@class='panel-body']/form/select", "ϵͳ����");
		webtest.click("id=sobtn");
		webtest.click("xpath=//dl[@class='news-list']/dt/a");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.enterFrame1("xpath=//div[@class='layui-layer-content']/iframe");
		webtest.click("xpath=//input[@value='�ύ']");
		webtest.alertAccept();

	}
	
	@Test(priority=6)
	public void test_news_comment3() throws IOException {
		webtest.type("id=fm[title]", "����0");
		webtest.type("id=fm[detail]", "��������detail");
		webtest.type("id=fm[mname]", "syf1");
		webtest.type("xpath=//input[@placeholder='��֤��']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='�ύ']");
	}
	
	@Test(priority=7)
	public void test_news_comment4() throws IOException {
		//���ⲻ���淶
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.type("id=fm[title]", "2");
		webtest.type("id=fm[detail]", "��������detail");
		webtest.type("id=fm[mname]", "syf2");
		webtest.type("xpath=//input[@placeholder='��֤��']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='�ύ']");
	}
	
	@Test(priority=8)
	public void test_news_comment5() throws IOException {
		//��Ա����ע���Ա
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.type("id=fm[title]", "����3");
		webtest.type("id=fm[detail]", "��������detail");
		webtest.type("id=fm[mname]", "huiyuan00");
		webtest.type("xpath=//input[@placeholder='��֤��']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='�ύ']");
	}
	
	
}
