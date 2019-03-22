package com.lqm.pattern.comparison.structure.contrast_adapter_decorator.adapter;

public class BeautifyAppearance extends Decorator {
    //要美化谁
    public BeautifyAppearance(Swan _swan){
        super(_swan);
    }
    //外表美化处理
    @Override
    public void desAppearance(){
        System.out.println("外表是纯白色的，非常惹人喜爱！");
    }
}
