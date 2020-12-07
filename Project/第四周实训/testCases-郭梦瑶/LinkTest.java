package com.webtest.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * 
 * ǰ̨-¥��-��Ҫ��ť--gmy
 * */
public class LinkTest extends Front_Login{
	//���¥�̶�̬�������ӣ����Ƿ���ת
	@Test
	public void test_developmentslink() throws InterruptedException, IOException{	
		//���¥��
		webtest.click("xpath=//*[text()='¥��']");
		Thread.sleep(1000);
		//�����n��������Ϣ
		webtest.sclick("class=img-thumbnail", "1");
		Thread.sleep(3000);
		String develop=webtest.getText("class=navbar-brand");
		//�����n��������Ϣ��¥�̶�̬�ĸ�����Ϣ
		webtest.click("xpath=/html/body/div/div[3]/div[1]/h3[1]/a");
		Thread.sleep(3000);
		//�ж�ҳ���Ƿ���ת
		assertTrue(webtest.isTextPresent(develop+" ¥�̶�̬"));
	}
	//���¥�̻��͸������ӣ����Ƿ���ת
	@Test
	public void test_housetypelink() throws InterruptedException, IOException{	
		//���¥��
		webtest.click("xpath=//*[text()='¥��']");
		Thread.sleep(1000);
		//�����n��������Ϣ
		webtest.sclick("class=img-thumbnail", "2");
		Thread.sleep(3000);
		//�����n��������Ϣ��¥�̻��͵ĸ�����Ϣ
		webtest.click("xpath=/html/body/div/div[3]/div[1]/h3[2]/a");
		Thread.sleep(3000);
		//�ж�ҳ���Ƿ���ת
		assertTrue(webtest.isTextPresent("����ɸѡ"));
	}
	//������۷��������ӣ����Ƿ���ת
	@Test
	public void test_houseforsale() throws InterruptedException, IOException{	
		//���¥��
		webtest.click("xpath=//*[text()='¥��']");
		Thread.sleep(1000);
		//�����n��������Ϣ
		webtest.sclick("class=img-thumbnail", "3");
		Thread.sleep(3000);
		String develop=webtest.getText("class=navbar-brand");
		//�����n��������Ϣ�ĳ��۷��ĸ�����Ϣ
		webtest.click("xpath=/html/body/div/div[6]/div[1]/h3/a");
		Thread.sleep(3000);
		//�ж�ҳ���Ƿ���ת
		assertTrue(webtest.isTextPresent(develop+" ¥�� �ĳ��۷�"));
	}
	//������ⷿ�������ӣ����Ƿ���ת
	@Test
	public void test_houseforrent() throws InterruptedException, IOException{	
		//���¥��
		webtest.click("xpath=//*[text()='¥��']");
		Thread.sleep(1000);
		//�����n��������Ϣ
		webtest.sclick("class=img-thumbnail", "0");
		Thread.sleep(3000);
		String develop=webtest.getText("class=navbar-brand");
		//�����n��������Ϣ�ĳ��ⷿ�ĸ�����Ϣ
		webtest.click("xpath=/html/body/div/div[6]/div[2]/h3/a");
		Thread.sleep(3000);
		//�ж�ҳ���Ƿ���ת
		assertTrue(webtest.isTextPresent(develop+" ¥�� �ĳ��ⷿ"));
	}
}
