package com.webtest.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class InformationNewsTakeTest extends BaseTest {
	@BeforeClass
	public  void login() throws InterruptedException, IOException {	
		//��¼
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("usname"));
		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("upasswd"));
		webtest.type("xpath=//*[@placeholder='��֤��']",ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("��Ӫ"));
	}
	@Test(priority=1,description="վ����ܵ���������ɾ��")
	public void test_news_delete() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'վ�����')]");
		webtest.enterFrame("adf_main");
		webtest.clicks("class=rdcb",1);
		webtest.selectByVisibleText("name=fs_do","ɾ��");
		webtest.click("name=bsend");
		assertTrue(webtest.isTextPresent("�ɹ�"));
	}
	@Test(priority=2,description="վ����ܵ�����������ʾ")
	public void test_news_see() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'վ�����')]");
		webtest.enterFrame("adf_main");
		webtest.clicks("class=rdcb",1);
		webtest.clicks("class=rdcb",2);
		webtest.clicks("class=rdcb",3);
		webtest.selectByVisibleText("name=fs_do", "��ʾ");
		webtest.click("name=bsend");
		assertTrue(webtest.isTextPresent("�ɹ�"));
	}
	@Test(priority=3,description="վ����ܵ�������������")
	public void test_news_hide() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'վ�����')]");
		webtest.enterFrame("adf_main");
		webtest.clicks("class=rdcb",1);
		webtest.clicks("class=rdcb",2);
		webtest.clicks("class=rdcb",3);
		webtest.selectByVisibleText("name=fs_do", "����");
		webtest.click("name=bsend");
		assertTrue(webtest.isTextPresent("�ɹ�"));
	}
	@Test(priority=4)
	public void test_select_column() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
//		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'���Ŷ�̬')]");
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=stype", "��Ʒ����");
		webtest.click("name=sch_news");
		assertTrue(webtest.isTextPresent("��Ʒ����")||webtest.isTextPresent("������"));
	}
	@Test(priority=5)
	public void test_select_class() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
//		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'���Ŷ�̬')]");
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=sfid", "����");
		webtest.selectByVisibleText("name=sfop", "like%");
		webtest.type("name=sfkw", "����");
		webtest.click("name=sch_news");
		assertTrue(webtest.isTextPresent("����")||webtest.isTextPresent("������"));
	}
	@Test(priority=6)
	public void test_select_show() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
//		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'���Ŷ�̬')]");
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=show","��ʾ");
		webtest.click("name=sch_news");
		assertTrue(webtest.isTextPresent("��ʾ")||webtest.isTextPresent("������"));
	}
	@Test(priority=7)
	public void test_select_order() {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
//		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'���Ŷ�̬')]");
		webtest.enterFrame("adf_main");
		webtest.selectByVisibleText("name=order", "���ʱ��");
		webtest.click("name=sch_news");
		assertTrue(webtest.isTextPresent("���ʱ��"));
	}
}
