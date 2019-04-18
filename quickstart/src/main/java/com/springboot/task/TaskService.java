package com.springboot.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private MailService mailService;

    @Scheduled(cron = "0 58 10 ? * *")
    public void proces(){
        mailService.sendMail("16422802@qq.com","定时邮件测试","朱林杰的定时邮件测试");
        System.out.println("success");
    }
}
