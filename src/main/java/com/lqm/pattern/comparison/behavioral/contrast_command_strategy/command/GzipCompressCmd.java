package com.lqm.pattern.comparison.behavioral.contrast_command_strategy.command;

public class GzipCompressCmd extends AbstractCmd {
    public boolean execute(String source,String to) {
        return super.gzip.compress(source, to);
    }
}
