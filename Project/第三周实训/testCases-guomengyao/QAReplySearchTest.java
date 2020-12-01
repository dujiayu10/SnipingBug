package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import javax.management.relation.Relation;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * ����-�ʴ�ظ�-����
 * 
 * 
 * */
public class QAReplySearchTest extends LoginTest{
	@Test(priority = 1,dataProvider = "qarsearchtit",dataProviderClass = NSDataProvider.class)
	public void test_search_by_title(String title) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʴ�ظ�
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='�ʴ�ظ�']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//�������
		webtest.selectByVisibleText("name=sfid","����");
		Thread.sleep(1000);
		//�����Ѵ��ڵ��ʴ�ظ�����
		webtest.typeAndClear("name=sfkw",title);
		//�������
		webtest.click("name=sch_qarep");
		Thread.sleep(1000);
	}
	@Test(priority = 2,dataProvider = "qarsearchmname",dataProviderClass = NSDataProvider.class)
	public void test_search_by_mname(String mname) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʴ�ظ�
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='�ʴ�ظ�']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//����ǳ�
		webtest.selectByVisibleText("name=sfid","�ǳ�");
		Thread.sleep(1000);
		//�����Ѵ��ڵ��ʴ�ظ��ǳ�
		webtest.typeAndClear("name=sfkw",mname);
		//�������
		webtest.click("name=sch_qarep");
		Thread.sleep(1000);
	}
	@Test(priority = 3,dataProvider = "searchshow",dataProviderClass = NSDataProvider.class)
	public void test_search_by_show(String show) throws InterruptedException {
		//�������
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//����ʴ�ظ�
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='�ʴ�ظ�']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		//�����ʾ
		webtest.selectByVisibleText("name=show",show);
		//�������
		webtest.click("name=sch_qarep");
		Thread.sleep(1000);
	}
	@Test(priority = 4,dataProvider = "searchorder",dataProviderClass = NSDataProvider.class)
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
		webtest.click("name=sch_qarep");
		Thread.sleep(1000);
	}
}
