package com.lqm.pattern.mixed.factory_strategy_facade;

public class SteadyDeduction implements IDeduction {
    //固定性交易扣款
    public boolean exec(Card card, Trade trade) {
        //固定金额和自由金额各扣除50%
        int halfMoney = (int) Math.rint(trade.getAmount() / 2.0);
        card.setFreeMoney(card.getFreeMoney() - halfMoney);
        card.setSteadyMoney(card.getSteadyMoney() - halfMoney);
        return true;
    }
}
