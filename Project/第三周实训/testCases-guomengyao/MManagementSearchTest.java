package com.webtest.testCases;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * ����-��վ���Թ���-����
 * 
 * 
 * */
public class MManagementSearchTest extends LoginTest{
	@Test(priority = 1,dataProvider = "mmsearchtit",dataProviderClass = NSDataProvider.class)
	public void test_search_by_title(String title) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//�����վ���Թ���
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='��վ���Թ���']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//�������
		webtest.selectByVisibleText("name=sfid","����");
		Thread.sleep(1000);
		//�����Ѵ��ڵ����Ա���
		webtest.typeAndClear("name=sfkw",title);
		//�������
		webtest.click("name=sch_gbook");
		Thread.sleep(1000);
	}
	@Test(priority = 2,dataProvider = "mmsearchtype",dataProviderClass = NSDataProvider.class)
	public void test_search_by_type(String type) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//�����վ���Թ���
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='��վ���Թ���']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//����ǳ�
		webtest.selectByVisibleText("name=sfid","����");
		Thread.sleep(1000);
		//�����Ѵ��ڵ���������
		webtest.typeAndClear("name=sfkw",type);
		//�������
		webtest.click("name=sch_gbook");
		Thread.sleep(1000);
	}
	@Test(priority = 3,dataProvider = "mmsearchmname",dataProviderClass = NSDataProvider.class)
	public void test_search_by_mname(String mname) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʴ�ظ�
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='��վ���Թ���']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//����ǳ�
		webtest.selectByVisibleText("name=sfid","�ǳ�");
		Thread.sleep(1000);
		//�����Ѵ��ڵ��ʴ�ظ��ǳ�
		webtest.typeAndClear("name=sfkw",mname);
		//�������
		webtest.click("name=sch_gbook");
		Thread.sleep(1000);
	}
	@Test(priority = 4,dataProvider = "searchshow",dataProviderClass = NSDataProvider.class)
	public void test_search_by_show(String show) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//�����վ���Թ���
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='��վ���Թ���']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//�����ʾ
		webtest.selectByVisibleText("name=show",show);
		//�������
		webtest.click("name=sch_gbook");
		Thread.sleep(1000);
	}
	@Test(priority = 5,dataProvider = "searchorder",dataProviderClass = NSDataProvider.class)
	public void test_search_by_order(String order) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʴ�ظ�
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='�ʴ�ظ�']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//�������
		webtest.selectByVisibleText("name=order",order);
		//�������
		webtest.click("name=sch_gbook");
		Thread.sleep(1000);
	}
}
