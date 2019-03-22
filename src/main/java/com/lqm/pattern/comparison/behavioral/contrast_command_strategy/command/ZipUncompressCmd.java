package com.lqm.pattern.comparison.behavioral.contrast_command_strategy.command;

public class ZipUncompressCmd extends AbstractCmd {
    public boolean execute(String source,String to) {
        return super.zip.uncompress(source, to);
    }
}
