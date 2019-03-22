package com.lqm.pattern.mixed.chainOfResponsibility_command_template_Iterator;

public class LSCommand extends Command {
    public String execute(CommandVO vo) {
        //返回链表的首节点
        CommandName firstNode = super.buildChain(AbstractLS.class).get(0);
        return firstNode.handleMessage(vo);
    }
}
