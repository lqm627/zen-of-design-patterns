package com.lqm.pattern.comparison.behavioral.contrast_observer_chainOfResponsibility.observer;

import com.lqm.pattern.comparison.behavioral.contrast_observer_chainOfResponsibility.Recorder;

public class TopDnsServer extends DnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("全球顶级DNS服务器");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        //所有的域名最终的解析地点
        return true;
    }
}
