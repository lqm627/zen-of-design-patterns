package com.lqm.pattern.comparison.behavioral.contrast_observer_chainOfResponsibility.chainOfResponsibility;

import com.lqm.pattern.comparison.behavioral.contrast_observer_chainOfResponsibility.Recorder;

public class TopDnsServer extends DnsServer {
    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("全球顶级DNS服务器");
        return recorder;
    }

    @Override
    protected boolean isLocal(String domain) {
        //所有的域名最终的解析地点
        return true;
    }
}
