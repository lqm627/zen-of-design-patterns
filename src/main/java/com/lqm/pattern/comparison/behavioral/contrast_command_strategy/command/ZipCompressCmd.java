package com.lqm.pattern.comparison.behavioral.contrast_command_strategy.command;

public class ZipCompressCmd extends AbstractCmd {
    public boolean execute(String source,String to) {
        return super.zip.compress(source, to);
    }
}
