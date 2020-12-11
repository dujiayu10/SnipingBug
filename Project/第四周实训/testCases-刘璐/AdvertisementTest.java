package com.webtest.testCasesLL;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;
//刘璐
//模块：广告
public class AdvertisementTest extends BaseTest{
	
	@Test(priority = 1)
	public  void test_login() throws InterruptedException, IOException {	
		//登录
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		Thread.sleep(2000);
				
		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("usname"));
		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("upasswd"));
		webtest.type("xpath=//input[@placeholder='认证码']",ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
			
	}
	
	@Test(priority = 2,dataProvider="HomePageAdsAdd_success",dataProviderClass=NSDataProvider.class)
	public void test_add_homepageadd_success(String pid,String  value,String title,String detail,String click) throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		webtest.click("class=atm_m1adv");
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='首页广告']"));
		list.get(2).click();
		Thread.sleep(2000);
		webtest.enterFrame("adf_main");
		webtest.click("id=adblock_add");
//		来源资料 文字
		webtest.type("id=fm[pid]", pid);
//		来源资料select  
		webtest.selectByValue("id=fm[pmod]",value);
//		标题
		webtest.type("id=fm[title]", title);

		webtest.type("id=fm[detail]", detail);
//		url地址
//		webtest.type("id=fm[url]", url);
//		点击次数
		webtest.type("id=fm[click]", click);
		webtest.click("name=bsend");
		String a = webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("增加成功！", a);	
	}
	
	@Test(priority = 3,dataProvider="HomePageAdsAdd_fail",dataProviderClass=NSDataProvider.class)
	public void test_add_homepageadd_fail(String pid,String  value,String title,String detail,String click) throws InterruptedException {
		Thread.sleep(2000);
		webtest.click("class=atm_m1adv");
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='首页广告']"));
		list.get(2).click();
		Thread.sleep(2000);
		webtest.enterFrame("adf_main");
		webtest.click("id=adblock_add");
//		来源资料 文字
		webtest.type("id=fm[pid]", pid);
//		来源资料select  
		webtest.selectByValue("id=fm[pmod]",value);
//		标题
		webtest.type("id=fm[title]", title);

		webtest.type("id=fm[detail]", detail);
//		点击次数
		webtest.type("id=fm[click]", click);
		webtest.click("name=bsend");
		String a = webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();	
		assertNotEquals(a, "增加成功！");
	}
	
	@Test(priority = 4,dataProvider="HomePageAdsSearch",dataProviderClass=NSDataProvider.class)
	public void test_homepageads_search(String value1,String value2,String value3,String value4,String value5,String value6) throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		webtest.click("class=atm_m1adv");
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='[回收站]']"));
		list.get(2).click();
		webtest.enterFrame("adf_main");
//		webtest.click("id=adblock_add");
//		9种  " "   "abhom" "abfoot0" "abhead0" "abside1" "abside2" "abinn" "a2012" "a2014" "abdel"
		webtest.selectByValue("name=stype", value1);
//		5种 "title" "color" "url" "aip" "eip"
		webtest.selectByValue("name=sfid", value2);
//		5种 "like%" "%like%" "%like" "=" "IN"
		webtest.selectByValue("name=sfop", value3);
		
		webtest.type("name=sfkw", value4);
//		2种"s1" "s0"
		webtest.selectByValue("name=show", value5);
//		4种 "atime" "etime" "aid" "aid-a"
		webtest.selectByValue("name=order", value6);
		webtest.click("name=sch_adblock");
		webtest.leaveFrame();
	}
	
	@Test(priority = 5)
	public void test_push() throws InterruptedException {
		webtest.click("class=atm_m1adv");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='内页推送']");
		webtest.enterFrame("adf_main");
		List<WebElement> list = driver.findElements(By.tagName("tr"));
		list.get(2).findElement(By.xpath("//a[text()='推送']")).click();
		webtest.enterFrame("layui-layer-iframe1");
		webtest.typeAndClear("id=fm[2][title]", "iframe_2标题3");
		webtest.selectByValue("id=fm[2][color]", "000");
		webtest.click("name=bsend");
		webtest.alertAccept();
		webtest.leaveFrame();
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='内页推送']");
		
	}
}
