package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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
		System.out.println("打开户型管理增加资料界面成功");
	}
	@Test(priority = 1)
	public void test_column1() {
		//请选择
		String[] arr= {"h1012","h1016","h1018",""};
		int rnum=(int)(Math.random()*(4-1+1));
		System.out.println(arr[rnum]);
		webtest.selectByValue("xpath=//*[@id=\"fm[catid]\"]", arr[rnum]);
		assertEquals(webtest.getClass("xpath=//*[@id=\"fm[catid]\"]"), "w150");
	}
	@Test(priority = 2)
	public void test_column2() {
		//显示
		String[] arr= {"1","0",""};
		int rnum=(int)(Math.random()*(3-1+1));
		System.out.println(arr[rnum]);
		webtest.selectByValue("xpath=/html/body/form/div/table/tbody/tr[1]/td[2]/select[2]", arr[rnum]);
		assertEquals(webtest.getClass("xpath=/html/body/form/div/table/tbody/tr[1]/td[2]/select[2]"), "w80");
	}
	@Test(priority = 3)
	public void test_choosemessage_search1() throws InterruptedException {
		//打开资料选取
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//切换到frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("打开资料选取成功");
		//栏目 楼盘
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[1]", "lp");
		//点击搜索
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("楼盘"));
		
	}
	@Test(priority = 4)
	public void test_choosemessage_search2() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//打开资料选取
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//切换到frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("打开资料选取成功");
		//栏目 小区
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[1]", "xq");
		//点击搜索
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("小区"));
		
	}
	@Test(priority = 5)
	public void test_choosemessage_search3() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//打开资料选取
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//切换到frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("打开资料选取成功");
		//排序 添加时间（降序）
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "atime");
		//点击搜索
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("楼盘名称"));
		
	}
	@Test(priority = 6)
	public void test_choosemessage_search4() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//打开资料选取
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//切换到frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("打开资料选取成功");
		//排序 修改
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "etime");
		//点击搜索
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("楼盘名称"));
		
	}
	@Test(priority = 7)
	public void test_choosemessage_search5() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//打开资料选取
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//切换到frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("打开资料选取成功");
		//排序 点击次数
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "click");
		//点击搜索
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("楼盘名称"));
		
	}
	@Test(priority = 8)
	public void test_choosemessage_search6() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//打开资料选取
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//切换到frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("打开资料选取成功");
		//排序 点击次数
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "click");
		//点击搜索
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("楼盘名称"));
		
	}
	@Test(priority = 9)
	public void test_choosemessage_search7() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//打开资料选取
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//切换到frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("打开资料选取成功");
		//排序 点击次数 升
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "click-a");
		//点击搜索
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("楼盘名称"));
		
	}
	@Test(priority = 10)
	public void test_choosemessage_search8() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//打开资料选取
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//切换到frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("打开资料选取成功");
		//排序 添加时间 升
		webtest.getSelect("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]").selectByValue("atime-a");
		//点击搜索
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("楼盘名称"));
	}
	@Test(priority = 11)
	public void test_choosemessage_click() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//打开资料选取
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//进入frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		//获取选择信息
		String mString=webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[3]/a");
		//选择资料
		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[1]/input");
		assertTrue(webtest.isTextPresent(mString));
	}
	@Test(priority = 12)
	public void test_platformcode() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.type("xpath=//*[@id=\"fm[exid]\"]", "0123");
	}
	@Test(priority = 13)
	public void test_sign() {
		webtest.type("xpath=//*[@id=\"fm[aflag]\"]", "0123");
	}
	@Test(priority = 14)
	public void test_changecolor() {
		//点击改变颜色
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[5]/td[2]/span[1]");
		//进入frame
		webtest.enterFrame("fm_color__win");
		//选择颜色
		webtest.click("xpath=/html/body/table/tbody/tr[1]/td/table/tbody/tr[11]/td[12]");
		//确定
		webtest.click("xpath=/html/body/table/tbody/tr[3]/td/table/tbody/tr/td[3]/button[1]");
	}
