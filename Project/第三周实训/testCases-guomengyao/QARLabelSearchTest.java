package com.webtest.testCases;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * ����-�ʴ�ظ�-��ǩ-����
 * 
 * 
 * */
public class QARLabelSearchTest extends LoginTest{
	@Test(priority = 1,dataProvider = "qarlsearchtit",dataProviderClass = NSDataProvider.class)
	public void test_search_by_title(String title) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//�����ǩ
		webtest.click("xpath=//*[text()='��ǩ']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//�������
		webtest.selectByVisibleText("name=sfid","��ǩ");
		Thread.sleep(1000);
		//�����Ѵ��ڵı�ǩ����
		webtest.typeAndClear("name=sfkw",title);
		//�������
		webtest.click("name=sch_qatag");
		Thread.sleep(1000);
		webtest.leaveFrame();
	}
	@Test(priority = 2,dataProvider = "searchshow",dataProviderClass = NSDataProvider.class)
	public void test_search_by_show(String show) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//�����ǩ
		webtest.click("xpath=//*[text()='��ǩ']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//�����ʾ
		webtest.selectByVisibleText("name=show",show);
		//�������
		webtest.click("name=sch_qatag");
		Thread.sleep(1000);
		webtest.leaveFrame();
	}
	@Test(priority = 3,dataProvider = "searchorder",dataProviderClass = NSDataProvider.class)
	public void test_search_by_order(String order) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//�����ǩ
		webtest.click("xpath=//*[text()='��ǩ']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//�������
		webtest.selectByVisibleText("name=order",order);
		//�������
		webtest.click("name=sch_qatag");
		Thread.sleep(1000);
		webtest.leaveFrame();
	}
}
