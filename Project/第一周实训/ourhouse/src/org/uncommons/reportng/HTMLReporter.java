package org.uncommons.reportng;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

import com.webtest.mail.MailUtil;

public class HTMLReporter extends TestListenerAdapter {
	@Override
	public void onFinish(ITestContext testContext) {
		super.onFinish(testContext);
		String string;
		try {
			string = getHtmlByPageName("overview");
			MailUtil.TOmail(string);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private String getHtmlByPageName(String pageName) throws IOException {
	    // /BOOT-INF/classes/templates/dashboard.html
	    String path = "H:\\project training\\ourhouse Project\\ourhouse\\test-output\\html\\" + pageName + ".html";
	    // 返回读取指定资源的输入流
//	    InputStream is = this.getClass().getResourceAsStream(path);
	    FileInputStream is=new FileInputStream(path);
	    BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
	    String s = "";
	    StringBuffer stringBuffer = new StringBuffer();
	    while ((s = br.readLine()) != null) {
	        stringBuffer.append(s).append("\n");
	    }
	    return stringBuffer.toString();
	}
}
