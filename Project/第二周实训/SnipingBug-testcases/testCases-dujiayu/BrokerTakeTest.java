package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class BrokerTakeTest extends BaseTest {
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
	//�������ܣ���Ա�ȼ���
		@Test(priority=5)
		public void test_add_successselect1() {
			webtest.click("xpath=//a[contains(text(),'������')]");
			webtest.enterFrame("adf_main");
			webtest.click("name=stype");
			webtest.click("xpath=//*[text()='������Ա']");
			webtest.click("name=sch_inmem");
			assertTrue(webtest.isTextPresent("������Ա")||webtest.isTextPresent("�����ϣ�"));
		}
//		�������ܣ���ʾ�����أ�
		@Test(priority=6)
		public void test_add_successselect2() {
			webtest.click("xpath=//a[contains(text(),'������')]");
			webtest.enterFrame("adf_main");
			webtest.click("name=show");
			webtest.click("xpath=//*[text()='����']");
			webtest.click("name=sch_inmem");
			assertTrue(webtest.isTextPresent("����")||webtest.isTextPresent("�����ϣ�"));
		}
//		�������ܣ�����ɸѡ��
		@Test(priority=7,dataProvider="selectName",dataProviderClass=NSDataProvider.class)
		public void test_add_successselect3(String type,String name) {
//			webtest.click("xpath=//a[contains(text(),'������')]");
//			webtest.enterFrame("adf_main");
			webtest.click("name=sfop");
			webtest.click("xpath=//*[text()='"+type+"']");
			webtest.type("name=sfkw", name);
			webtest.click("name=sch_inmem");
			assertTrue(webtest.isTextPresent(name)||webtest.isTextPresent("�����ϣ�"));
		}
//		��������-ɾ��
		@Test(priority=8,dataProvider="manytake",dataProviderClass=NSDataProvider.class)
		public void test_delete_many(String index,String index2) {
			webtest.leaveFrame();
			webtest.click("xpath=//a[contains(text(),'������')]");
			webtest.enterFrame("adf_main");
			webtest.clicks("class=rdcb",Integer.parseInt(index));
			webtest.clicks("class=rdcb",Integer.parseInt(index2));
			webtest.click("name=fs_do");
			webtest.click("xpath=//*[text()='ɾ��']");
			webtest.click("name=bsend");
			assertTrue(webtest.isTextPresent("ɾ���ɹ���"));
		}
		//��������-����
		@Test(priority=9,dataProvider="manytake",dataProviderClass=NSDataProvider.class)
		public void test__many(String index,String index2) {
			webtest.leaveFrame();
			webtest.click("xpath=//a[contains(text(),'������')]");
			webtest.enterFrame("adf_main");
			webtest.clicks("class=rdcb",Integer.parseInt(index));
			webtest.clicks("class=rdcb",Integer.parseInt(index2));
			webtest.selectByVisibleText("name=fs_do", "����");
			webtest.click("name=bsend");
			assertTrue(webtest.isTextPresent("���سɹ���"));
		}
		//��������-��ʾ
		@Test(priority=10,dataProvider="manytake",dataProviderClass=NSDataProvider.class)
		public void test__many_see(String index,String index2) {
//			webtest.leaveFrame();
//			webtest.click("xpath=//a[contains(text(),'������')]");
//			webtest.enterFrame("adf_main");
			webtest.clicks("class=rdcb",Integer.parseInt(index));
			webtest.clicks("class=rdcb", Integer.parseInt(index2));
			webtest.selectByVisibleText("name=fs_do", "��ʾ");
			webtest.click("name=bsend");
			assertTrue(webtest.isTextPresent("��˳ɹ���"));
		}
		//�޸�
		@Test(priority=11)
		public void test__many_editor() {
//			webtest.leaveFrame();
//			webtest.click("xpath=//a[contains(text(),'������')]");
//			webtest.enterFrame("adf_main");
			webtest.click("xpath=//a[contains(text(),'�޸�')]");
			webtest.type("id=fm[mname]", "-�޸�");
			webtest.click("xpath=//input[@value='�ύ']");
			String a=webtest.getAlertTest();
			webtest.alertAccept();
			webtest.leaveFrame();
			assertEquals("�޸ĳɹ���",a);
		}
}
