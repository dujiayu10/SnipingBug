package com.webtest.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;
/**
 * ǰ̨-gmy*/
public class Front_Login extends BaseTest{
	@Test
	public void front_login() throws InterruptedException, IOException{	
		//��¼
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
	}
}