//	@Test(priority = 15)
//	public void test_checkname1() {
//		//点击检查
//		webtest.click("xpath=//*[@id=\"fm_repeat_ndb_repeat\"]");
//		assertTrue(webtest.isTextPresent("该资料未重复!"));
//	}
//	@Test(priority = 16)
//	public void test_checkname2() {
//		//输入空格
//		webtest.typeAndClear("xpath=//*[@id=\"fm[title]\"]", " ");
//		//点击检查
//		webtest.click("xpath=//*[@id=\"fm_repeat_ndb_repeat\"]");
//		assertTrue(webtest.isTextPresent("参数错误!"));
//	}
//	@Test(priority = 17)
//	public void test_checkname3() {
//		//不输入
//		webtest.typeAndClear("xpath=//*[@id=\"fm[title]\"]", "");
//		//点击检查
//		webtest.click("xpath=//*[@id=\"fm_repeat_ndb_repeat\"]");
//		assertTrue(webtest.isTextPresent("参数错误!"));
//	}
	@Test(priority = 18)
	public void test_add() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.typeAndClear("xpath=//*[@id=\"fm[hxs]\"]", "3室2厅1卫1厨1阳");
		webtest.typeAndClear("xpath=//*[@id=\"fm[mjout]\"]", "100");
		webtest.typeAndClear("xpath=//*[@id=\"fm[mjin]\"]", "200");
		webtest.typeAndClear("xpath=//*[@id=\"fm[price]\"]", "5000");
		webtest.typeAndClear("xpath=//*[@id=\"fm[pall]\"]", "500000");
		webtest.typeAndClear("xpath=//*[@id=\"fm[sotags]\"]", "地大");
		webtest.typeAndClear("xpath=//*[@id=\"fm[remark]\"]", "采光良好");
	}
	@Test(priority = 19)
	public void test_Salesstatus1() {
		String[] arr= {"1","2","3","4",""};
		int rnum=(int)(Math.random()*(5-1+1));
		webtest.selectByValue("xpath=//*[@id=\"fm[sales]\"]", arr[rnum]);
	}
	@Test(priority = 20)
	public void test_Salesstatus2() {
		String[] arr= {"x12","x16","x20","x24","x28","x32","x36","x40","x44","x48",""};
		int rnum=(int)(Math.random()*(11-1+1));
		webtest.selectByValue("xpath=//*[@id=\"fm[cxtype]\"]", arr[rnum]);
	}
	@Test(priority = 21)
	public void test_files1() throws InterruptedException {
		//选择一个不符合格式的文件
		webtest.type("xpath=//*[@id=\"fm_mpic_f\"]", "D:\\教师资格证（B站账号广东中公教育官方）.zip");
		Thread.sleep(3000);
		assertEquals(webtest.getClass("xpath=//*[@id=\"fm_mpic_\"]"), "file");
	}
	@Test(priority = 23)
	public void test_files2() throws InterruptedException {
		Thread.sleep(3000);
		//清空
		webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[11]/td[2]/input[5]");
		Thread.sleep(3000);
		assertEquals(webtest.getClass("xpath=//*[@id=\"fm_mpic_\"]"), "file");
	}
	@Test(priority = 24)
	public void test_files3() throws InterruptedException {
		Thread.sleep(3000);
		//选择一个符合格式的文件
		webtest.type("xpath=//*[@id=\"fm_mpic_f\"]", "D:\\壁纸.jpg");
		assertEquals(webtest.getClass("xpath=//*[@id=\"fm_mpic_\"]"), "file");
	}
	@Test(priority = 25)
	public void test_submit() {
		//点击提交
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[18]/td[2]/input");
		assertEquals(webtest.getAlertTest(), "增加成功!");
		webtest.alertAccept();
	}
}
