package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DynamicManagementTest extends BaseTest{
	@Test(priority = 0)
	public void openurl() {
		//打开动态管理界面
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[5]/a[2]");
		//切换到frame
		webtest.enterFrame("adf_main");
		System.out.println("打开动态管理界面成功");
	}
	@Test(priority = 1)
	public void test_delete() {
		//获取随机选取的个数
		int rnum1=(int)(1+Math.random()*(3-1+1));
//		int all=0;
		System.out.println(rnum1);
		for(int i=0;i<rnum1;i++) {
			int rnum2=(int)(1+Math.random()*(2-1+1));
			System.out.println(rnum2);
			boolean a=webtest.isChecked("xpath=/html/body/form[2]/div/table/tbody/tr["+rnum2+"]/td[1]/input");
			if(a==false) {
				webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr["+rnum2+"]/td[1]/input");
//				all++;
			}
		}
		//获取下拉表
		webtest.selectByValue("xpath=//select[@name='fs_do']", "del");
		webtest.click("xpath=//input[@value='执行']");
//		assertEquals(webtest.getText("xpath=/html/body/form[1]/table/tbody/tr/th/span[1]"), all+" 条记录删除成功！");
		System.out.println("删除成功");
	}
	@Test(priority = 2)
	public void test_show() {
		//获取随机选取的个数
		int rnum1=(int)(1+Math.random()*(3-1+1));
//				int all=0;
		System.out.println(rnum1);
		for(int i=0;i<rnum1;i++) {
			int rnum2=(int)(1+Math.random()*(2-1+1));
			System.out.println(rnum2);
			boolean a=webtest.isChecked("xpath=/html/body/form[2]/div/table/tbody/tr["+rnum2+"]/td[1]/input");
			if(a==false) {
				webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr["+rnum2+"]/td[1]/input");
//						all++;
			}
		}
		//获取下拉表
		webtest.selectByValue("xpath=//select[@name='fs_do']", "show");
		webtest.click("xpath=//input[@value='执行']");
//				assertEquals(webtest.getText("xpath=/html/body/form[1]/table/tbody/tr/th/span[1]"), all+" 条记录显示成功！");
		System.out.println("显示成功");
	}
	@Test(priority = 3)
	public void test_hidden() {
		//获取随机选取的个数
		int rnum1=(int)(1+Math.random()*(5-1+1));
//				int all=0;
		System.out.println(rnum1);
		for(int i=0;i<rnum1;i++) {
			int rnum2=(int)(1+Math.random()*(10-1+1));
			System.out.println(rnum2);
			boolean a=webtest.isChecked("xpath=/html/body/form[2]/div/table/tbody/tr["+rnum2+"]/td[1]/input");
			if(a==false) {
				webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr["+rnum2+"]/td[1]/input");
//						all++;
			}
		}
		//获取下拉表
		webtest.selectByValue("xpath=//select[@name='fs_do']", "hidden");
		webtest.click("xpath=//input[@value='执行']");
//				assertEquals(webtest.getText("xpath=/html/body/form[1]/table/tbody/tr/th/span[1]"), all+" 条记录隐藏成功！");
		System.out.println("隐藏成功");
	}
	@Test(priority = 4)
	public void test_clickadd() {
		webtest.click("xpath=//*[@id=\"hnews_add\"]");
		assertEquals(webtest.getText("xpath=/html/body/form/div/table/tbody/tr[1]/td[1]"),"所在栏目");
	}
}
