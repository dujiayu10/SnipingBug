package com.webtest.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * 
 * 前台-楼盘-我要按钮--gmy
 * */
public class LinkTest extends Front_Login{
	//点击楼盘动态更多链接，看是否跳转
	@Test
	public void test_developmentslink() throws InterruptedException, IOException{	
		//点击楼盘
		webtest.click("xpath=//*[text()='楼盘']");
		Thread.sleep(1000);
		//点击第n个房产信息
		webtest.sclick("class=img-thumbnail", "1");
		Thread.sleep(3000);
		String develop=webtest.getText("class=navbar-brand");
		//点击第n个房产信息的楼盘动态的更多信息
		webtest.click("xpath=/html/body/div/div[3]/div[1]/h3[1]/a");
		Thread.sleep(3000);
		//判断页面是否跳转
		assertTrue(webtest.isTextPresent(develop+" 楼盘动态"));
	}
	//点击楼盘户型更多链接，看是否跳转
	@Test
	public void test_housetypelink() throws InterruptedException, IOException{	
		//点击楼盘
		webtest.click("xpath=//*[text()='楼盘']");
		Thread.sleep(1000);
		//点击第n个房产信息
		webtest.sclick("class=img-thumbnail", "2");
		Thread.sleep(3000);
		//点击第n个房产信息的楼盘户型的更多信息
		webtest.click("xpath=/html/body/div/div[3]/div[1]/h3[2]/a");
		Thread.sleep(3000);
		//判断页面是否跳转
		assertTrue(webtest.isTextPresent("户型筛选"));
	}
	//点击出售房更多链接，看是否跳转
	@Test
	public void test_houseforsale() throws InterruptedException, IOException{	
		//点击楼盘
		webtest.click("xpath=//*[text()='楼盘']");
		Thread.sleep(1000);
		//点击第n个房产信息
		webtest.sclick("class=img-thumbnail", "3");
		Thread.sleep(3000);
		String develop=webtest.getText("class=navbar-brand");
		//点击第n个房产信息的出售房的更多信息
		webtest.click("xpath=/html/body/div/div[6]/div[1]/h3/a");
		Thread.sleep(3000);
		//判断页面是否跳转
		assertTrue(webtest.isTextPresent(develop+" 楼盘 的出售房"));
	}
	//点击出租房更多链接，看是否跳转
	@Test
	public void test_houseforrent() throws InterruptedException, IOException{	
		//点击楼盘
		webtest.click("xpath=//*[text()='楼盘']");
		Thread.sleep(1000);
		//点击第n个房产信息
		webtest.sclick("class=img-thumbnail", "0");
		Thread.sleep(3000);
		String develop=webtest.getText("class=navbar-brand");
		//点击第n个房产信息的出租房的更多信息
		webtest.click("xpath=/html/body/div/div[6]/div[2]/h3/a");
		Thread.sleep(3000);
		//判断页面是否跳转
		assertTrue(webtest.isTextPresent(develop+" 楼盘 的出租房"));
	}
}
