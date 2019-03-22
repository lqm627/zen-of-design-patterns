package com.lqm.pattern.comparison.behavioral.contrast_observer_chainOfResponsibility.chainOfResponsibility;

import com.lqm.pattern.comparison.behavioral.contrast_observer_chainOfResponsibility.Recorder;

public class SHDnsServer extends DnsServer {
    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("上海DNS服务器");
        return recorder;
    }

    //定义上海的DNS服务器能处理的级别
    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".sh.cn");
    }
}
