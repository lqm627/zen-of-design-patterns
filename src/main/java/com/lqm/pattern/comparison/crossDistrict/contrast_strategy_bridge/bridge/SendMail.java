package com.lqm.pattern.comparison.crossDistrict.contrast_strategy_bridge.bridge;

public class SendMail extends MailServer {
    //传递一封邮件
    public SendMail(MailTemplate _m) {
        super(_m);
    }

    //修正邮件发送程序
    @Override
    public void sendMail() {
        //增加邮件服务器信息
        super.m.add("Received: (sendmail); 7 Nov 2009 04:14:44 +0100");
        super.sendMail();
    }
}
