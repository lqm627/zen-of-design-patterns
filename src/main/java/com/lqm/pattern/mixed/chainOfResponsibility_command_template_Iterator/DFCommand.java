package com.lqm.pattern.mixed.chainOfResponsibility_command_template_Iterator;

public class DFCommand extends Command {
    public String execute(CommandVO vo) {
        return super.buildChain(AbstractDF.class).get(0).handleMessage(vo);
    }
}
