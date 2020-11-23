package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class BatchOperationAddTest extends BaseTest{
	@Test(priority = 0)
	public void openUrl() {
		//打开户型管理界面
		webtest.click("xpath=//*[@id=\"left_m3hxdt\"]/a[1]");
		//切换到frame
		webtest.enterFrame("adf_main");
		//打开增加资料界面
		webtest.click("xpath=//*[@id=\"huxing_add\"]");
		//切换到frame
		System.out.println("打开户型管理增加资料界面成功");
	}
//	@Test(priority = 1)
//	public void test_column1() {
//		//请选择
//		String[] arr= {"h1012","h1016","h1018",""};
//		int rnum=(int)(1+Math.random()*(4-1+1));
//		System.out.println(arr[rnum]);
//		webtest.selectByValue("xpath=//*[@id=\"fm[catid]\"]", arr[rnum]);
//		assertEquals(webtest.getClass("xpath=//*[@id=\"fm[catid]\"]"), "w150");
//	}
//	@Test(priority = 2)
//	public void test_column2() {
//		//显示
//		String[] arr= {"","1","0"};
//		int rnum=(int)(1+Math.random()*(3-1+1));
//		System.out.println(arr[rnum]);
//		webtest.selectByValue("xpath=/html/body/form/div/table/tbody/tr[1]/td[2]/select[2]", arr[rnum]);
//		assertEquals(webtest.getClass("xpath=/html/body/form/div/table/tbody/tr[1]/td[2]/select[2]"), "w80");
//	}
	@Test(priority = 3)
	public void test_choosemessage_search1() {
		//打开资料选取
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//切换到frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("打开资料选取成功");
		//栏目 楼盘
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[1]", "lp");
		//点击搜索
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[2]"), "楼盘");
		//离开frame
		webtest.leaveFrame();
		//关闭资料选取
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
	}
//	@Test(priority = 4)
//	public void test_choosemessage_search2() {
//		//打开资料选取
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//切换到frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("打开资料选取成功");
//		//栏目 小区
//		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[1]", "xq");
//		//点击搜索
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[2]"), "小区");
//		//关闭资料选取
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
//	@Test(priority = 5)
//	public void test_choosemessage_search3() {
//		//打开资料选取
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//切换到frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("打开资料选取成功");
//		//排序 添加时间（降序）
//		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "atime");
//		//点击搜索
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[1]/th[3]"), "楼盘名称");
//		//关闭资料选取
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
//	@Test(priority = 6)
//	public void test_choosemessage_search4() {
//		//打开资料选取
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//切换到frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("打开资料选取成功");
//		//排序 修改
//		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "etime");
//		//点击搜索
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[1]/th[3]"), "楼盘名称");
//		//关闭资料选取
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
//	@Test(priority = 7)
//	public void test_choosemessage_search5() {
//		//打开资料选取
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//切换到frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("打开资料选取成功");
//		//排序 点击次数
//		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "click");
//		//点击搜索
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[1]/th[3]"), "楼盘名称");
//		//关闭资料选取
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
//	@Test(priority = 8)
//	public void test_choosemessage_search6() {
//		//打开资料选取
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//切换到frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("打开资料选取成功");
//		//排序 点击次数
//		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "click");
//		//点击搜索
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[1]/th[3]"), "楼盘名称");
//		//关闭资料选取
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
//	@Test(priority = 9)
//	public void test_choosemessage_search7() {
//		//打开资料选取
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//切换到frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("打开资料选取成功");
//		//排序 点击次数 升
//		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "click-a");
//		//点击搜索
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		//关闭资料选取
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[1]/th[3]"), "楼盘名称");
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
//	@Test(priority = 10)
//	public void test_choosemessage_search8() {
//		//打开资料选取
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//切换到frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("打开资料选取成功");
//		//排序 添加时间 升
//		webtest.getSelect("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]").selectByValue("atime-a");
//		//点击搜索
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[1]/th[3]"), "楼盘名称");
//		//关闭资料选取
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
}
