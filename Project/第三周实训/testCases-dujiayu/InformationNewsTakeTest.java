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
	@Test(priority=1,description="վ����ܵ���������ɾ��",dataProvider="newsTake",dataProviderClass=NSDataProvider.class)
	public void test_news_delete(String row1,String row2,String row3) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'վ�����')]");
		webtest.enterFrame("adf_main");
		webtest.clicks("class=rdcb",Integer.parseInt(row1));
//		webtest.clicks("class=rdcb",Integer.parseInt(row2));
//		webtest.clicks("class=rdcb",Integer.parseInt(row3));
		webtest.selectByVisibleText("name=fs_do","ɾ��");
		webtest.click("name=bsend");
		assertTrue(webtest.isTextPresent("�ɹ�"));
	}
	@Test(priority=2,description="վ����ܵ�����������ʾ",dataProvider="newsTake",dataProviderClass=NSDataProvider.class)
	public void test_news_see(String row1,String row2,String row3) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'վ�����')]");
		webtest.enterFrame("adf_main");
		webtest.clicks("class=rdcb",Integer.parseInt(row1));
		webtest.clicks("class=rdcb",Integer.parseInt(row2));
		webtest.clicks("class=rdcb",Integer.parseInt(row3));
		webtest.selectByVisibleText("name=fs_do", "��ʾ");
		webtest.click("name=bsend");
		assertTrue(webtest.isTextPresent("�ɹ�"));
	}
	@Test(priority=3,description="վ����ܵ�������������",dataProvider="newsTake",dataProviderClass=NSDataProvider.class)
	public void test_news_hide(String row1,String row2,String row3) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'վ�����')]");
		webtest.enterFrame("adf_main");
		webtest.clicks("class=rdcb",Integer.parseInt(row1));
		webtest.clicks("class=rdcb",Integer.parseInt(row2));
		webtest.clicks("class=rdcb",Integer.parseInt(row3));
		webtest.selectByVisibleText("name=fs_do", "����");
		webtest.click("name=bsend");
		assertTrue(webtest.isTextPresent("�ɹ�"));
	}
}
