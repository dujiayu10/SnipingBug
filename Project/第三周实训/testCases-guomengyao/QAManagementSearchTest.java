package com.webtest.testCases;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * ����-�ʴ����-����
 * 
 * 
 * */
public class QAManagementSearchTest extends LoginTest{
	@Test(priority = 1)
	public void before() throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʴ����
		webtest.click("xpath=//*[text()='�ʴ����']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
	}
	@Test(priority = 2,dataProvider = "qamsearchcol",dataProviderClass = NSDataProvider.class)
	public void test_search_by_column(String column) throws InterruptedException {
		//�����Ŀ
		webtest.selectByVisibleText("name=stype", column);
		Thread.sleep(1000);
		//�������
		webtest.click("name=sch_faqs");
		Thread.sleep(1000);
	}
	@Test(priority = 3,dataProvider = "qamsearchtit",dataProviderClass = NSDataProvider.class)
	public void test_search_by_title(String title) throws InterruptedException {
		//����ʴ����
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='�ʴ����']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//�������
		webtest.selectByVisibleText("name=sfid","Title/����");
		Thread.sleep(1000);
		//�����Ѵ��ڵ��ʴ����
		webtest.typeAndClear("name=sfkw",title);
		//�������
		webtest.click("name=sch_faqs");
		Thread.sleep(1000);
	}
	@Test(priority = 4,dataProvider = "searchshow",dataProviderClass = NSDataProvider.class)
	public void test_search_by_show(String show) throws InterruptedException {
		//����ʴ����
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='�ʴ����']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//�����ʾ
		webtest.selectByVisibleText("name=show",show);
		//�������
		webtest.click("name=sch_faqs");
		Thread.sleep(1000);
	}
	@Test(priority = 5,dataProvider = "searchorder",dataProviderClass = NSDataProvider.class)
	public void test_search_by_order(String order) throws InterruptedException {
		//����ʴ����
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='�ʴ����']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//�������
		webtest.selectByVisibleText("name=order",order);
		//�������
		webtest.click("name=sch_faqs");
		Thread.sleep(1000);
	}
}
