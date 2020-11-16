package www.ourhouse.testng_xslt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;


@SuppressWarnings("unchecked")
public class JavaMailTestListener extends TestListenerAdapter{


	private String getHtmlByPageName(String pageName) throws IOException,  InterruptedException {
	    // /BOOT-INF/classes/templates/dashboard.html
		Thread.sleep(10000);
		System.out.println("等待");
	    String path = "H:\\project training\\ourhouse Project\\ourhouse\\test-output\\reports\\" + pageName + ".html";
	    // 返回读取指定资源的输入流
	    FileInputStream is=new FileInputStream(path);
	    BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
	    String s = "";
	    StringBuffer stringBuffer = new StringBuffer();
	    while ((s = br.readLine()) != null) {
	        stringBuffer.append(s).append("\n");
	    }
	    return stringBuffer.toString();
	}

	@Override
		public void onFinish(ITestContext testContext) {
			// TODO Auto-generated method stub
			super.onFinish(testContext);
			List<String> list = new ArrayList<>();
            list.add("H:\\project training\\ourhouse Project\\ourhouse\\test-output\\reports\\index1.html");
            list.add("H:\\project training\\ourhouse Project\\ourhouse\\test-output\\reports\\overview.html");
            list.add("H:\\project training\\ourhouse Project\\ourhouse\\test-output\\reports\\navigation.html");
            list.add("H:\\project training\\ourhouse Project\\ourhouse\\test-output\\reports\\overview-chart.svg");
            list.add("H:\\project training\\ourhouse Project\\ourhouse\\test-output\\reports\\main.js");
            String string = null;
			try {
				string = getHtmlByPageName("navigation");
				
				
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		try {
				SendMail.send(string, list);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		}
		
}
   
	
