package com.lqm.pattern.extend;

import java.util.Map;

public class JspView extends AbsView {
    //传递语言配置
    public JspView(AbsLangData _langData) {
        super(_langData);
    }

    @Override
    public void assemble() {
        Map<String, String> langMap = getLangData().getItems();
        for (String key : langMap.keySet()) {
/*
* 直接替换文件中的语言条目
*
*/
        }
    }
}
