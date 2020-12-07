package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.WebElement;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class TollsTest extends BaseTest{
	//No.25
	@Test(priority = 1)
	public void choseClearCache() {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[2]/a[5]");
		webtest.click("xpath=/html/body/div[3]/div[5]/ul[1]/li[2]/a[1]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[5]/td[2]/input");
		
		assertEquals(webtest.getAlertText(),"更新完成");
		webtest.alertAccept();
		webtest.leaveFrame();
	}
	
	//No.26
	@Test(priority = 2)
	public void createStaticHtml() {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[2]/a[5]");
		webtest.click("xpath=/html/body/div[3]/div[5]/ul[1]/li[2]/a[2]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[3]/td[2]/p/a[1]");
		webtest.enterFrame1("xpath=//*[@id=\"layui-layer-iframe1\"]");
		assertEquals(webtest.getText("xpath=/html/body"), "生成结果:Success");
		webtest.leaveFrame();
	}
	
	//No.27
	@Test(priority = 3)
	public void checkResult() throws InterruptedException {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[2]/a[5]");
		webtest.click("xpath=/html/body/div[3]/div[5]/ul[1]/li[2]/a[2]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[3]/td[2]/p/a[3]");
		Thread.sleep(1000);
//		webtest.switchWidow();
		String[] windowTitles = webtest.getAllWindowTitles();
		assertEquals(windowTitles[1], "功能演示版 - 爱窝房产");
	}
}
