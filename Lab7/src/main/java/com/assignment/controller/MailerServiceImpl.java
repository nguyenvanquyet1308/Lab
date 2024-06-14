package com.assignment.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;

import com.assignment.entity.MailInfo;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Configuration
public class MailerServiceImpl implements MailerService {

	@Autowired
	JavaMailSender sender;

	@Override
	public void send(MailInfo mail) throws MessagingException {
		// TODO Auto-generated method stub
		// Tạo message
		MimeMessage message = sender.createMimeMessage();
		// Sử dụng Helper để thiết lập các thông tin cần thiết cho message
		MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
		helper.setFrom(mail.getFrom());
		helper.setTo(mail.getTo());
		helper.setSubject(mail.getSubject());
		helper.setText(mail.getBody(), true);
		helper.setReplyTo(mail.getFrom());
		String[] cc = mail.getCc();
		if (cc != null && cc.length > 0) {
			helper.setCc(cc);
		}
		String[] bcc = mail.getBcc();
		if (bcc != null && bcc.length > 0) {
			helper.setBcc(bcc);
		}
		String[] attachments = mail.getAttachments();
		if (attachments != null && attachments.length > 0) {
			for (String path : attachments) {
				File file = new File(path);
				helper.addAttachment(file.getName(), file);
			}
		}
		// Gửi message đến SMTP server
		sender.send(message);

	}

	@Override
	public void send(String to, String subject, String body) throws MessagingException {
		MailInfo mailInfo = new MailInfo();
		mailInfo.setFrom("quyetnvpd07712@fpt.edu.vn");
		mailInfo.setTo(to);
		mailInfo.setSubject(subject);
		mailInfo.setBody(body);
		send(mailInfo);

	}

	List<MailInfo> list = new ArrayList<>();

	public void queue(MailInfo mail) {
		list.add(mail);
	}

	public void queue(String to, String subject, String body) {
		queue(new MailInfo(to, subject, body));
	    run();
		
	}

	@Scheduled(fixedDelay = 5000)
	public void run() {
		while (!list.isEmpty()) {
			MailInfo mail = list.remove(0);
			try {
				this.send(mail);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}



}
