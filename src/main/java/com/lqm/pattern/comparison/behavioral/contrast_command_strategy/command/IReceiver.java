package com.lqm.pattern.comparison.behavioral.contrast_command_strategy.command;

public interface IReceiver {
    //压缩
    public boolean compress(String source,String to);
    //解压缩
    public boolean uncompress(String source,String to);
}
