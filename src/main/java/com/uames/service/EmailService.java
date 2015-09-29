package com.uames.service;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.uames.util.Configer;

public class EmailService {
	

	/**
	 * 发送邮件服务
	 * @param url
	 * @param email
	 * @throws Exception
	 */
	public static void send(String title,String content, String to) 
			throws Exception {
		 
		//读取邮箱账户和密码
		String smtp = Configer.getInstance().getProperty("smtp_host");
		String account = Configer.getInstance().getProperty("email");
		String password = Configer.getInstance().getProperty("email_pwd");

		Properties props = new Properties();
		props.put("mail.smtp.host", smtp);
	 	props.put("mail.smtp.auth", "true");
	 	
	 	//基本的邮件会话
	 	Session session = Session.getInstance(props);
	 	//构造信息体
		 MimeMessage message = new MimeMessage(session); 
		 //发件地址
		 Address address = new InternetAddress(account);
		 message.setFrom(address);
		 //收件地址
		 Address toAddress = new InternetAddress(to);
		 message.setRecipient(MimeMessage.RecipientType.TO, toAddress);
		 
		 //主题
		 message.setSubject(title);
		 //正文
		 String htmlBody = content;
		 //声明多媒体对象
		 Multipart mp = new MimeMultipart();
		 MimeBodyPart htmlPart = new MimeBodyPart();
		 htmlPart.setContent(htmlBody, "text/html;charset=utf-8");
		 //多媒体对象添加html内容
		 mp.addBodyPart(htmlPart);
		 //message对象设置html内容
		 message.setContent(mp);		
		 message.saveChanges(); 
		 session.setDebug(true);
		 Transport transport = session.getTransport("smtp");
		 transport.connect(smtp, account, password);
		 //发送
		 transport.sendMessage(message, message.getAllRecipients());
		 transport.close(); 
		 return;
	}

}
