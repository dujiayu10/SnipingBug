package com.webtest.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;


public class SaleManagementTest extends BaseTest{
	
	@Test(priority=0)
	public void test_login() throws InterruptedException, IOException {
		// ��¼
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
		webtest.type("id=fm[uname]", ReadProperties.getPropertyValue("back_name"));
		webtest.type("id=fm[upass]", ReadProperties.getPropertyValue("back_pwd"));
		webtest.type("xpath=//input[@placeholder='��֤��']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("��Ӫ"));
	}
	
	@Test(priority=1)
	public void test_management() throws InterruptedException {
		//������۹���
		webtest.click("xpath=//a[@target='adf_main']");
		webtest.enterFrame("adf_main");
		assertTrue(webtest.isTextPresent("[����]����"));
	}
	
//	@Test(priority=2)
//	public void test_update_show() {
//		//�����һ���޸�
//		webtest.clicks("xpath=//a[text()='�޸�']",0);
//		webtest.selectByVisibleText("xpath=//select[@name='fm[show]']", "����");
//		webtest.click("xpath=//input[@name='bsend']");
//		assertEquals(webtest.getAlertTest(), "�޸ĳɹ���");
//		webtest.alertAccept();
//		webtest.pause(2000);
//		assertEquals(webtest.getText("xpath=//table[@class='table tblist']/tbody/tr[2]/td[4]/span"),"---");
//	}

//	@Test(priority=3,dataProvider = "community_Listings",dataProviderClass = NSDataProvider.class)
//	public void test_update_community_Listings(String s1,String s2,String s3) {
//		//�����s1���޸Ĺ���С������Դ����
//		webtest.clicks("xpath=//a[text()='�޸�']",Integer.parseInt(s1));
//		webtest.click("xpath=//input[@value='���']");
//		webtest.type("id=fm_lpid_refname",s2);
//		webtest.typeAndClear("id=fm[title]", s3);
//		webtest.click("xpath=//input[@value='�ύ']");
//		assertEquals(webtest.getAlertTest(), "�޸ĳɹ���");
//		webtest.alertAccept();
//	}
	
//	@Test(priority=4,dataProvider = "img",dataProviderClass = NSDataProvider.class)
//	public void test_upload_img(String f1) throws InterruptedException, IOException {
//		//���������,�ϴ�ͼƬ
//		webtest.clicks("xpath=//a[text()='�޸�']",6);
//		webtest.type("xpath=//input[@value='�ϴ�']",ReadProperties.getPropertyValue("testphoto_path")+f1);
//		webtest.click("xpath=//input[@value='�ύ']");
//	}
	
//	@Test(priority=7)
//	public void test_back_last() {
//		String text1=webtest.getText("xpath=//div[@class='pg_bar']/ul/li[1]/a");
//		//����һҳ
//		webtest.click("xpath=//div[@class=pg_bar]/ul/li[5]/a");
//		String text2=webtest.getText("xpath=//div[@class='pg_bar']/ul/li[1]/a");
//		System.out.println(text1+"---"+text2);
//		boolean isSame=text1.equals(text2);
//		System.out.println(isSame);
//		assertEquals(false,isSame);
//		
//	}
	
//	@Test(priority=6)
//	public void test_pages() {
//		//�޸ĵ�ǰҳΪ��һҳ�س�
//		webtest.typeAndClear("id=pg_pjump", "1");
//		webtest.enter();
//		webtest.pause(3000);
//		assertTrue(webtest.isDisplayed("xpath=//span[@class='fa fa-fast-backward']"));
//	}

	
	@Test(priority=5)
	public void test_forward_all() {
		//�����һҳ
		webtest.click("xpath=//span[@class='fa fa-fast-forward']");
		assertTrue(webtest.isDisplayed("xpath=//span[@class='fa fa-fast-forward']"));
	}
	
	
//	@Test(priority=8)
//	public void test_delete() {
//		//ѡ��ǰ����ɾ��
//		for(int i=0;i<3;i++) {
//			webtest.clicks("xpath=//input[@class='rdcb']",i);
//		}
//		webtest.selectByValue("name=fs_do","del");
//		webtest.click("xpath=[@value='ִ��']");
//		assertTrue(webtest.isTextPresent("ɾ���ɹ�"));
//	}
	
//	@Test(priority=9)
//	public void test_hidden() {
//		//ȫѡ
//		webtest.click("xpath=//input[@onclick='fmSelAll(this)']");
//		//����
//		webtest.selectByValue("name=fs_do","hidden");
//		webtest.click("xpath=[@value='ִ��']");
//		assertTrue(webtest.isTextPresent("���سɹ�"));
//	}
//	
//	@Test(priority=10)
//	public void test_show() {
//		//ȫѡ
//		webtest.click("xpath=//input[@onclick='fmSelAll(this)']");
//		//��ʾ
//		webtest.selectByValue("name=fs_do","show");
//		webtest.click("xpath=[@value='ִ��']");
//		assertTrue(webtest.isTextPresent("��˳ɹ�"));
//	}
//	
//	@Test(priority=11)
//	public void test_updrels() {
//		//ȫѡ
//		webtest.click("xpath=//input[@onclick='fmSelAll(this)']");
//		//���¹���
//		webtest.selectByValue("name=fs_do","updrels");
//		webtest.click("xpath=[@value='ִ��']");
//		assertTrue(webtest.isTextPresent("���¹����ɹ�"));
//	}
	
	
}
