package com.lqm.pattern.comparison.crossDistrict.contrast_strategy_bridge.strategy;

public class Client {
    public static void main(String[] args) {
        //创建一封TEXT格式的邮件
        MailTemplate m = new HtmlMail("a@a.com","b@b.com","外星人攻击地球了","结局是外星人被地球人打败了！");
        //创建一个Mail发送程序
        MailServer mail = new MailServer(m);
        //发送邮件
        mail.sendMail();
    }
}
