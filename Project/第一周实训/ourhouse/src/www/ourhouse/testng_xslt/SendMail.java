package www.ourhouse.testng_xslt;



import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import com.webtest.utils.ReadProperties;

public class SendMail {
	


	public static void send(String string,List<String> list) throws IOException {
		String sender=ReadProperties.getPropertyValue("sender");
		//授权码
		String auth_code=ReadProperties.getPropertyValue("auth_code");
		String to=ReadProperties.getPropertyValue("tomail");
		Properties props = new Properties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.host", "smtp.qq.com");
		props.put("mail.smtp.auth", true);
		
		// 1、构造Session对象（邮件会话对象），设置服务器，授权码，需要Properties对象
		Session session = Session.getInstance(props, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(sender, auth_code);
			}

		});

		// 2、创建邮件，创建Message对象，子类 MimeMessage
		// 设置发件人、收件人、主题、正文
		Message message = new MimeMessage(session);
		try {

			message.setFrom(new InternetAddress(sender));
//			for (int i = 0; i < toarray.length; i++) {
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//				message.setSubject("hello！");
//				message.setText(text);
				
				
				
				
				// 设置邮件消息的主题
	            message.setSubject("测试文件");
	            // 设置邮件消息发送的时间
	            message.setSentDate(Calendar.getInstance().getTime());

	            // MimeMultipart类是一个容器类，包含MimeBodyPart类型的对象
	            Multipart multiPart = new MimeMultipart();
	            // 创建一个包含HTML内容的MimeBodyPart
	            BodyPart bodyPart = new MimeBodyPart();
	            // 设置html邮件消息内容
	            bodyPart.setContent(string, "text/html; charset=utf-8");
	            multiPart.addBodyPart(bodyPart);

	            //添加附件
	            
	            
	                for(int i=0;i<list.size();i++){
	                    bodyPart=new MimeBodyPart();  
	                    FileDataSource fds=new FileDataSource(list.get(i)); //得到数据源  
	                    bodyPart.setDataHandler(new DataHandler(fds)); //得到附件本身并放入BodyPart  
	                    bodyPart.setFileName(MimeUtility.encodeText(fds.getName()));  //得到文件名并编码（防止中文文件名乱码）同样放入BodyPart  
	                    multiPart.addBodyPart(bodyPart);  
	                
	            }

	            // 设置邮件消息的主要内容
	            message.setContent(multiPart);
				// 3、发送邮件
				Transport.send(message);
				System.out.println("发送完毕");
//			}

		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	

}
