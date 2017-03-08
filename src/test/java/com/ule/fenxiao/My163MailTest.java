package com.ule.fenxiao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.velocity.VelocityEngineUtils;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zongruibiao on 2017/3/2.
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class My163MailTest {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String username;

    //@Test
    public void testSendSimple() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(username);
        message.setTo("975525361@qq.com");
        message.setSubject("标题：测试标题");
        message.setText("测试内容部份");


        javaMailSender.send(message);
    }

    //@Test
    public void sendAttachmentsMail() throws Exception {

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(username);
        helper.setTo("975525361@qq.com");
        helper.setSubject("主题：有附件;嵌入静态资源");
        helper.setText("有附件的邮件;嵌入静态资源");
        helper.setText("<html><body><img src=\"cid:weixin\" ></body></html>", true);

        FileSystemResource file = new FileSystemResource(new File("D:/weixin.jpg"));
       // helper.addAttachment("附件-1.jpg", file);
        //这里需要注意的是 addInline 函数中资源名称 weixin 需要与正文中 cid:weixin 对应起来
        helper.addInline("weixin", file);
        javaMailSender.send(mimeMessage);
    }

    //@Test
    public void sendTemplateMail() throws Exception {

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(username);
        helper.setTo("975525361@qq.com");
        helper.setSubject("主题：模板邮件");

        Map<String, Object> model =new HashMap<String, Object>();
        model.put("name", "didi");
        //String text = VelocityEngineUtils.mergeTemplateIntoString(VelocityEngine, "template.html", "UTF-8", model);
        //helper.setText(text, true);

        javaMailSender.send(mimeMessage);
    }
}
