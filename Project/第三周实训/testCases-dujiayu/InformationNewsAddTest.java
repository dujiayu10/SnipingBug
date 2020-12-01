package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.function.ObjDoubleConsumer;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help.Column;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class InformationNewsAddTest extends BaseTest {
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
	@Test(priority=1,description="�������Ŷ�̬",dataProvider="newsAdd",dataProviderClass=NSDataProvider.class)
	public void test_news_add(String column,String see,String title,String recommend,String text,String row) {
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'���Ŷ�̬')]");
		webtest.enterFrame("adf_main");
		webtest.click("id=news_add");
		webtest.selectByVisibleText("id=fm[catid]",column);
		webtest.selectByVisibleText("name=fm[show]",see);
		webtest.click("xpath=//*[text()='"+see+"']");
		webtest.type("id=fm[title]",title);
		webtest.click("xpath=//*[text()='"+recommend+"']");
//		webtest.enterFrame1("xpath=//div[@class='ke-edit']/iframe");
//		webtest.type("class=ke-content", text);
//		webtest.leaveFrame();
//		webtest.click("xpath=//input[@value='����ѡȡ']");
//		webtest.clicks("class=rdcb",Integer.parseInt(row));
//		webtest.click("id=sel_msg");
		webtest.click("name=bsend");
		String a=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("���ӳɹ���", a);
	}
	@Test(priority=2,description="����ר������",dataProvider="newsAdd",dataProviderClass=NSDataProvider.class)
	public void test_news_add2(String column,String see,String title,String recommend,String text,String row) {
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'ר������')]");
		webtest.enterFrame("adf_main");
		webtest.click("id=news_add");
		webtest.selectByVisibleText("id=fm[catid]",column);
		webtest.selectByVisibleText("name=fm[show]",see);
		webtest.click("xpath=//*[text()='"+see+"']");
		webtest.type("id=fm[title]",title);
		webtest.click("xpath=//*[text()='"+recommend+"']");
//		webtest.enterFrame1("class=ke-edit-iframe");
//		webtest.type("class=ke-content", text);
//		webtest.leaveFrame();
//		webtest.click("xpath=//input[@value='����ѡȡ']");
//		webtest.clicks("class=rdcb",Integer.parseInt(row));
//		webtest.click("id=sel_msg");
		webtest.click("name=bsend");
		String a=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("���ӳɹ���", a);
	}
	@Test(priority=3,description="����վ�����",dataProvider="newsAdd2",dataProviderClass=NSDataProvider.class)
	public void test_news_add3(String column,String see,String title) {
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'վ�����')]");
		webtest.enterFrame("adf_main");
		webtest.click("id=about_add");
		webtest.selectByVisibleText("id=fm[catid]", column);
		webtest.selectByVisibleText("name=fm[show]",see);
		webtest.type("id=fm[title]",title);
		webtest.click("name=bsend");
		String a=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("���ӳɹ���", a);
	}
	@Test(priority=4,description="������������2",dataProvider="newsAdd3",dataProviderClass=NSDataProvider.class)
	public void test_news_add4(String row,String title,String text,String name) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=/html/body/div[3]/div[2]/ul[2]/li[3]/a[1]");
		webtest.enterFrame("adf_main");
		webtest.click("id=trem_add");
		webtest.click("xpath=//input[@value='������Ϣ']");
		webtest.enterFrame1("xpath=//div[@class='modal-body']/iframe");
		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[3]/td[1]/input");
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.typeAndClear("id=fm[title]", title);
		webtest.type("name=fm[detail]",text);
		webtest.type("id=fm[mname]", name);
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[11]/td[2]/input");
		String a=webtest.getAlertTest();
		webtest.alertAccept();
		assertEquals("���ӳɹ���",a);
	}
	@Test (priority=5,description="������������1",dataProvider="newsAdd3",dataProviderClass=NSDataProvider.class)
	public void x(String row,String title,String text,String name) {
		webtest.leaveFrame();
		webtest.click("class=atm_m1info");
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'��������')]");
		webtest.enterFrame("adf_main");
		webtest.click("id=nrem_add");
		webtest.click("xpath=//input[@value='������Ϣ']");
		webtest.enterFrame1("xpath=//div[@class='modal-body']/iframe");
		webtest.clicks("class=rdcb", Integer.parseInt(row));
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.typeAndClear("id=fm[title]", title);
		webtest.type("name=fm[detail]",text);
		webtest.type("id=fm[mname]", name);
		webtest.click("name=bsend");
		String a=webtest.getAlertTest();
		webtest.alertAccept();
		assertEquals("���ӳɹ���",a);
	}
	
}
