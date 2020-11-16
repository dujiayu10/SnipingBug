package com.webtest.freemarker;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.webtest.mail.MailUtil;

import freemarker.template.*;
import net.bytebuddy.description.field.FieldDescription.InGenericShape;
import net.bytebuddy.implementation.bind.annotation.Super;

public class GenerateReporter  implements IReporter  {
	private String getHtmlByPageName(String pageName) throws IOException {
	    // /BOOT-INF/classes/templates/dashboard.html
	    String path = "H:\\project training\\ourhouse Project\\ourhouse\\target\\" + pageName + ".html";
	    // ���ض�ȡָ����Դ��������
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
    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
                               String outputDirectory)  {
        // TODO Auto-generated method stub
        try {
            //freemaker������
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
            cfg.setClassForTemplateLoading(this.getClass(),"/templates");
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            //freemaker��ģ���ļ�
            Template temp = cfg.getTemplate("overview.ftl");

            Map context = new HashMap();


            for (ISuite suite : suites) {
                Map<String, ISuiteResult> suiteResults = suite.getResults();
                for (ISuiteResult suiteResult : suiteResults.values()) {
                    ReporterData data = new ReporterData();
                    ITestContext testContext = suiteResult.getTestContext();
                    // ����������������
                    context.put("overView", data.testContext(testContext));//���Խ��������Ϣ
                    //ITestNGMethod[] allTests = testContext.getAllTestMethods();//���еĲ��Է���
                    //Collection<ITestNGMethod> excludeTests = testContext.getExcludedMethods();//δִ�еĲ��Է���
                    IResultMap passedTests = testContext.getPassedTests();//����ͨ���Ĳ��Է���
                    IResultMap failedTests = testContext.getFailedTests();//����ʧ�ܵĲ��Է���
                    IResultMap skippedTests = testContext.getSkippedTests();//���������Ĳ��Է���

                    context.put("pass", data.testResults(passedTests, ITestResult.SUCCESS));
                    context.put("fail", data.testResults(failedTests, ITestResult.FAILURE));
                    context.put("skip", data.testResults(skippedTests, ITestResult.FAILURE));

                }
            }
            System.out.println(context.get("overView").toString());
            // �����
            //Writer writer = new BufferedWriter(new FileWriter("report.html"));
            OutputStream out=new FileOutputStream("target/report.html");
            System.out.println("����html");
            Writer writer = new BufferedWriter(new OutputStreamWriter(out,"utf-8"));//�����������
            // ת�����
            temp.process(context,writer);
            writer.flush();
			String string=getHtmlByPageName("report");
			MailUtil.TOmail(string);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
