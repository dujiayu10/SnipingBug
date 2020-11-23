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
		// 登录
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
		webtest.type("id=fm[uname]", ReadProperties.getPropertyValue("back_name"));
		webtest.type("id=fm[upass]", ReadProperties.getPropertyValue("back_pwd"));
		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
		assertTrue(webtest.isTextPresent("主营"));
	}
	
	@Test(priority=1)
	public void test_management() throws InterruptedException {
		//点击出售管理
		webtest.click("xpath=//a[@target='adf_main']");
		webtest.enterFrame("adf_main");
		assertTrue(webtest.isTextPresent("[出售]管理"));
	}
	
//	@Test(priority=2)
//	public void test_update_show() {
//		//点击第一行修改
//		webtest.clicks("xpath=//a[text()='修改']",0);
//		webtest.selectByVisibleText("xpath=//select[@name='fm[show]']", "隐藏");
//		webtest.click("xpath=//input[@name='bsend']");
//		assertEquals(webtest.getAlertTest(), "修改成功！");
//		webtest.alertAccept();
//		webtest.pause(2000);
//		assertEquals(webtest.getText("xpath=//table[@class='table tblist']/tbody/tr[2]/td[4]/span"),"---");
//	}

//	@Test(priority=3,dataProvider = "community_Listings",dataProviderClass = NSDataProvider.class)
//	public void test_update_community_Listings(String s1,String s2,String s3) {
//		//点击第s1行修改关联小区、房源标题
//		webtest.clicks("xpath=//a[text()='修改']",Integer.parseInt(s1));
//		webtest.click("xpath=//input[@value='清空']");
//		webtest.type("id=fm_lpid_refname",s2);
//		webtest.typeAndClear("id=fm[title]", s3);
//		webtest.click("xpath=//input[@value='提交']");
//		assertEquals(webtest.getAlertTest(), "修改成功！");
//		webtest.alertAccept();
//	}
	
//	@Test(priority=4,dataProvider = "img",dataProviderClass = NSDataProvider.class)
//	public void test_upload_img(String f1) throws InterruptedException, IOException {
//		//点击第七行,上传图片
//		webtest.clicks("xpath=//a[text()='修改']",6);
//		webtest.type("xpath=//input[@value='上传']",ReadProperties.getPropertyValue("testphoto_path")+f1);
//		webtest.click("xpath=//input[@value='提交']");
//	}
	
//	@Test(priority=7)
//	public void test_back_last() {
//		String text1=webtest.getText("xpath=//div[@class='pg_bar']/ul/li[1]/a");
//		//到下一页
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
//		//修改当前页为第一页回车
//		webtest.typeAndClear("id=pg_pjump", "1");
//		webtest.enter();
//		webtest.pause(3000);
//		assertTrue(webtest.isDisplayed("xpath=//span[@class='fa fa-fast-backward']"));
//	}

	
	@Test(priority=5)
	public void test_forward_all() {
		//到最后一页
		webtest.click("xpath=//span[@class='fa fa-fast-forward']");
		assertTrue(webtest.isDisplayed("xpath=//span[@class='fa fa-fast-forward']"));
	}
	
	
//	@Test(priority=8)
//	public void test_delete() {
//		//选择前三个删除
//		for(int i=0;i<3;i++) {
//			webtest.clicks("xpath=//input[@class='rdcb']",i);
//		}
//		webtest.selectByValue("name=fs_do","del");
//		webtest.click("xpath=[@value='执行']");
//		assertTrue(webtest.isTextPresent("删除成功"));
//	}
	
//	@Test(priority=9)
//	public void test_hidden() {
//		//全选
//		webtest.click("xpath=//input[@onclick='fmSelAll(this)']");
//		//隐藏
//		webtest.selectByValue("name=fs_do","hidden");
//		webtest.click("xpath=[@value='执行']");
//		assertTrue(webtest.isTextPresent("隐藏成功"));
//	}
//	
//	@Test(priority=10)
//	public void test_show() {
//		//全选
//		webtest.click("xpath=//input[@onclick='fmSelAll(this)']");
//		//显示
//		webtest.selectByValue("name=fs_do","show");
//		webtest.click("xpath=[@value='执行']");
//		assertTrue(webtest.isTextPresent("审核成功"));
//	}
//	
//	@Test(priority=11)
//	public void test_updrels() {
//		//全选
//		webtest.click("xpath=//input[@onclick='fmSelAll(this)']");
//		//更新关联
//		webtest.selectByValue("name=fs_do","updrels");
//		webtest.click("xpath=[@value='执行']");
//		assertTrue(webtest.isTextPresent("更新关联成功"));
//	}
	
	
}
