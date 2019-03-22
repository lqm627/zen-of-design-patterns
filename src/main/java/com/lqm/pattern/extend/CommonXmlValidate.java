package com.lqm.pattern.extend;

public class CommonXmlValidate implements IXmlValidate {
    //XML语法检查，比如是否少写了一个结束标志
    public boolean validate(String xmlPath) {
        return false;
    }
}
