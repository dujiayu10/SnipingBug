package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AdministratorsTest extends BaseTest{
	@Test(priority = 0)
	public void test_openurl() {
		//打开架设
		webtest.click("xpath=/html/body/div[2]/a[6]");
		//打开管理员
		webtest.click("xpath=//*[@id=\"left_m3auser\"]/a[1]");
		//进入frame
		webtest.enterFrame("adf_main");
		System.out.println("进入成功");
	}
	@Test(priority = 1)
	public void test_group1() {
		//获取选中条目
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//选择删除
		webtest.selectByValue("xpath=//select[@name='fs_do']", "del");
		//点击执行
		webtest.click("xpath=//input[@name='bsend']");
	}
	@Test(priority = 2)
	public void test_group2() throws InterruptedException {
		Thread.sleep(2000);
		//获取选中条目
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//选择显示
		webtest.selectByValue("xpath=//select[@name='fs_do']", "show");
		//点击执行
		webtest.click("xpath=//input[@name='bsend']");
	}
	@Test(priority = 3)
	public void test_group3() throws InterruptedException {
		Thread.sleep(2000);
		//获取选中条目
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[1]/input");
		//选择隐藏
		webtest.selectByValue("xpath=//select[@name='fs_do']", "hidden");
		//点击执行
		webtest.click("xpath=//input[@name='bsend']");
	}
	@Test(priority = 4)
	public void test_search() {
		webtest.selectByValue("xpath=//select[@name='stype']", "supper");
		webtest.selectByValue("xpath=//select[@name='sfid']", "miuid");
		webtest.selectByValue("xpath=//select[@name='sfop']", "eq");
		webtest.type("xpath=//input[@name='sfkw']", "80893510126");
		webtest.selectByValue("xpath=//select[@name='show']", "s1");
		webtest.selectByValue("xpath=//select[@name='order']", "atime");
		webtest.click("xpath=//input[@name='sch_adminer']");
		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[2]/a"), "jjq_16");
	}
	@Test(priority = 5)
	public void test_add1() throws InterruptedException {
		webtest.click("xpath=//*[@id=\"adminer_add\"]");
		webtest.type("xpath=//input[@id='fm[upass]']", "1234567");
		webtest.selectByValue("xpath=//select[@id='fm[grade]']", "ainfo");
		webtest.selectByValue("xpath=//select[@id='fm[show]']", "1");
	}
	@Test(priority = 6)
	public void test_add2() {
		//详细资料
		webtest.type("xpath=//*[@id=\"fm[mname]\"]", "jjq");
		webtest.selectByValue("xpath=//*[@id=\"fm[indep]\"]", "inadm");
		webtest.type("xpath=//*[@id=\"fm[miuid]\"]", "1031409663");
		webtest.type("xpath=//*[@id=\"fm[mtel]\"]", "13932838892");
		webtest.type("xpath=//*[@id=\"fm[memail]\"]", "1031409663@qq.com");
		webtest.type("xpath=//*[@id=\"fm[maddr]\"]", "河北师范大学");
		webtest.click("xpath=//input[@name='bsend']");
		webtest.alertAccept();
		assertEquals(webtest.getAlertTest(), "增加成功！");
		
	}
}
