package com.lqm.pattern.extend;

import java.util.Observable;
import java.util.Observer;

public class Checker implements Observer {
    //使用哪一个策略
    private IXmlValidate validate;
    //xml配置文件的路径
    String xmlPath;

    //构造函数传递
    public Checker(IXmlValidate _validate) {
        this.validate = _validate;
    }

    public void setXmlPath(String _xmlPath) {
        this.xmlPath = _xmlPath;
    }

    //检查
    public boolean check() {
        return validate.validate(xmlPath);
    }

    public void update(Observable arg0, Object arg1) {
        //检查是否符合条件
        arg1 = check();
    }
}
