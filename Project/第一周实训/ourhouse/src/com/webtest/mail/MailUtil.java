package com.webtest.mail;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

import com.webtest.utils.ReadProperties;

public class MailUtil {
	
//	发送邮件
	public static void TOmail(String mes)throws IOException {
		String sender=ReadProperties.getPropertyValue("sender");
		//授权码
		String auth_code=ReadProperties.getPropertyValue("auth_code");
		String to=ReadProperties.getPropertyValue("tomail");
//		String[] tomail=to.split(",");
		Properties props=new Properties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.host", "smtp.qq.com");
		props.put("mail.smtp.auth", true);
		
		//1、构造Session对象（邮件会话对象），设置服务器，授权码，需要Properties对象
		Session session=Session.getInstance(props, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(sender, auth_code);
			}
			
		});
	
		//2、创建邮件，创建Message对象，子�? MimeMessage
		//设置发件人收件人、主题正文
		Message message=new MimeMessage(session);
		try {	
			message.setFrom(new InternetAddress(sender));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//			String encodedSubject = MimeUtility.encodeText("美化测试报告——狙击bug", MimeUtility.mimeCharset("gb2312"), null);
			message.setSubject("美化测试报告——狙击bug");
			message.setContent(mes, "text/html;charset=utf-8");//发送读入的html
			message.saveChanges();
		//3、发送邮件
			Transport.send(message,message.getAllRecipients());
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
