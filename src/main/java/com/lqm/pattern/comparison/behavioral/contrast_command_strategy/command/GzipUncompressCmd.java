package com.lqm.pattern.comparison.behavioral.contrast_command_strategy.command;

public class GzipUncompressCmd extends AbstractCmd {
    public boolean execute(String source,String to) {
        return super.gzip.uncompress(source, to);
    }
}
